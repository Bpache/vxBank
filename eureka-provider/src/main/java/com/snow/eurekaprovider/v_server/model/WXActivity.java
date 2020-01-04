package com.snow.eurekaprovider.v_server.model;

import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Date;

@ToString
@Component
public class WXActivity {
    private Integer actId;

    private String actInfo;

    private String operato;

    private String actDate;

    public WXActivity(Integer actId, String actInfo, String operato, String actDate) {
        this.actId = actId;
        this.actInfo = actInfo;
        this.operato = operato;
        this.actDate = actDate;
    }

    public WXActivity() {
        super();
    }

    public Integer getActId() {
        return actId;
    }

    public void setActId(Integer actId) {
        this.actId = actId;
    }

    public String getActInfo() {
        return actInfo;
    }

    public void setActInfo(String actInfo) {
        this.actInfo = actInfo == null ? null : actInfo.trim();
    }

    public String getOperato() {
        return operato;
    }

    public void setOperato(String operato) {
        this.operato = operato == null ? null : operato.trim();
    }

    public String getActDate() {
        return actDate;
    }

    public void setActDate(String actDate) {
        this.actDate = actDate;
    }
}