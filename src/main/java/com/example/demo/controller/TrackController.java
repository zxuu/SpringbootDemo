package com.example.demo.controller;

import com.example.demo.entity.Car;
import com.example.demo.entity.Track;
import com.example.demo.mapper.TrackMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrackController {
    @Autowired
    private TrackMapper trackMapper;

    @RequestMapping(value = "/addTrack",method = RequestMethod.POST)
    public void addUser(Track track){
        trackMapper.addTrack(track);
    }
}
