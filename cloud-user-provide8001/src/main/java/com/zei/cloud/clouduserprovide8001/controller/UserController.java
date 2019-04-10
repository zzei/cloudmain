package com.zei.cloud.clouduserprovide8001.controller;

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

        return userService.add(userEntity)==1?true:false;
    }

    @GetMapping("/get/{id}")
    public UserEntity get(@PathVariable("id") int id){

        return userService.get(id);
    }

    @GetMapping("/findAll")
    public List<UserEntity> findAll(){
        return userService.findAll();
    }

}
