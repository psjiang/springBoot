package com.dj.spring_mybatis.mapper;

import com.dj.spring_mybatis.domain.Student;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

public interface StudentMapper {


    @SelectProvider(type = StudentMapperSQL.class,method = "readStudent")
    public List<Student> readStudent();

    @InsertProvider(type = StudentMapperSQL.class,method = "addStudent")
    public void addStudent(Student student);

    @DeleteProvider(type = StudentMapperSQL.class,method = "delStudent")
    public void delStudent(Integer id);

    @UpdateProvider(type = StudentMapperSQL.class,method = "updateStudent")
    public void updateStudent(Student student);
}
