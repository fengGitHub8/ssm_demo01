package com.feng.entity;

import lombok.Data;

/**
 * @program: ssm
 * @description:
 * @author: FengYang
 * @create: 2019-06-19 21:19
 **/
@Data
public class Emp {
    private Integer eid;
    private String ename;
    private Dept dept;
}
