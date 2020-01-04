package com.snow.eurekaconsumer.v_statis.controller;

import com.snow.eurekaconsumer.v_statis.model.UserVo;
import com.snow.eurekaconsumer.v_statis.service.StatisFeigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private StatisFeigin statisFeigin;

    @RequestMapping("/userNumber")
    public String userNumber(UserVo userVo){
        String list = statisFeigin.userNumber(userVo);
        return list;
    }
}
