package com.dj.spring_mybatis.service;

import com.dj.spring_mybatis.domain.User;

import java.util.List;


public interface UserService {

    /**
     * 查询
     */
    public List<User> selUser();

    public List<User> selUsers(Integer id);


    /**
     * 增加
     */
    public void addUser(User user);

    public User getUserById(Integer id);


    /**
     * 修改
     */
    public void updateUser(User user);

    /**
     * 删除
     */

    public void deleteUser(Integer id);

}
