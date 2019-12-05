package com.customers.ms.service;

import com.customers.ms.model.CustomerEntity;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICustomerStaffService  {

	Flux<CustomerEntity> allCustomersStaff();
	
	Mono<CustomerEntity> saveCustomer(final CustomerEntity customer);
	
	Mono<CustomerEntity> updCustomer(final CustomerEntity customer);
	
	Mono<Void> dltCustomer(String id);
	
	
}
