package com.snow.eurekaprovider.v_ai.service;

import com.github.pagehelper.PageHelper;
import com.snow.eurekaprovider.v_ai.mapper.AIMapper;
import com.snow.eurekaprovider.v_ai.model.AI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AIserviceImpl implements IAIservice {

    @Autowired
    private AIMapper aiMapper;

    @Override
    @CachePut("aiCache-del")
    public int deleteByPrimaryKey(Integer aiId) {
        return aiMapper.deleteByPrimaryKey(aiId);
    }

    @Override
    @CachePut("aiCache-add")
    public int insert(AI ai) {
        return aiMapper.insertSelective(ai);
    }

    @Override
    @Cacheable(value="AiCache",key="'Ai-'+aiId",unless = "#result == null")
    public AI selectByPrimaryKey(Integer aiId) {
        return aiMapper.selectByPrimaryKey(aiId);
    }

    @Override
    @Cacheable(value = "AiCache",key="'load-'+#ai.pageNum+','+#ai.pageSize",unless = "#result.size()<1")
    public List<AI> load(AI ai) {
        PageHelper.startPage(ai.getPageNum(),ai.getPageSize());
        List<AI> aiList = aiMapper.load(ai);
        return aiList;
    }

    @Override
    @CachePut("aiCache-update")
    public int updateByPrimaryKey(AI ai) {
        return aiMapper.updateByPrimaryKeySelective(ai);
    }


}
