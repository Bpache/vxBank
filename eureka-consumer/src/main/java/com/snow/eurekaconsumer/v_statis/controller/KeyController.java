package com.snow.eurekaconsumer.v_statis.controller;

import com.snow.eurekaconsumer.v_ai.model.AI;
import com.snow.eurekaconsumer.v_statis.model.Keyword;
import com.snow.eurekaconsumer.v_statis.service.StatisFeigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KeyController {
    @Autowired
    private StatisFeigin statisFeigin;

    @RequestMapping("/keylist")
    public String keylist(Keyword keyword){
        String list = statisFeigin.keyList(keyword);
        return list;
    }

    @RequestMapping("/addOrUpdate")
    public String addOrUpdate(Keyword keyword){
        String msg = statisFeigin.addOrUpdate(keyword);
        return msg;
    }
}
