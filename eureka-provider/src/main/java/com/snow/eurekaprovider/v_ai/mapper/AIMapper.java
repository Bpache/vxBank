package com.snow.eurekaprovider.v_ai.mapper;

import com.snow.eurekaprovider.v_ai.model.AI;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AIMapper {
    int deleteByPrimaryKey(Integer aiId);

    int insert(AI record);

    int insertSelective(AI record);

    AI selectByPrimaryKey(Integer aiId);

    int updateByPrimaryKeySelective(AI record);

    int updateByPrimaryKey(AI record);
}