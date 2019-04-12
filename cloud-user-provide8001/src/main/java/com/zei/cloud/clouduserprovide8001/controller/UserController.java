package com.zei.cloud.clouduserprovide8001.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zei.cloud.clouduserprovide8001.service.UserService;
import com.zei.cloud.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    UserService userService;

    @PostMapping("/add")
    public boolean add(@RequestBody UserEntity userEntity){

        return userService.add(userEntity)==1;
    }

    @HystrixCommand(fallbackMethod = "getFaild")
    @GetMapping("/get/{id}")
    public UserEntity get(@PathVariable("id") int id){
        if(id == 0){
            throw new RuntimeException();
        }
        return userService.get(id);
    }

    @GetMapping("/findAll")
    public List<UserEntity> findAll(){
        return userService.findAll();
    }


    //服务熔断应急方法
    public UserEntity getFaild(@PathVariable("id") int id){

        return new UserEntity().setUserId(id).setAccount("is no ").setName("this").setPassword(" user!!!");
    }

}
