package com.snow.eurekaprovider.v_ai.service;

import com.snow.eurekaprovider.v_ai.model.AI;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IAIservice {

    int deleteByPrimaryKey(Integer aiId);

    int insert(AI record);

    AI selectByPrimaryKey(Integer aiId);

    int updateByPrimaryKey(AI record);

    List<AI> load(AI record);
}
