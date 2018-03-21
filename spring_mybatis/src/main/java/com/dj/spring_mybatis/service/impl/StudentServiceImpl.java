package com.dj.spring_mybatis.service.impl;

import com.dj.spring_mybatis.domain.Student;
import com.dj.spring_mybatis.mapper.StudentMapper;
import com.dj.spring_mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public List<Student> readStudent() {
        return studentMapper.readStudent();
    }

    @Override
    public void addStudent(Student student) {
        studentMapper.addStudent(student);
    }

    @Override
    public void delStudent(Integer id) {
        studentMapper.delStudent(id);
    }

    @Override
    public void updateStudent(Student student) {
        studentMapper.updateStudent(student);
    }
}
