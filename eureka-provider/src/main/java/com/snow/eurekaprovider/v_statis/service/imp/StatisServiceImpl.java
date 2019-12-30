package com.snow.eurekaprovider.v_statis.service.imp;

import com.github.pagehelper.PageHelper;
import com.snow.eurekaprovider.v_statis.mapper.KeywordMapper;
import com.snow.eurekaprovider.v_statis.mapper.WxMenuMapper;
import com.snow.eurekaprovider.v_statis.model.Keyword;
import com.snow.eurekaprovider.v_statis.model.WxMenu;
import com.snow.eurekaprovider.v_statis.service.IStatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatisServiceImpl implements IStatisService {
    @Autowired
    private WxMenuMapper wxMenuMapper;
    @Autowired
    private KeywordMapper keywordMapper;

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

    @Override
    public List<Keyword> KeyList(Keyword keyword) {
        PageHelper.startPage(keyword.getPageNum(),keyword.getPageSize());
        return keywordMapper.KeyList(keyword);
    }
}
