package com.neu.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author pangfg
 * @DATE 2021/6/28 - 20:24
 */
public class mybatisUtil {
    private static SqlSessionFactory sqlSessionFactory;
    public static SqlSession getSqlSession()  {
        try {
            if(sqlSessionFactory==null){
                InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
                sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSessionFactory.openSession();
    }
}
