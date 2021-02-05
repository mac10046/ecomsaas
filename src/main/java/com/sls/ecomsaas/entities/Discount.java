package com.sls.ecomsaas.entities;

import java.math.BigDecimal;

import javax.persistence.Embeddable;
import javax.xml.bind.ValidationException;

import lombok.Data;

@Data
@Embeddable
public class Discount {

	private BigDecimal figure;
	private boolean isPercent = false;
	private String description;

	public void validate() throws ValidationException {
		if (isPercent) {
			if (figure.floatValue() > 100.0)
				throw new ValidationException("Discount percentage cannot be greater than 100");
		}
	}

}
