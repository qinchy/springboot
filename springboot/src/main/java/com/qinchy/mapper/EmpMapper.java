package com.qinchy.mapper;

import com.qinchy.model.Emp;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

/**
 * Created by Administrator on 2017/6/13.
 */
public interface EmpMapper {

    @Select("select * from emp where empno = #{empNo}")
    Emp findEmpById(@Param("empNo") String empNo);
}
