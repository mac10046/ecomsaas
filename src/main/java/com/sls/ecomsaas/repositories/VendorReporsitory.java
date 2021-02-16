package com.sls.ecomsaas.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sls.ecomsaas.entities.Vendor;

public interface VendorReporsitory extends PagingAndSortingRepository<Vendor, Long> {

}
