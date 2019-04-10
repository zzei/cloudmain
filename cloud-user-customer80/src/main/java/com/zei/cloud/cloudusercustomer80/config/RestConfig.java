package com.zei.cloud.cloudusercustomer80.config;

import com.netflix.loadbalancer.*;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    //选择负载均衡策略
    @Bean
    public IRule muRule(){
        return new RoundRobinRule();    //轮询
//        return new RandomRule();      //随机  
    }
}
