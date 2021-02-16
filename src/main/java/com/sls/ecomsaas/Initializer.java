package com.sls.ecomsaas;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import com.sls.ecomsaas.entities.Product;
import com.sls.ecomsaas.repositories.ProductRepository;

@Component
public class Initializer implements CommandLineRunner {

	ProductRepository productRepo;
	
	public Initializer(ProductRepository productRepo) {
		this.productRepo = productRepo;
	}
	
	@Override
	public void run(String... args) throws Exception {
		Product p1 = new Product();
		p1.setDescription("p1 product");
		p1.setName("sample p1");
		p1.setPrice(BigDecimal.valueOf(23));
		
		this.productRepo.save(p1);
		
		Product p2 = new Product();
		p2.setDescription("p2 product");
		p2.setName("sample p2");
		p2.setPrice(BigDecimal.valueOf(23));

		this.productRepo.save(p2);
		
		Product p3 = new Product();
		p3.setDescription("p3 product");
		p3.setName("sample p3");
		p3.setPrice(BigDecimal.valueOf(23));

		this.productRepo.save(p3);
		
		
		this.productRepo.findAll(PageRequest.of(0, 2)).forEach(System.out::println);
	}

}