package com.neu.mapper;

import com.neu.bean.Student;

import java.util.List;

public interface StudentMapper {
    void deleteStu(int id);
    void updateStu(Student stu);
    void insertStu(Student stu);
    Student searchOneById(int id);
    List<Student> searchAll();
    List<Student> searchByName(String name);
}
