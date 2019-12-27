package com.snow.eurekaprovider.v_statis.service.imp;

import com.snow.eurekaprovider.v_statis.mapper.WxMenuMapper;
import com.snow.eurekaprovider.v_statis.model.WxMenu;
import com.snow.eurekaprovider.v_statis.service.IStatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatisServiceImpl implements IStatisService {
    @Autowired
    private WxMenuMapper wxMenuMapper;

    @Override
    public int updateClick(WxMenu wxMenu) {
        return wxMenuMapper.updateClick(wxMenu);
    }

    @Override
    public List<WxMenu> getClickByName(String menuname) {
        return wxMenuMapper.getClickByName(menuname);
    }

    @Override
    public WxMenu getClick(String subname) {
        return wxMenuMapper.getClick(subname);
    }
}
