package com.dj.spring_mybatis.service;

import com.dj.spring_mybatis.domain.Student;

import java.util.List;


public interface StudentService {

    /**
     * 查询
     */
    public List<Student> readStudent();


    /**
     * 增加
     */
    public void addStudent(Student student);


    /**
     * 删除
     */
    public void delStudent(Integer id);


    /**
     * 修改
     */
    public void updateStudent(Student student);

}
