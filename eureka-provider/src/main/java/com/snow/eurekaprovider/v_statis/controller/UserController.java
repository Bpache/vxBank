package com.snow.eurekaprovider.v_statis.controller;

import com.snow.eurekaprovider.util.JsonData;
import com.snow.eurekaprovider.v_statis.model.User;
import com.snow.eurekaprovider.v_statis.model.UserVo;
import com.snow.eurekaprovider.v_statis.service.IStatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IStatisService iStatisService;

    @RequestMapping("/number")
    public JsonData userNumber(@RequestBody UserVo userVo){
        List<Map<String,Object>> users = iStatisService.userNumber(userVo);
        JsonData jsonData=new JsonData();
        jsonData.setResult(users);
        return jsonData;
    }

}
