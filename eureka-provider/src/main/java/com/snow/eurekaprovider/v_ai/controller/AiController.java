package com.snow.eurekaprovider.v_ai.controller;


import com.snow.eurekaprovider.v_ai.model.AI;
import com.snow.eurekaprovider.v_ai.service.IAIservice;
import com.snow.vo.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ai")
public class AiController {

    @Autowired
    private IAIservice aIservice;

    @RequestMapping("/get")
    public JsonData getAi(Integer aiId) {
        AI obj = aIservice.selectByPrimaryKey(aiId);
        JsonData jd = new JsonData();
        jd.setResult(obj);
        return jd;
    }

    @RequestMapping("/test")
    public String test1(String msg){

        return msg;
    }

}
