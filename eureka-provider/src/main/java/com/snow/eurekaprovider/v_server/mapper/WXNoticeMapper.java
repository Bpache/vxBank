package com.snow.eurekaprovider.v_server.mapper;

import com.snow.eurekaprovider.v_server.model.WXNotice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface WXNoticeMapper {
    int deleteByPrimaryKey(Integer notiId);

    int insert(WXNotice record);

    int insertSelective(WXNotice record);

    WXNotice selectByPrimaryKey(Integer notiId);

    int updateByPrimaryKeySelective(WXNotice record);

    int updateByPrimaryKey(WXNotice record);

    List<WXNotice> load(WXNotice record);
}