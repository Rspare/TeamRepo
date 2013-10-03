package com.team.planner.dao.impl;

import org.springframework.stereotype.Component;

import com.team.planner.dao.DepartmentDao;
import com.team.planner.entity.Department;

@Component("deptDao")
public class DepartmentDaoImpl extends GenericDaoImpl<Department, Integer> implements DepartmentDao {

}
