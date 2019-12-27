package com.snow.eurekaprovider.v_statis.service;

import com.snow.eurekaprovider.v_statis.model.WxMenu;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IStatisService {
    /**
     * 根据子菜单名字修改点击率
     */
    int updateClick(WxMenu wxMenu);

    /**
     * 通过主菜单获取子菜单以及点击率
     */
    @Transactional(readOnly = true)
    List<WxMenu> getClickByName(String menuname);

    @Transactional(readOnly = true)
    WxMenu getClick(String subname);
}
