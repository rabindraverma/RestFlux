package com.hvct.dmi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hvct.dmi.entity.CompaniesEntity;

public interface CompaniesRepository extends JpaRepository<CompaniesEntity, Serializable> {

}
