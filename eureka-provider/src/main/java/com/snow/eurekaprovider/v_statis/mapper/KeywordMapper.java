package com.snow.eurekaprovider.v_statis.mapper;

import com.snow.eurekaprovider.v_statis.model.Keyword;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface KeywordMapper {
    int deleteByPrimaryKey(Integer kid);

    int insert(Keyword record);

    int insertSelective(Keyword record);

    Keyword selectByPrimaryKey(Integer kid);

    int updateByPrimaryKeySelective(Keyword record);

    int updateByPrimaryKey(Keyword record);

    List<Keyword> KeyList(Keyword keyword);
}