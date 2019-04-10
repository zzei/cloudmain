package com.zei.cloud.clouduserprovide8001.service;

import com.zei.cloud.entity.UserEntity;

import java.util.List;

public interface UserService {
    public int add(UserEntity userEntity);

    public UserEntity get(int id);

    public List<UserEntity> findAll();
}
