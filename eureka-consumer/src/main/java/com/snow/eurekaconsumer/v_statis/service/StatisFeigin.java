package com.snow.eurekaconsumer.v_statis.service;

import com.snow.eurekaconsumer.v_statis.model.Keyword;
import com.snow.eurekaconsumer.v_statis.model.WxMenu;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient("eureka-provider")
public interface StatisFeigin {

    @RequestMapping("/statis/updateClick")
    String updateClick(WxMenu wxMenu);

    @RequestMapping("/statis/getClick")
    String getClick(WxMenu wxMenu);

    @RequestMapping("/key/list")
    String keyList(Keyword keyword);
}
