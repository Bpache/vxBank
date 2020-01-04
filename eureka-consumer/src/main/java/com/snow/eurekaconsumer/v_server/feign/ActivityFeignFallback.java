package com.snow.eurekaconsumer.v_server.feign;

import com.snow.eurekaconsumer.v_server.service.WxActivityFeigin;
import org.springframework.stereotype.Component;

@Component
public class ActivityFeignFallback implements WxActivityFeigin {


    @Override
    public String activityAdd(String actInfo, String operato) {
        return "系统繁忙，请重试！";
    }

    @Override
    public String activitylist() {
        return "系统繁忙，请重试！";
    }
}
