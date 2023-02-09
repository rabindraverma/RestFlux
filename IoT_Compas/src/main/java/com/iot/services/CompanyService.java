package com.iot.services;

import java.util.List;

import com.iot.binding.Company;
import com.iot.entity.CompaniesEntity;

public interface CompanyService {

	public String createCompany(Company company);

	public List<CompaniesEntity> getAllCompaniesDetails();

}
