package com.snow.eurekaprovider.v_statis.controller;

import com.snow.eurekaprovider.v_statis.model.WxMenu;
import com.snow.eurekaprovider.v_statis.service.IStatisService;
import com.snow.vo.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/statis")
public class StatisController {
    @Autowired
    private IStatisService iStatisService;

    @RequestMapping("/updateClick")
    public JsonData updateClick(@RequestBody WxMenu wxMenu){
        wxMenu.setSubname(wxMenu.getSubname());
        WxMenu click = iStatisService.getClick(wxMenu.getSubname());
        wxMenu.setClickrate(click.getClickrate()+1);
        iStatisService.updateClick(wxMenu);
        JsonData jsonData=new JsonData();
        jsonData.setMessage("点击率加1~");
        return jsonData;
    }

    @RequestMapping("/getClick")
    public JsonData getClick(@RequestBody  WxMenu wxMenu){
        List<WxMenu> click = iStatisService.getClickByName(wxMenu.getMenuname());
        JsonData jsonData=new JsonData();
        jsonData.setResult(click);
        return jsonData;
    }

}
