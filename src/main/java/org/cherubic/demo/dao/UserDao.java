package org.cherubic.demo.dao;

import org.cherubic.demo.model.entity.User;

import java.util.List;

public interface UserDao {
    
    /**
     * 获取全部用户列表
     *
     * @return 全部用户列表
     */
    List<User> listAll ();
}
