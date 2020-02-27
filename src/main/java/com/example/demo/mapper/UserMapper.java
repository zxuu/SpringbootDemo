package com.example.demo.mapper;


import com.example.demo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by 郭子旭 on 2018/4/12
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where id=#{id}")
    public User selectUserById(int id);

    @Select("select * from user where name=#{name}")
    public List<User> selectUserByName(String name);

    @Insert("insert into user(name,address) values(#{name},#{address})")
    public void addUser(User user);

    @Delete("delete from user where id=#{id}")
    public void deleteUser(int id);

    @Update("update user set name=#{name},address=#{address}")
    public void updateUser(User user);

}