package com.sls.ecomsaas.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Vendor {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	Long id;
	String name;
	String companyName;
	String email;
	String mobile;
	String snsToken;
	@OneToOne(cascade = CascadeType.ALL)
	Address registerdAddress;
	String identificationNumber; // GST, or registered company license.
	String identificationType;
	String logoUrl;

}
