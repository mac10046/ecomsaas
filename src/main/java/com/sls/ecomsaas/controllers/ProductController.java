package com.sls.ecomsaas.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sls.ecomsaas.entities.Product;
import com.sls.ecomsaas.repositories.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {

	private ProductRepository productRepo;

	public ProductController(ProductRepository productRepo) {
		this.productRepo = productRepo;
	}

	@GetMapping("/")
	private Page<Product> getProducts(Pageable page) {
		return this.productRepo.findAll(page);
	}
}
