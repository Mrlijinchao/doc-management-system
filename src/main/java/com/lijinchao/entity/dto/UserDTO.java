package com.lijinchao.entity.dto;

import lombok.Data;

/**
 * @ClassName UserDTO
 * @Description 注册用户信息
 * @Author lijinchao
 * @Date 2022/12/18 12:56
 * @Version 1.0
 **/
@Data
public class UserDTO {


    private String password;

    private String phone;

    private String mail;

    private boolean male = false;

    private String description;

}
