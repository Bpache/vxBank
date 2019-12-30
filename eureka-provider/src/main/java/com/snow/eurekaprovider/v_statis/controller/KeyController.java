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
        jsonData.setPageInfo(list);
        return jsonData;
    }

    @RequestMapping("/addOrUpdate")
    public JsonData addOrUpdate(Keyword keyword,AI ai){
        JsonData jsonData=new JsonData();
        ai.setAiQuestion(keyword.getKeyName());//用户输入的关键字
        List<AI> keys = iaIservice.load(ai);
        if(keys.size()<1){//ai表里面没有用户输入的关键字
            jsonData.setMessage("没有你要查询的内容哦~");
        }else{//ai表里面有用户输入的关键字
            String keyname = keys.get(0).getAiQuestion();
            Keyword keyword1 = iStatisService.getByName(keyname);//匹配ai表里面的关键字
                if (keyword1 == null) {//关键字表如果没有 就加到关键字表
                keyword.setKeyName(keyname);
                keyword.setKeySum(1);
                iStatisService.addKey(keyword);
                jsonData.setMessage("关键字增加成功！");
            } else {//如果有 关键字条数就加一
                iStatisService.updateKeySum(keyname);
                jsonData.setMessage("关键字条数加一！");
            }
        }
        return jsonData;
    }


}
