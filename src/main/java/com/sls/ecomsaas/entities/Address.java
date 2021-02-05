package com.sls.ecomsaas.entities;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Address {
	
	private String city;
	private String state;
	private String country;
	private String street;
	private String pincode;
	private String premise;

}
