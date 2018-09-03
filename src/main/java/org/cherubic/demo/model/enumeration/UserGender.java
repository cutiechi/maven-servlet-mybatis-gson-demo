package org.cherubic.demo.model.enumeration;

/**
 * 用户性别枚举
 *
 * 0 表示男, 1 表示女
 */
public enum UserGender {
    
    MALE(0),
    FEMALE(1);
    
    /**
     * 用户性别
     */
    private Integer userGender;
    
    UserGender (Integer userGender) {
        this.userGender = userGender;
    }
    
    public Integer getUserGender () {
        return userGender;
    }
}
