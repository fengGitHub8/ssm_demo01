package com.feng.controller;

import com.feng.entity.Emp;
import com.feng.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: ssm
 * @description:
 * @author: FengYang
 * @create: 2019-06-19 15:17
 **/
@Controller
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello.jsp";
    }

    @RequestMapping("getAll")
    @ResponseBody
    public List<Emp> getAllEmp(){
        List<Emp> emps = empService.getAllEmp();
        return emps;
    }

    @RequestMapping("add")
    @ResponseBody
    public String addEmp(Emp emp){
        System.out.println(emp);
        try {
            empService.addEmp(emp);
        } catch (Exception e) {
            return "fail";
        }
        return "success";
    }
}