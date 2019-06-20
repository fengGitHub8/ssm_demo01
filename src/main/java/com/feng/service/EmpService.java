package com.feng.service;

import com.feng.entity.Emp;

import java.util.List;

/**
 * @program: ssm
 * @description:
 * @author: FengYang
 * @create: 2019-06-19 21:27
 **/
public interface EmpService {
    /**
     * 查询所有员工
     * @return
     */
    List<Emp> getAllEmp();

    /**
     * 添加员工信息（同时添加部门）
     * @param emp
     */
    void addEmp(Emp emp);
}
