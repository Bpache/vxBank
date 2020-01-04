package com.snow.eurekaprovider.v_ai.service;

import com.snow.eurekaprovider.EurekaProviderApplication;
import com.snow.eurekaprovider.v_ai.model.AI;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={EurekaProviderApplication.class,AIserviceImplTest.class})
public class AIserviceImplTest {

    @Autowired
    private IAIservice iaIservice;

    @Test
    public void insert() {


        AI ai = new AI();
        ai.setAiQuestion("查询还款日期");
        ai.setAiRespones("请稍后，正在查询中...");
        iaIservice.insert(ai);


    }
}