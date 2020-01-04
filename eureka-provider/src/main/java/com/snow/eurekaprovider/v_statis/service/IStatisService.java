package com.snow.eurekaprovider.v_statis.service;

import com.snow.eurekaprovider.v_statis.model.Keyword;
import com.snow.eurekaprovider.v_statis.model.User;
import com.snow.eurekaprovider.v_statis.model.UserVo;
import com.snow.eurekaprovider.v_statis.model.WxMenu;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
public interface IStatisService {
    /**
     * 根据子菜单名字修改点击率
     */
    int updateClick(WxMenu wxMenu);

    @Transactional(readOnly = true)
    WxMenu getClick(String subname);

    /**
     * 通过主菜单获取子菜单以及点击率
     */
    @Transactional(readOnly = true)
    @Cacheable(value = "MenuCache")
    List<WxMenu> getClickByName(String menuname);

    /**
     * 关键字列表
     * @param keyword
     * @return
     */
    @Transactional(readOnly = true)
    @Cacheable(value = "KeyCache",key = "'key-'+#keyword.type+','+#keyword.pageNum+','+#keyword.pageSize",unless = "#result.size()==0")
    List<Keyword> KeyList(Keyword keyword);

    /**
     * 增加关键字
     * @param keyword
     * @return
     */
    int addKey(Keyword keyword);

    /**
     * 根据关键字名字修改关键字条数
     * @param keyname
     * @return
     */
    int updateKeySum(String keyname);

    /**
     * 根据关键字名字查找关键字表是否有这条数据（如果有 执行上面修改方法 没有执行上上面增加方法）
     * @param keyname
     * @return
     */
    Keyword getByName(String keyname);

    @Transactional(readOnly = true)
    @Cacheable(value = "UserCache",key = "'userVo-'+#userVo.start+','+#userVo.end",unless = "#result.size()==0")
    List<Map<String,Object>> userNumber(UserVo userVo);
}
