package com.snow.eurekaconsumer.v_server.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class WXActivity {
    private Integer actId;

    private String actInfo;

    private String operato;

    private Date actDate;

}