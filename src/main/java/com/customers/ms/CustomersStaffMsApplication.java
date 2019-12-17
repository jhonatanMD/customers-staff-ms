package com.customers.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CustomersStaffMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomersStaffMsApplication.class, args);
	}

}
