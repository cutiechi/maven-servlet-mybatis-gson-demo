package org.cherubic.demo.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public final class MybatisUtils {
    
    private static SqlSessionFactory sqlSessionFactory;
    
    static {
        String resource = "mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        } catch (IOException exception) {
            throw new RuntimeException("get resource fail!");
        }
    }
    
    private MybatisUtils () {
    
    }
    
    public static SqlSessionFactory getSqlSessionFactory () {
        return sqlSessionFactory;
    }
}
