package com.zei.cloud.clouduserprovide8001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableCircuitBreaker
@EnableEurekaClient
@MapperScan("com.zei.cloud.clouduserprovide8001.mapper")
@SpringBootApplication
public class CloudUserProvide8001Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudUserProvide8001Application.class, args);
	}

}
