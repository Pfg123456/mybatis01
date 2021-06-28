package com.neu.test;

import com.neu.bean.Student;
import com.neu.mapper.StudentMapper;
import com.neu.mapper.impl.StudentMapperImpl;
import org.junit.Before;
import org.junit.Test;

/**
 * @author pangfg
 * @DATE 2021/6/28 - 23:14
 */
public class StudentMapperTest {
    private StudentMapper mapper;

    @Before
    public void before() {
        mapper = new StudentMapperImpl();
    }

    @Test
    public void testInsertStu() {
        Student stu = new Student("李七", 25,94.5);
        mapper.insertStu(stu);
    }
    @Test
    public void testDeleteStu() {
        mapper.deleteStu(17);
    }
}
