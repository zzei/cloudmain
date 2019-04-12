package com.zei.cloud.service;

import com.zei.cloud.entity.UserEntity;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FeignClientServiceFallbackFactory implements FallbackFactory<FeignClientService>{
    @Override
    public FeignClientService create(Throwable throwable) {
        return new FeignClientService() {
            @Override
            public int add(UserEntity userEntity) {
                return 0;
            }

            @Override
            public UserEntity get(int id) {
                return new UserEntity().setName(throwable.getMessage());
            }

            @Override
            public List<UserEntity> findAll() {
                return null;
            }
        };
    }
}
