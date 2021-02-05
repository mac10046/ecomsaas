package com.sls.ecomsaas.entities;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Customer {

	@Id
	private Long id;
	private Vendor vendor;
	private String name;
	private Set<Address> address = new HashSet<Address>();
	private String email;
	private String mobile;
	private String snsToken;
	private Set<Order> orders = new HashSet<Order>();
	private String identificationNumber; // GST, or registered company license.
	private String identificationType;
	
}
