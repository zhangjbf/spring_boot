package com.javaboy.dao;

import com.javaboy.bean.SmUser;
import com.javaboy.bean.SmUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmUserMapper {
    int countByExample(SmUserExample example);

    int deleteByExample(SmUserExample example);

    int insert(SmUser record);

    int insertSelective(SmUser record);

    List<SmUser> selectByExample(SmUserExample example);

    int updateByExampleSelective(@Param("record") SmUser record, @Param("example") SmUserExample example);

    int updateByExample(@Param("record") SmUser record, @Param("example") SmUserExample example);
}