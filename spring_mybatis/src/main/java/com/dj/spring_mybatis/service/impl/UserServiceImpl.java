package com.dj.spring_mybatis.service.impl;

import com.dj.spring_mybatis.domain.User;
import com.dj.spring_mybatis.mapper.UserMapper;
import com.dj.spring_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> selUser() {
        return userMapper.selUser();

    }

    /**
     * 查询
     * @return
     */

    @Override
    public List<User> selUsers(Integer id) {
        return userMapper.selUsers(id);


    }

    /**
     * 增加
     * @param user
     */
    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }


    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    /**
     * 删除
     * @param id
     */
    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteUser(id);
    }

    /**
     * 修改
     * @param user
     */
    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }
}
