package com.zei.cloud.service;

import com.zei.cloud.entity.UserEntity;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("USER-PROVIDE8001")
//@FeignClient(value = "USER-PROVIDE8001",fallbackFactory = FeignClientServiceFallbackFactory.class)
public interface FeignClientService {

    @PostMapping(value = "/add")
    public int add(UserEntity userEntity);

    @GetMapping(value = "/get/{id}")
    public UserEntity get(@PathVariable("id") int id);

    @GetMapping(value = "/findAll")
    public List<UserEntity> findAll();

}
