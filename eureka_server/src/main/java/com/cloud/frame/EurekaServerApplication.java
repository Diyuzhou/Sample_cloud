package com.cloud.frame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
    //http://localhost:10001
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
