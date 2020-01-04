package com.snow.eurekaprovider.v_server.mapper;

import com.snow.eurekaprovider.v_server.model.WXActivity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WXActivityMapper {
    int deleteByPrimaryKey(Integer actId);

    int insert(WXActivity record);

    int insertSelective(WXActivity record);

    WXActivity selectByPrimaryKey(Integer actId);

    int updateByPrimaryKeySelective(WXActivity record);

    int updateByPrimaryKey(WXActivity record);

    List<WXActivity> activityList(WXActivity wxActivity);
}