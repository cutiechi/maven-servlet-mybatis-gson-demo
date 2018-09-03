package org.cherubic.demo.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import org.cherubic.demo.util.MybatisUtils;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class UserDaoTests {

    private static SqlSession sqlSession;
    private static UserDao userDao;
    
    @BeforeAll
    static void beforeTest () {
        SqlSessionFactory sqlSessionFactory = MybatisUtils.getSqlSessionFactory();
        sqlSession = sqlSessionFactory.openSession();
        userDao = sqlSession.getMapper(UserDao.class);
    }
    
    @Test
    void testListAll () {
        userDao.listAll().forEach(System.out::println);
    }
    
    @AfterAll
    static void afterTest () {
        sqlSession.close();
    }
}
