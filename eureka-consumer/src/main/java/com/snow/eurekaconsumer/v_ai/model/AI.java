package com.snow.eurekaconsumer.v_ai.model;

import com.snow.eurekaconsumer.util.PageModel;
import lombok.Data;

@Data
public class AI{
    private Integer aiId;

    private String aiQuestion;

    private String aiQuestion1;

    private String aiQuestion2;

    private String aiQuestion3;

    private String aiQuestion4;

    private String aiQuestion5;

    private String aiRespones;

    private Integer pageNum;//页码
    private Integer pageSize;//每页显示条数

}