package com.data.mart.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name = "COMPANY_DETAILS_datamart")
@ToString
public class CompaniesEntity {

	@Id
	private Integer id;
	private String name;
	private String description;
	
	

}
