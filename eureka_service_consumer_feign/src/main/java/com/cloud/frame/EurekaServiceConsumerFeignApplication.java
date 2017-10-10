package com.cloud.frame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@EnableHystrixDashboard
@EnableCircuitBreaker
public class EurekaServiceConsumerFeignApplication {
    //http://localhost:10006/hi?name=testUserForConsumerFeign
	//http://localhost:10006/hystrix
	//http://localhost:10006/hystrix.stream
	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceConsumerFeignApplication.class, args);
	}
}
