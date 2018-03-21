package com.dj.spring_mybatis.mapper;

import com.dj.spring_mybatis.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


public interface UserMapper {


    /**
     * 查询
     * @return
     */
    @Select("SELECT * FROM user")
    public List<User> selUser();

    @Select("SELECT * FROM user WHERE id = #{id}")
    public List<User> selUsers(Integer id);

    /**
     * 增加
     * @param user
     */
    @Insert("INSERT INTO user(username) VALUES (#{username})")
    public void addUser(User user);


    @Select("SELECT * FROM user WHERE id = #{id}")
    public User getUserById(Integer id);

    /**
     * 修改
     * @param user
     */
    @Update("UPDATE user SET username = #{username} WHERE id = #{id}")
    public void updateUser(User user);

    /**
     * 删除
     * @param id
     */
    @Delete("DELETE FROM user WHERE id = #{id}")
    public void deleteUser(Integer id);
}
