package com.hvct.iot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hvct.iot.binding.Company;
import com.hvct.iot.service.CompanyService;

@Controller
public class CompanyRestApi {

	@Autowired
	private CompanyService companyService;

	@PostMapping("/company")
	public ResponseEntity<String> createCompanyData(@RequestBody Company company) {
		String createCompany = companyService.createCompany(company);
		return new ResponseEntity<>(createCompany, HttpStatus.OK);
	}

	@GetMapping("/company")
	public ResponseEntity<List<Company>> getAllCompanies() {
		List<Company> details = companyService.getAllCompaniesDetails();
		return new ResponseEntity<>(details, HttpStatus.OK);

	}

}
