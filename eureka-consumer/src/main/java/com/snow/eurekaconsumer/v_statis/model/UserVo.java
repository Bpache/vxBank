package com.snow.eurekaconsumer.v_statis.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class UserVo extends User{
    private String start;
    private String end;

}
