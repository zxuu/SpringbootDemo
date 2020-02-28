package com.example.demo.controller;

import com.example.demo.entity.Car;
import com.example.demo.mapper.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {
    @Autowired
    private CarMapper carMapper;

    @RequestMapping(value = "/selectCarByCarName",method = RequestMethod.POST)
    public Car selectUserByCarName(String carName){
        Car car = carMapper.selectCarByCarName(carName);
        return  car;
    }

    @RequestMapping(value = "/selectCarByPersonName",method = RequestMethod.POST)
    public List<Car> selectUserByPersonName(String personName){
        return carMapper.selectCarByPersonName(personName);
    }

    @RequestMapping(value = "/addCar",method = RequestMethod.POST)
    public void addUser(Car car){
        carMapper.addCar(car);
    }

    @RequestMapping(value = "/deleteCar",method = RequestMethod.POST)
    public void deleteUser(String carName){
        carMapper.deleteUser(carName);
    }

    @RequestMapping(value = "/updateCar",method = RequestMethod.POST)
    public void updateUser(Car car){
        carMapper.updateUser(car);
    }
}
