package com.snow.eurekaprovider.v_statis.controller;

import com.snow.eurekaprovider.util.JsonData;
import com.snow.eurekaprovider.v_ai.model.AI;
import com.snow.eurekaprovider.v_ai.service.IAIservice;
import com.snow.eurekaprovider.v_statis.model.Keyword;
import com.snow.eurekaprovider.v_statis.service.IStatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.dsig.keyinfo.KeyName;
import java.util.List;

@RestController
@RequestMapping("/key")
public class KeyController {
    @Autowired
    private IStatisService iStatisService;
    @Autowired
    private IAIservice iaIservice;

    //关键字列表
    @RequestMapping("/list")
    public JsonData keylist(@RequestBody Keyword keyword){
        JsonData jsonData=new JsonData();
        List<Keyword> list = iStatisService.KeyList(keyword);
        int sum = 0;
        for (int i=0;i<list.size();i++){
          sum += list.get(i).getKeySum();
        }
        jsonData.setPageInfo(list);
        jsonData.setCode(sum);
        return jsonData;
    }

    @RequestMapping("/addOrUpdate")
    public JsonData addOrUpdate(@RequestBody Keyword keyword,AI ai){
        JsonData jsonData=new JsonData();
        ai.setAiQuestion(keyword.getKeyName());//用户输入的关键字

        return jsonData;
    }


}
