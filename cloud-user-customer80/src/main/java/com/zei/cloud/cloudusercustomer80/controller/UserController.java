package com.zei.cloud.cloudusercustomer80.controller;

import com.zei.cloud.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UserController {

//    private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://user-provide8001";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/customer/add")
    public boolean add(UserEntity userEntity) {

        return restTemplate.postForObject(REST_URL_PREFIX+"/add",userEntity,Boolean.class);
    }

    @GetMapping("/customer/get/{id}")
    public UserEntity get(@PathVariable("id") int id) {
        System.out.println("--------------"+id);
        return restTemplate.getForObject(REST_URL_PREFIX+"/get/"+id,UserEntity.class);
    }

    @GetMapping("/customer/findAll")
    public List<UserEntity> findAll() {
        return restTemplate.getForObject(REST_URL_PREFIX+"/findAll",List.class);
    }
}
