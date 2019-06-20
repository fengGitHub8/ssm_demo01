package com.feng.mapper;

import com.feng.entity.Emp;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: ssm
 * @description:
 * @author: FengYang
 * @create: 2019-06-19 21:21
 **/
@Repository
public interface EmpMapper {
    /**
     * 查询所有员工信息
     * @return
     */
    List<Emp> getAll();

    /**
     * 添加员工
     * @param emp
     */
    void addEmp(Emp emp);
}
