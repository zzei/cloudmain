package com.zei.cloud.cloudusercustomer80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CloudUserCustomer80Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudUserCustomer80Application.class, args);
	}

}
