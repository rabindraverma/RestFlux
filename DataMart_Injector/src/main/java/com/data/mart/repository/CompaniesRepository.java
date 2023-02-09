package com.data.mart.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.mart.entity.CompaniesEntity;

public interface CompaniesRepository extends JpaRepository<CompaniesEntity, Serializable> {

}
