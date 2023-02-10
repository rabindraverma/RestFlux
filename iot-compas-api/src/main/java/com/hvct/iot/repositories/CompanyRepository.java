package com.hvct.iot.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hvct.iot.entities.CompaniesEntity;

public interface CompanyRepository extends JpaRepository<CompaniesEntity, Serializable> {

}
