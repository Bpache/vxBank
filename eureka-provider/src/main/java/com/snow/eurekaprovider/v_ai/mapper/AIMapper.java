package com.snow.eurekaprovider.v_ai.mapper;

import com.snow.eurekaprovider.v_ai.model.AI;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface AIMapper {
    int deleteByPrimaryKey(Integer aiId);

    int insertSelective(AI record);

    AI selectByPrimaryKey(Integer aiId);

    int updateByPrimaryKeySelective(AI record);

    List<AI> load(AI record);

}