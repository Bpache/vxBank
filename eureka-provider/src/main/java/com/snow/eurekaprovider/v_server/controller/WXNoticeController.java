package com.snow.eurekaprovider.v_server.controller;

import com.snow.eurekaprovider.util.JsonData;
import com.snow.eurekaprovider.v_server.model.WXNotice;
import com.snow.eurekaprovider.v_server.service.IWXNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/notice")
public class WXNoticeController {

    @Autowired
    private IWXNoticeService noticeService;

    private WXNotice wxNotice;

    @RequestMapping("/add")
    public JsonData noticeAdd(@RequestBody String notiInfo,@RequestBody String operato) {
        wxNotice.setNotiInfo(notiInfo);
        wxNotice.setOperato(operato);
        noticeService.insertSelective(wxNotice);
        JsonData jsonData = new JsonData();
        jsonData.setMessage("添加成功！");
        return jsonData;
    }
    @RequestMapping("/list")
    public JsonData noticelist() {
        List<WXNotice> wxNotices = noticeService.load(wxNotice);
        JsonData jsonData = new JsonData();
        jsonData.setMessage("查询成功。。。。。。。。。。。。。。");
        jsonData.setResult(wxNotices);
        return jsonData;
    }

}
