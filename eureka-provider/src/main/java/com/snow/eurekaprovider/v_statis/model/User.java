package com.snow.eurekaprovider.v_statis.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
public class User {
    private Integer uid;

    private String uname;

    private Integer ubind;

    private Integer ustate;

    private Date udate;

    public User(Integer uid, String uname, Integer ubind, Integer ustate, Date udate) {
        this.uid = uid;
        this.uname = uname;
        this.ubind = ubind;
        this.ustate = ustate;
        this.udate = udate;
    }

    public User() {
        super();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public Integer getUbind() {
        return ubind;
    }

    public void setUbind(Integer ubind) {
        this.ubind = ubind;
    }

    public Integer getUstate() {
        return ustate;
    }

    public void setUstate(Integer ustate) {
        this.ustate = ustate;
    }

    public Date getUdate() {
        return udate;
    }

    public void setUdate(Date udate) {
        this.udate = udate;
    }
}