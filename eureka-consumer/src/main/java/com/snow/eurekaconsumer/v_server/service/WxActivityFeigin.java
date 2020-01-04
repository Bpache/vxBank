package com.snow.eurekaconsumer.v_server.service;

import com.snow.eurekaconsumer.v_server.feign.ActivityFeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient(value = "eureka-provider",fallback = ActivityFeignFallback.class)
public interface WxActivityFeigin {

    @RequestMapping("/activity/add")
    String activityAdd(String actInfo, String operato);

    @RequestMapping("/activity/list")
    String activitylist();
}
