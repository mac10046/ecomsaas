package com.sls.ecomsaas.entities;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class OrderDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORDER_DETAIL_SEQ")
	private Long id;
	@OneToOne
	private Product product;
	@Column(columnDefinition = "description")
	private String detailsDescription;
	private int quantity;
	private BigDecimal price;
	private String unitOfMeasurement;
	@OneToMany
	private Set<Tax> taxes = new HashSet<Tax>();
	private Discount discount;
}
