package com.sls.ecomsaas.entities;

import javax.persistence.Embeddable;
import javax.persistence.Lob;

import lombok.Data;

@Data
@Embeddable
public class ImageBytes {

	@Lob
	private byte[] image;
}
