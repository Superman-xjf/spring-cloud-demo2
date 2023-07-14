package com.xjf.service;

import com.xjf.entity.Dept;

import java.util.List;

public interface DeptService {

    Dept get(Integer deptNo);

    List<Dept> selectAll();
}
