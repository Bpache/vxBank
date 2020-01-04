package com.snow.eurekaprovider.v_server.service;

import com.snow.eurekaprovider.v_server.model.WXActivity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IWXActivityService {

    int insertSelective(WXActivity record);

    @Transactional(readOnly = true)
    WXActivity selectByPrimaryKey(Integer actId);

    int updateByPrimaryKeySelective(WXActivity record);

    @Transactional(readOnly = true)
    List<WXActivity> activityList(WXActivity wxActivity);
}
