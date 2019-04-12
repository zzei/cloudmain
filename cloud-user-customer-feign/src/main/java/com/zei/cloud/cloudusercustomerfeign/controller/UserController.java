package com.zei.cloud.cloudusercustomerfeign.controller;

import com.zei.cloud.entity.UserEntity;
import com.zei.cloud.service.FeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UserController {

    //    private static final String REST_URL_PREFIX = "http://localhost:8001";
//    private static final String REST_URL_PREFIX = "http://user-provide8001";


    @Autowired
    private FeignClientService feignClientService;

    @PostMapping("/customer/add")
    public boolean add(UserEntity userEntity) {

        return feignClientService.add(userEntity)==1;
    }

    @GetMapping("/customer/get/{id}")
    public UserEntity get(@PathVariable("id") int id) {
        return feignClientService.get(id);
    }

    @GetMapping("/customer/findAll")
    public List<UserEntity> findAll() {
        return feignClientService.findAll();
    }
}