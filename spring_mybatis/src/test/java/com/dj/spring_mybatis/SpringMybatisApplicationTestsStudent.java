package com.dj.spring_mybatis;

import com.dj.spring_mybatis.domain.Student;
import com.dj.spring_mybatis.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringMybatisApplicationTestsStudent {

	@Autowired
	private StudentService studentService;



	@Test
	public void readStudent(){
		List<Student> list = studentService.readStudent();
		for (Student student: list) {
			System.out.println(student.getId() + "=============" + student.getName());
		}
	}


	@Test
	public void addStudent(){
		Student student = new Student();
		student.setName("AGGHEAHA9SZZ");
		studentService.addStudent(student);
	}


	@Test
	public void updateStudent(){
		Student student = new Student();
		student.setId(2);
		student.setName("ww");
		studentService.updateStudent(student);
	}

	@Test
	public void delUser(){
		studentService.delStudent(1);
	}

}
