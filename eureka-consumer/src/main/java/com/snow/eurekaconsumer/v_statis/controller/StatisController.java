package com.snow.eurekaconsumer.v_statis.controller;

import com.snow.eurekaconsumer.v_statis.model.WxMenu;
import com.snow.eurekaconsumer.v_statis.service.StatisFeigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatisController {
    @Autowired
    private StatisFeigin clickFeigin;

    @RequestMapping("/updateClick")
    public String updateClick(WxMenu wxMenu){
        String click = clickFeigin.updateClick(wxMenu);
        return click;
    }

    @RequestMapping("/getClick")
    public String getClick(WxMenu wxMenu, @RequestParam int type){
        if(type==0){
            wxMenu.setMenuname("微生活");
        }else{
            wxMenu.setMenuname("微服务");
        }
        String click = clickFeigin.getClick(wxMenu);
        return click;
    }
}
