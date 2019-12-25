package com.snow.eurekaprovider.v_ai.controller;


import com.snow.eurekaprovider.v_ai.model.AI;
import com.snow.eurekaprovider.v_ai.service.IAIservice;
import com.snow.vo.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ai")
public class AiController {

    @Autowired
    private IAIservice aIservice;

    private JsonData jd;

    @RequestMapping("/get")
    public JsonData getAi(Integer aiId) {
        AI obj = aIservice.selectByPrimaryKey(aiId);
        jd = new JsonData();
        jd.setResult(obj);
        return jd;
    }

    @RequestMapping("/list")
    public JsonData list(AI ai){
        jd = new JsonData();
        List<AI> list = aIservice.load(ai);
        jd.setResult(list);

        return jd;
    }

}
