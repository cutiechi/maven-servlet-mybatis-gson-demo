package org.cherubic.demo.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import org.cherubic.demo.dao.UserDao;
import org.cherubic.demo.model.dto.ServiceResult;
import org.cherubic.demo.model.entity.User;
import org.cherubic.demo.service.UserService;
import org.cherubic.demo.util.MybatisUtils;

import java.util.List;

public class UserServiceImpl implements UserService {
    
    private final UserDao userDao;
    
    public UserServiceImpl () {
        SqlSessionFactory sqlSessionFactory = MybatisUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        userDao = sqlSession.getMapper(UserDao.class);
    }
    
    @Override
    public ServiceResult<List<User>> listAll () {
        return new ServiceResult<>(true, "获取全部用户列表成功", userDao.listAll());
    }
}
