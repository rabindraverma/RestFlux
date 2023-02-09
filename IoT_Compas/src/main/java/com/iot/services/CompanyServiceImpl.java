package com.iot.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iot.binding.Company;
import com.iot.entity.CompaniesEntity;
import com.iot.repository.CompanyRepository;

@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyRepository companyRepo;

	@Override
	public String createCompany(Company company) {
		CompaniesEntity entity = new CompaniesEntity();
		BeanUtils.copyProperties(company, entity);

		companyRepo.save(entity);

		return "Saved";
	}

	@Override
	public List<CompaniesEntity> getAllCompaniesDetails() {

		return companyRepo.findAll();
	}

}
