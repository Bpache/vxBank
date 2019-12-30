package com.snow.eurekaconsumer.v_ai.controller;

import com.snow.eurekaconsumer.v_ai.model.AI;
import com.snow.eurekaconsumer.v_ai.service.AiFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ai")
public class AiController {

    @Autowired
    private AiFeign aiFeign;

    @RequestMapping("/list")
    public String list(AI ai){
        String str = aiFeign.list(ai);
        return str;
    }

    @RequestMapping("/add")
    public String add(AI ai){
        String str = aiFeign.add(ai);
        return str;
    }

    @RequestMapping("/del")
    public String del(AI ai){
        String str = aiFeign.del(ai);
        return str;
    }


    @RequestMapping("/edit")
    public String edit(AI ai){
        String str = aiFeign.edit(ai);
        return str;
    }

}
