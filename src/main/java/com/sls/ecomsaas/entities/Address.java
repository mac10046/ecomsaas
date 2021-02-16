package com.sls.ecomsaas.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String city;
	String state;
	String country;
	String street;
	String pincode;
	String premise;
	String landmark;

}
