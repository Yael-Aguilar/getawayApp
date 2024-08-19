package com.gateawayapp.Gateawys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GateawysApplication {

	public static void main(String[] args) {
		SpringApplication.run(GateawysApplication.class, args);
	}

}
