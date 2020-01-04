package com.snow.eurekaprovider.v_server.service.impl;

import com.snow.eurekaprovider.v_server.mapper.WXActivityMapper;
import com.snow.eurekaprovider.v_server.model.WXActivity;
import com.snow.eurekaprovider.v_server.service.IWXActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WXActivityServiceImpl implements IWXActivityService {

    @Autowired
    private WXActivityMapper wxActivityMapper;

    @Override
    public int insertSelective(WXActivity record) {
        return wxActivityMapper.insertSelective(record);
    }

    @Override
    public WXActivity selectByPrimaryKey(Integer actId) {
        return wxActivityMapper.selectByPrimaryKey(actId);
    }

    @Override
    public int updateByPrimaryKeySelective(WXActivity record) {
        return wxActivityMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<WXActivity> activityList(WXActivity wxActivity) {
        return wxActivityMapper.activityList(wxActivity);
    }
}
