package com.snow.eurekaprovider.v_server.service;

import com.snow.eurekaprovider.v_server.model.WXNotice;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IWXNoticeService {

    int insertSelective(WXNotice record);

    @Transactional(readOnly = true)
    List<WXNotice> load(WXNotice record);
}
