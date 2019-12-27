package com.snow.eurekaconsumer.v_statis.model;

import lombok.ToString;
import org.springframework.stereotype.Component;

@ToString
@Component
public class WxMenu {
    private Integer id;

    private String accno;

    private String menuname;

    private String subname;

    private Integer clickrate;

    private Integer seqno;

    private String menukey;

    private String summary;

    private String operato;

    private String opertime;

    private String state;

    private String isupdate;

    private String uptime;

    private String upstate;

    public WxMenu(Integer id, String accno, String menuname, String subname, Integer clickrate, Integer seqno, String menukey, String summary, String operato, String opertime, String state, String isupdate, String uptime, String upstate) {
        this.id = id;
        this.accno = accno;
        this.menuname = menuname;
        this.subname = subname;
        this.clickrate = clickrate;
        this.seqno = seqno;
        this.menukey = menukey;
        this.summary = summary;
        this.operato = operato;
        this.opertime = opertime;
        this.state = state;
        this.isupdate = isupdate;
        this.uptime = uptime;
        this.upstate = upstate;
    }

    public WxMenu() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno == null ? null : accno.trim();
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname == null ? null : subname.trim();
    }

    public Integer getClickrate() {
        return clickrate;
    }

    public void setClickrate(Integer clickrate) {
        this.clickrate = clickrate;
    }

    public Integer getSeqno() {
        return seqno;
    }

    public void setSeqno(Integer seqno) {
        this.seqno = seqno;
    }

    public String getMenukey() {
        return menukey;
    }

    public void setMenukey(String menukey) {
        this.menukey = menukey == null ? null : menukey.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getOperato() {
        return operato;
    }

    public void setOperato(String operato) {
        this.operato = operato == null ? null : operato.trim();
    }

    public String getOpertime() {
        return opertime;
    }

    public void setOpertime(String opertime) {
        this.opertime = opertime == null ? null : opertime.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getIsupdate() {
        return isupdate;
    }

    public void setIsupdate(String isupdate) {
        this.isupdate = isupdate == null ? null : isupdate.trim();
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime == null ? null : uptime.trim();
    }

    public String getUpstate() {
        return upstate;
    }

    public void setUpstate(String upstate) {
        this.upstate = upstate == null ? null : upstate.trim();
    }
}