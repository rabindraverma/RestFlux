package com.hvct.dmi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.client.WebClient;

import com.hvct.dmi.entity.CompaniesEntity;
import com.hvct.dmi.repository.CompaniesRepository;

@Controller
public class DataMartController {

	@Autowired
	private CompaniesRepository companyRepo;

	private static final String REST_URL = "http://localhost:9090/company";

	@GetMapping("/all")
	public ResponseEntity<List<CompaniesEntity>> getAllCompanies() {
		List<CompaniesEntity> companies = new ArrayList<>();
		WebClient webClient = WebClient.create();
		CompaniesEntity[] block = webClient.get().uri(REST_URL).retrieve().bodyToMono(CompaniesEntity[].class).log()
				.block();
		for (CompaniesEntity companiesEntity : block) {
			companies.add(companiesEntity);
		}
		
		companyRepo.saveAll(companies);
		
		companies.forEach(com -> {
			System.out.println(com);
		});
		return new ResponseEntity<>(companies, HttpStatus.OK);
	}

}
