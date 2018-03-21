package com.dj.spring_mybatis.controller;

import com.dj.spring_mybatis.domain.User;
import com.dj.spring_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询
     * @return
     */
    /*@RequestMapping("selUser")
    @ResponseBody
    public List<User> selUser(){
        return userService.selUser();
    }*/

    @RequestMapping("selUser")
    public String selUser(Model model){
        List<User> user = userService.selUser();
        model.addAttribute("user" , user);
        return"index";
    }

    @RequestMapping("selUsers")
    @ResponseBody
    public List<User> selUsers(Integer id){
        return userService.selUsers(id);
        /*return "1233";*/
    }

    /**
     * 增加
     * @param user
     * @return
     */
    @RequestMapping("addUser")
    @ResponseBody
    public String addUser(User user){
        userService.addUser(user);
        return "ok";
    }

    /**
     * 修改
     * @param user
     * @return
     */
    @RequestMapping("updateUser")
    @ResponseBody
    public String updateUser(User user){
        userService.updateUser(user);
        return "ok";
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("deleteUser")
    @ResponseBody
    public String deleteUser(Integer id){
        userService.deleteUser(id);
        return "ok";
    }

    /*@RequestMapping("getUserById")
    public User getUserById(Integer id){
        User user = userService.getUserById(id);
        return user;
    }*/




}
