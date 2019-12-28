package com.snow.eurekaconsumer.util;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;

@Data
public abstract class PageModel implements Serializable {
    @JsonIgnore
    private Integer pageNum;//页码
    @JsonIgnore
    private Integer pageSize;//每页显示条数
}
