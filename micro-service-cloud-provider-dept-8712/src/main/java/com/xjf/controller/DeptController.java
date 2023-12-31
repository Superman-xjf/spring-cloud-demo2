package com.xjf.controller;

import com.xjf.entity.Dept;
import com.xjf.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 服务提供者的控制层
 * @author xuejianfeng
 * 2023年7月12日 14点19分
 */

@RestController
@Slf4j
public class DeptController {
    @Autowired
    private DeptService deptService;

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") int id){
        return deptService.get(id);
    }

    @RequestMapping(value = "dept/list",method = RequestMethod.GET)
    public List<Dept> list(){
        return deptService.selectAll();
    }
}
