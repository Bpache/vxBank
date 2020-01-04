package com.snow.eurekaprovider.v_ai.service;

import com.snow.eurekaprovider.v_ai.model.AI;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IAIservice {

    int deleteByPrimaryKey(Integer aiId);

    int insert(AI record);
    @Transactional(readOnly = true)
    AI selectByPrimaryKey(Integer aiId);

    int updateByPrimaryKey(AI record);

    @Transactional(readOnly = true)
    List<AI> load(AI record);
}
