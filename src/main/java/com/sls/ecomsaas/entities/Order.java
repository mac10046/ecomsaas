package com.sls.ecomsaas.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORDER_SEQ")
//	@GeneratedValue
	Long id;

	@ManyToOne
	Customer customer;
	LocalDateTime date;
	BigDecimal amount;
	@OneToOne(cascade = CascadeType.ALL)
	Address shippingAddress;
	@OneToOne(cascade = CascadeType.ALL)
	Address billingAddress;
	@OneToMany
	Set<OrderDetails> items = new HashSet<OrderDetails>();
	OrderStatus status;
	String trackingId;

	@OneToOne
	Shipper shipper;
}
