package com.zei.cloud.cloudconfigcustomer.controller;

import com.zei.cloud.service.ConfigFeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {


    @Autowired
    private ConfigFeignClientService configFeignClientService;

    @GetMapping("/test")
    public String test(){
        return configFeignClientService.test();
    }

    @GetMapping("/test2")
    public String test2(){
        return  "asdas";
    }
}


