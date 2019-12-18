package com.snow.eurekaprovider.v_ai.service;

import com.snow.eurekaprovider.v_ai.model.AI;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IAIservice {

    int deleteByPrimaryKey(Integer aiId);

    int insert(AI record);

    int insertSelective(AI record);

    AI selectByPrimaryKey(Integer aiId);

    int updateByPrimaryKeySelective(AI record);

    int updateByPrimaryKey(AI record);
}
