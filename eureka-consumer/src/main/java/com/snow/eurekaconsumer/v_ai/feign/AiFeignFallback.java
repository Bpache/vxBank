package com.snow.eurekaconsumer.v_ai.feign;

import com.snow.eurekaconsumer.v_ai.model.AI;
import com.snow.eurekaconsumer.v_ai.service.AiFeign;
import org.springframework.stereotype.Component;

@Component
public class AiFeignFallback implements AiFeign {

    @Override
    public String list(AI ai) {
        return "系统繁忙，请重试！";
    }

    @Override
    public String add(AI ai) {
        return "系统繁忙，请重试！";
    }

    @Override
    public String del(AI ai) {
        return "系统繁忙，请重试！";
    }

    @Override
    public String edit(AI ai) {
        return "系统繁忙，请重试！";
    }

    @Override
    public String chat(String msg) {
        return "系统繁忙，请重试！";
    }
}
