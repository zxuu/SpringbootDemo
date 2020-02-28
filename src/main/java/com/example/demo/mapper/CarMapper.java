package com.example.demo.mapper;

import com.example.demo.entity.Car;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CarMapper {
    @Select("select * from car where entity_name=#{entity_name}")
    public Car selectCarByCarName(String entity_name);

    @Select("select * from car where entity_userName=#{personName}")
    public List<Car> selectCarByPersonName(String personName);

    @Insert("insert into car(entity_name,entity_desc,entity_userName,entity_userPhone) values(#{entity_name},#{entity_desc},#{entity_userName},#{entity_userPhone})")
    public void addCar(Car car);

    @Delete("delete from car where entity_name=#{entity_name}")
    public void deleteUser(String entity_name);

    @Update("update car set entity_name=#{entity_name},entity_desc=#{entity_desc},entity_userName=#{entity_userName},entity_userPhone=#{entity_userPhone}")
    public void updateUser(Car car);
}
