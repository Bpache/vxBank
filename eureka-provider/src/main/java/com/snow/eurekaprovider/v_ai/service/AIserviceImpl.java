package com.snow.eurekaprovider.v_ai.service;

import com.snow.eurekaprovider.v_ai.mapper.AIMapper;
import com.snow.eurekaprovider.v_ai.model.AI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AIserviceImpl implements IAIservice {

    @Autowired
    private AIMapper aiMapper;

    @Override
    public int deleteByPrimaryKey(Integer aiId) {
        return aiMapper.deleteByPrimaryKey(aiId);
    }

    @Override
    public int insert(AI ai) {
        return aiMapper.insertSelective(ai);
    }

    @Override
    public AI selectByPrimaryKey(Integer aiId) {
        return aiMapper.selectByPrimaryKey(aiId);
    }



    @Override
    public List<AI> load(AI ai) {
        return aiMapper.load(ai);
    }

    @Override
    public int updateByPrimaryKey(AI ai) {
        return aiMapper.updateByPrimaryKeySelective(ai);
    }


}
