package com.cloud.frame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaService11Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaService11Application.class, args);
	}
}
