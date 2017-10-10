package com.cloud.frame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class EurekaServiceZuulApplication {
	//http://localhost:10007/api-a/hi?name=elvin&token=11
	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceZuulApplication.class, args);
	}
}
