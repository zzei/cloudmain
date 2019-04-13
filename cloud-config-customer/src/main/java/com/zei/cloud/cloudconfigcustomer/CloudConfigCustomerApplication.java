package com.zei.cloud.cloudconfigcustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients(basePackages = {"com.zei.cloud"})
@EnableEurekaClient
@ComponentScan("com.zei.cloud")
@SpringBootApplication
public class CloudConfigCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigCustomerApplication.class, args);
	}

}
