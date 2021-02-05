package com.sls.ecomsaas.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Tax {
	private Long id;
	private String name;
	private String description;
	private BigDecimal figure;
	private boolean isPercentage;
}
