package com.zei.cloud.entity;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class UserEntity implements Serializable {

    private Integer userId;

    private String name;

    private String account;

    private String password;

}
