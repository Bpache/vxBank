package com.snow.eurekaconsumer.v_statis.model;

import lombok.ToString;
import org.springframework.stereotype.Component;

@ToString
@Component
public class Keyword{
    private Integer kid;

    private String keyName;

    private Integer keySum;

    private Integer type;

    private Integer pageNum;//页码
    private Integer pageSize;//每页显示条数

    public Keyword(Integer kid, String keyName, Integer keySum,Integer type) {
        this.kid = kid;
        this.keyName = keyName;
        this.keySum = keySum;
        this.type=type;
    }

    public Keyword() {
        super();
    }

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName == null ? null : keyName.trim();
    }

    public Integer getKeySum() {
        return keySum;
    }

    public void setKeySum(Integer keySum) {
        this.keySum = keySum;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}