package com.hvct.iot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "COMPANY_DETAILS")
public class CompaniesEntity {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String description;

}
