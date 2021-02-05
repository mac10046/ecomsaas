package com.sls.ecomsaas.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Vendor {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String name;
	private String companyName;
	private String email;
	private String mobile;
	private String snsToken;
	private Address registerdAddress;
	private String identificationNumber; // GST, or registered company license.
	private String identificationType;
	private String logoUrl;

}
