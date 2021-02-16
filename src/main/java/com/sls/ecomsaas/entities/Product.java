package com.sls.ecomsaas.entities;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String name;
	private String description;
	private BigDecimal price;
	private int minQuantity = 1;

	@Embedded
	private Set<Tax> taxes = new HashSet<Tax>();

	@Embedded
	private Set<ImageBytes> images = new HashSet<ImageBytes>();
}
