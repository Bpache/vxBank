package com.snow.eurekaprovider.v_server.service.impl;

import com.snow.eurekaprovider.v_server.mapper.WXNoticeMapper;
import com.snow.eurekaprovider.v_server.model.WXNotice;
import com.snow.eurekaprovider.v_server.service.IWXNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IWXNoticeServiceImpl implements IWXNoticeService {

    @Autowired
    private WXNoticeMapper wxNoticeMapper;

    @Override
    public int insertSelective(WXNotice record) {
        return wxNoticeMapper.insertSelective(record);
    }

    @Override
    public List<WXNotice> load(WXNotice record) {
        return wxNoticeMapper.load(record);
    }
}
