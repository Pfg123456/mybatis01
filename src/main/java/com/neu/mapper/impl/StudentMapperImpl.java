package com.neu.mapper.impl;

import com.neu.bean.Student;
import com.neu.mapper.StudentMapper;
import com.neu.utils.mybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


/**
 * @author pangfg
 * @DATE 2021/6/28 - 15:07
 */
public class StudentMapperImpl implements StudentMapper {
    private SqlSession sqlSession;
    @Override
    public void insertStu(Student stu) {
        try {
            sqlSession = mybatisUtil.getSqlSession();
            sqlSession.insert("insertStu", stu);
            sqlSession.commit();
        }finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

    }

    @Override
    public void deleteStu(int id) {
        try {
            sqlSession = mybatisUtil.getSqlSession();
            sqlSession.delete("deleteStu",id);
            sqlSession.commit();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

    }

    @Override
    public void updateStu(Student stu) {
        try {
            sqlSession = mybatisUtil.getSqlSession();
            sqlSession.update("updateStu",stu);
            sqlSession.commit();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

    }

    @Override
    public Student searchOneById(int id) {
        sqlSession = mybatisUtil.getSqlSession();
        Student student=sqlSession.selectOne("searchOneById",id);
        sqlSession.commit();
        if (sqlSession != null) {
            sqlSession.close();
        }
        return student;
    }

    @Override
    public List<Student> searchAll() {
        sqlSession = mybatisUtil.getSqlSession();
        List<Student> students=sqlSession.selectList("searchAll");
        sqlSession.commit();
        if (sqlSession != null) {
            sqlSession.close();
        }
        return students;
    }

    @Override
    public List<Student> searchByName(String name) {
        sqlSession = mybatisUtil.getSqlSession();
        List<Student> students = sqlSession.selectList("searchByName",name);
        sqlSession.commit();
        if (sqlSession != null) {
            sqlSession.close();
        }
        return students;
    }
}
