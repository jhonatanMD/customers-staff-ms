package com.customers.ms.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.customers.ms.model.CustomerEntity;

@Repository
public interface ICustumerStaffRepository extends ReactiveMongoRepository<CustomerEntity,String> {
	
	

}
