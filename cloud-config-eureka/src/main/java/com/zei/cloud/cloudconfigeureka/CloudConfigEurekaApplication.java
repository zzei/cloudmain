package com.zei.cloud.cloudconfigeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CloudConfigEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigEurekaApplication.class, args);
	}

}
