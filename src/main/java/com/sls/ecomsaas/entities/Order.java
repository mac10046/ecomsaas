package com.sls.ecomsaas.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
@Entity
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORDER_SEQ")
	private Long id;
	@OneToOne
	private Customer customer;
	private LocalDateTime date;
	private BigDecimal amount;
	private Address shippingAddress;
	private Address billingAddress;
	@OneToMany
	private Set<OrderDetails> items = new HashSet<OrderDetails>();
	private OrderStatus status;
	private String trackingId;
	
	@OneToOne
	private Shipper shipper;
}
