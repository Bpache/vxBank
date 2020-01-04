package com.snow.eurekaprovider.v_server.controller;

import com.snow.eurekaprovider.util.JsonData;
import com.snow.eurekaprovider.v_server.model.WXActivity;
import com.snow.eurekaprovider.v_server.service.IWXActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/activity")
public class WXActivityController {

    @Autowired
    private IWXActivityService iwxActivityService;

    private WXActivity wxActivity;

    @RequestMapping("/add")
    public JsonData activityAdd(@RequestBody String actInfo,@RequestBody String operato) {
        wxActivity.setActInfo(actInfo);
        wxActivity.setOperato(operato);
        iwxActivityService.insertSelective(wxActivity);
        JsonData jsonData = new JsonData();
        jsonData.setMessage("添加成功！");
        return jsonData;
    }
    @RequestMapping("/list")
    public JsonData activitylist() {
        List<WXActivity> activities = iwxActivityService.activityList(wxActivity);
        JsonData jsonData = new JsonData();
        jsonData.setMessage("查询成功。。。。。。。。。。。。。。");
        jsonData.setResult(activities);
        return jsonData;
    }

}
