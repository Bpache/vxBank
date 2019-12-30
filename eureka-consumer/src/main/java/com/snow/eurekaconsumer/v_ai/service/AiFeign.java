package com.snow.eurekaconsumer.v_ai.service;


import com.snow.eurekaconsumer.v_ai.model.AI;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient(value = "eureka-provider")
public interface AiFeign {

    //在该调用中，我们feign并不需要指定端口号，它并不知道这个方法所在的服务提供者现在在哪个端口运行，我们只需要向eureka寻求服务。
    @RequestMapping("/ai/list")
    String list(AI ai);

    @RequestMapping("/ai/add")
    String add(AI ai);

    @RequestMapping("/ai/del")
    String del(AI ai);

    @RequestMapping("/ai/edit")
    String edit(AI ai);

}
