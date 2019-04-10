package com.zei.cloud.clouduserprovide8001.mapper;

import com.zei.cloud.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    @Insert("insert into user(name,account,password) values(#{name},#{account},#{password})")
    public int add(UserEntity userEntity);

    @Select("select * from user where id = #{id}")
    public UserEntity get(int id);

    @Select("select * from user")
    public List<UserEntity> findAll();
}
