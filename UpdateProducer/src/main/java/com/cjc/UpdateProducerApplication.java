package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class UpdateProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpdateProducerApplication.class, args);
	}

}
