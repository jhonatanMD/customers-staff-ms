package com.customers.ms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customers.ms.model.CustomerEntity;
import com.customers.ms.repository.ICustumerStaffRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerStaffServiceImpl  implements ICustomerStaffService{

	@Autowired
	ICustumerStaffRepository repository;

	@Override
	public Flux<CustomerEntity> allCustomersStaff() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}


	@Override
	public Mono<CustomerEntity> saveCustomer(CustomerEntity customer) {
		// TODO Auto-generated method stub
		return repository.save(customer);
	}

	@Override
	public Mono<CustomerEntity> updCustomer(CustomerEntity customer) {
		// TODO Auto-generated method stub
		return repository.save(customer);
	}

		@Override
	public Mono<Void> dltCustomer(String id) {
		
		return repository.deleteById(id);
	}
}
