package com.javaboy.dao;

import com.javaboy.bean.SmDept;
import com.javaboy.bean.SmDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmDeptMapper {
    int countByExample(SmDeptExample example);

    int deleteByExample(SmDeptExample example);

    int insert(SmDept record);

    int insertSelective(SmDept record);

    List<SmDept> selectByExample(SmDeptExample example);

    int updateByExampleSelective(@Param("record") SmDept record, @Param("example") SmDeptExample example);

    int updateByExample(@Param("record") SmDept record, @Param("example") SmDeptExample example);
}