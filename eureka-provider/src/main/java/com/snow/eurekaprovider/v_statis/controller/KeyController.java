package com.snow.eurekaprovider.v_statis.controller;

import com.snow.eurekaprovider.util.JsonData;
import com.snow.eurekaprovider.v_statis.model.Keyword;
import com.snow.eurekaprovider.v_statis.service.IStatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/key")
public class KeyController {
    @Autowired
    private IStatisService iStatisService;

    @RequestMapping("/list")
    public JsonData keylist(@RequestBody Keyword keyword){
        List<Keyword> list = iStatisService.KeyList(keyword);
        JsonData jsonData=new JsonData();
        jsonData.setPageInfo(list);
        return jsonData;
    }

}
