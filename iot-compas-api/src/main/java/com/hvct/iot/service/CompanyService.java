package com.hvct.iot.service;

import java.util.List;

import com.hvct.iot.binding.Company;

public interface CompanyService {

	public String createCompany(Company company);

	public List<Company> getAllCompaniesDetails();

}
