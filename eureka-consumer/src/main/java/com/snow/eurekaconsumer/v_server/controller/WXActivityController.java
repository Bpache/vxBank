package com.snow.eurekaconsumer.v_server.controller;

import com.snow.eurekaconsumer.v_server.service.WxActivityFeigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/activity")
public class WXActivityController {
    @Autowired
    private WxActivityFeigin wxActivityFeigin;

    @RequestMapping("/add")
    public String activityAdd(String actInfo,String operato){
        String str = wxActivityFeigin.activityAdd(actInfo,operato);
        return str;
    }

    @RequestMapping("/list")
    public String activitylist(){
        String str = wxActivityFeigin.activitylist();
        return str;
    }
}
