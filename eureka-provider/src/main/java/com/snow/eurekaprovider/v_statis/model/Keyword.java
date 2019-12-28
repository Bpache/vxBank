package com.snow.eurekaprovider.v_statis.model;

import com.snow.eurekaprovider.v_statis.mapper.PageModel;
import lombok.ToString;
import org.springframework.stereotype.Component;

@ToString
@Component
public class Keyword extends PageModel {
    private Integer kid;

    private String keyName;

    private Integer keySum;

    public Keyword(Integer kid, String keyName, Integer keySum) {
        this.kid = kid;
        this.keyName = keyName;
        this.keySum = keySum;
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
}