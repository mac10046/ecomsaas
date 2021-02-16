package com.sls.ecomsaas.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sls.ecomsaas.entities.Customer;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {

}
