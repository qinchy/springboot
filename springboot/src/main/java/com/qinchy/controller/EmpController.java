package com.qinchy.controller;

import com.qinchy.mapper.EmpMapper;
import com.qinchy.model.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/6/13.
 */
@RestController
@RequestMapping("/emp")
@EnableAutoConfiguration
public class EmpController {
    @Autowired
    private EmpMapper empMapper;

    @RequestMapping("/findEmpById/{empNo}")
    Emp findCity2(@PathVariable String empNo){
        return empMapper.findEmpById(empNo);
    }
}
