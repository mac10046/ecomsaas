package com.sls.ecomsaas.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	Long id;
	String name;
	@OneToMany
	Set<Address> address = new HashSet<Address>();
	String email;
	String mobile;
	String snsToken;
	@OneToMany(mappedBy = "customer", orphanRemoval = true)
	Set<Order> orders = new HashSet<Order>();
	String identificationNumber; // GST, or registered company license.
	String identificationType;

}
