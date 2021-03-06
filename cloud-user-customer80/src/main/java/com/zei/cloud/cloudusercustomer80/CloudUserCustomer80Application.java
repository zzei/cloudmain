package com.zei.cloud.cloudusercustomer80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@ComponentScan("com.zei.cloud")
@SpringBootApplication
public class CloudUserCustomer80Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudUserCustomer80Application.class, args);
	}

}
