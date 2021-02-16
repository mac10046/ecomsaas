package com.sls.ecomsaas.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sls.ecomsaas.entities.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {

}
