package com.feng.service.impl;

import com.feng.entity.Emp;
import com.feng.mapper.DeptMapper;
import com.feng.mapper.EmpMapper;
import com.feng.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: ssm
 * @description:
 * @author: FengYang
 * @create: 2019-06-19 21:27
 **/
@Service("empService")
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Emp> getAllEmp() {
        return empMapper.getAll();
    }

    @Override
    public void addEmp(Emp emp) {
        empMapper.addEmp(emp);
        deptMapper.addDept(emp);
    }
}
