package com.dj.spring_mybatis;

import com.dj.spring_mybatis.domain.User;
import com.dj.spring_mybatis.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringMybatisApplicationTestsUser {

	@Autowired
	private UserService userService;


	/**
	 * 查询
	 */
	@Test
	public void selUser(){
		List<User> list = userService.selUser();
		for (User user: list) {
			System.out.println(user.getId() + "=============" + user.getUsername());
		}
	}


	/**
	 * 增加
	 */
	@Test
	public void addUser(){
		User user = new User();
		user.setUsername("qsQ");
		userService.addUser(user);
	}

	/**
	 * 修改
	 */
	@Test
	public void updateUser(){
		User user = userService.getUserById(1);
		User user1 = new User();
		user1.setId(1);
		user1.setUsername(user.getUsername());
		userService.updateUser(user1);
	}

	/**
	 * 删除
	 */
	@Test
	public void deleteUser(){
		userService.deleteUser(1);
	}

}
