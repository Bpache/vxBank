package com.snow.eurekaprovider.v_ai.controller;


import com.snow.eurekaprovider.v_ai.model.AI;
import com.snow.eurekaprovider.v_ai.service.IAIservice;
import com.snow.vo.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ai")
public class AiController {

    @Autowired
    private IAIservice aIservice;

    private JsonData jd;

    @RequestMapping("/add")
    public JsonData addAi(@RequestBody AI ai) {
        int n = aIservice.insert(ai);
        jd = new JsonData();
        String msg = "操作成功！";
        if(n<1){
            msg = "操作失败！";
        }
        jd.setMessage(msg);
        return jd;
    }

    @RequestMapping("/del")
    public JsonData delAi(@RequestBody AI ai) {
        int n = aIservice.deleteByPrimaryKey(ai.getAiId());
        jd = new JsonData();
        String msg = "操作成功！";
        if(n<1){
            msg = "操作失败！";
        }
        jd.setMessage(msg);
        return jd;
    }


    @RequestMapping("/list")
    public JsonData list(@RequestBody AI ai){
        jd = new JsonData();
        List<AI> list = aIservice.load(ai);
        jd.setResult(list);
        String msg = "查询成功！";
        if(list.size()<1){
            msg = "查询无结果";
        }
        jd.setMessage(msg);
        return jd;
    }

    @RequestMapping("/edit")
    public JsonData edit(@RequestBody AI ai){
        int n = aIservice.updateByPrimaryKey(ai);
        jd = new JsonData();
        String msg = "操作成功！";
        if(n<1){
            msg = "操作失败！";
        }
        jd.setMessage(msg);
        return jd;
    }
}
