package com.iot.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iot.entity.CompaniesEntity;

public interface CompanyRepository extends JpaRepository<CompaniesEntity, Serializable> {

}
