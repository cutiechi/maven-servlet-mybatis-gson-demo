package org.cherubic.demo.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.cherubic.demo.model.enumeration.UserGender;

import java.time.LocalDate;

/**
 * 用户
 */
@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
public class User {
    
    /**
     * 用户 ID
     */
    private Integer userId;
    
    /**
     * 用户名称
     */
    private String userName;
    
    /**
     * 用户密码
     */
    private String userPassword;
    
    /**
     * 用户出生日期
     */
    private LocalDate userBirthDate;
    
    /**
     * 用户性别
     */
    private UserGender userGender;
}
