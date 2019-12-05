package com.customers.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customers.ms.model.CustomerEntity;
import com.customers.ms.service.CustomerStaffServiceImpl;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api")
public class RestControllerCustomers {
	@Autowired
	CustomerStaffServiceImpl implCustomer;
	
	@GetMapping("/getCustomers")
	public Flux<CustomerEntity> getCustomers(){
		return implCustomer.allCustomersStaff();
	}
	
	
	@PostMapping("/postCustomer")
	public Mono<CustomerEntity> postCustomer(@RequestBody final CustomerEntity customer){
		return implCustomer.saveCustomer(customer);
	}
	
	@PutMapping("/updCustomer")
	public Mono<CustomerEntity> updCustomer(@RequestBody final CustomerEntity customer){
		return implCustomer.updCustomer(customer);
	}
	
	
	@DeleteMapping("/dltCustomer/{id}")
	public Mono<Void> dltCustomer(@PathVariable String id){
		return implCustomer.dltCustomer(id);
	}
}
