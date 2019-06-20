package com.feng.mapper;

import com.feng.entity.Dept;
import com.feng.entity.Emp;
import org.springframework.stereotype.Repository;

/**
 * @program: ssm
 * @description:
 * @author: FengYang
 * @create: 2019-06-19 23:21
 **/
@Repository
public interface DeptMapper {

    /**
     * 根据id查询部门
     * @param did
     * @return
     */
    Dept findEmpByDid(int did);

    /**
     * 添加部门
     * @param emp
     */
    void addDept(Emp emp);
}
