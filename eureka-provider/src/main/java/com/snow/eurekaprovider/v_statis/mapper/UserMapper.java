package com.snow.eurekaprovider.v_statis.mapper;

import com.snow.eurekaprovider.v_statis.model.User;
import com.snow.eurekaprovider.v_statis.model.UserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<Map<String,Object>> userNumber(UserVo userVo);
}