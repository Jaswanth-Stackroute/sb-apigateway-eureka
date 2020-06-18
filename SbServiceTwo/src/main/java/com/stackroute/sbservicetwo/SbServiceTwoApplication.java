package com.stackroute.sbservicetwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
Annotate this class with the following annotations:
1. @SpringBootApplication - enables Spring Boot auto config and component scanning.
2. @EnableDiscoveryClient - enables this application as Discovery Client in Service Discovery
*/

@SpringBootApplication
@EnableDiscoveryClient
public class SbServiceTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbServiceTwoApplication.class, args);
	}

}
