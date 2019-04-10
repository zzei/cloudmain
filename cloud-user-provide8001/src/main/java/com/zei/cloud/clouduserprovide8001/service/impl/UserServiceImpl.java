package com.zei.cloud.clouduserprovide8001.service.impl;

import com.zei.cloud.clouduserprovide8001.mapper.UserMapper;
import com.zei.cloud.clouduserprovide8001.service.UserService;
import com.zei.cloud.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public int add(UserEntity userEntity) {
        return userMapper.add(userEntity);
    }

    @Override
    public UserEntity get(int id) {
        return userMapper.get(id);
    }

    @Override
    public List<UserEntity> findAll() {
        return userMapper.findAll();
    }
}
