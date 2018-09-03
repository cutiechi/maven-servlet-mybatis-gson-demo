package org.cherubic.demo.service;

import org.cherubic.demo.model.dto.ServiceResult;
import org.cherubic.demo.model.entity.User;

import java.util.List;

public interface UserService {
    
    /**
     * 获取全部用户列表
     */
    ServiceResult<List<User>> listAll ();
}
