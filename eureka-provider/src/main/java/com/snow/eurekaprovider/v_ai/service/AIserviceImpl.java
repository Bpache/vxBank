package com.snow.eurekaprovider.v_ai.service;

import com.snow.eurekaprovider.v_ai.mapper.AIMapper;
import com.snow.eurekaprovider.v_ai.model.AI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AIserviceImpl implements IAIservice {

    @Autowired
    private AIMapper aiMapper;

    @Override
    public int deleteByPrimaryKey(Integer aiId) {
        return 0;
    }

    @Override
    public int insert(AI record) {
        return 0;
    }

    @Override
    public int insertSelective(AI record) {
        return 0;
    }

    @Override
    public AI selectByPrimaryKey(Integer aiId) {
        return aiMapper.selectByPrimaryKey(aiId);
    }

    @Override
    public int updateByPrimaryKeySelective(AI record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(AI record) {
        return 0;
    }
}
