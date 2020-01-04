package com.snow.eurekaprovider.v_server.model;

import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Date;

@ToString
@Component
public class WXNotice {
    private Integer notiId;

    private String notiInfo;

    private String operato;

    private String notiDate;

    public WXNotice(Integer notiId, String notiInfo, String operato, String notiDate) {
        this.notiId = notiId;
        this.notiInfo = notiInfo;
        this.operato = operato;
        this.notiDate = notiDate;
    }

    public WXNotice() {
        super();
    }

    public Integer getNotiId() {
        return notiId;
    }

    public void setNotiId(Integer notiId) {
        this.notiId = notiId;
    }

    public String getNotiInfo() {
        return notiInfo;
    }

    public void setNotiInfo(String notiInfo) {
        this.notiInfo = notiInfo == null ? null : notiInfo.trim();
    }

    public String getOperato() {
        return operato;
    }

    public void setOperato(String operato) {
        this.operato = operato == null ? null : operato.trim();
    }

    public String getNotiDate() {
        return notiDate;
    }

    public void setNotiDate(String notiDate) {
        this.notiDate = notiDate;
    }
}