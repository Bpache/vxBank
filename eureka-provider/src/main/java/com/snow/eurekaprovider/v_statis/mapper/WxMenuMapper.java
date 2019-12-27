package com.snow.eurekaprovider.v_statis.mapper;

import com.snow.eurekaprovider.v_statis.model.WxMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WxMenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WxMenu record);

    int insertSelective(WxMenu record);

    WxMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WxMenu record);

    int updateByPrimaryKey(WxMenu record);

    WxMenu getClick(String subname);

    List<WxMenu> getClickByName(String menuname);

    int updateClick(WxMenu wxMenu);
}