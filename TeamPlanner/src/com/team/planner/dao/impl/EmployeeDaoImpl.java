package com.team.planner.dao.impl;

import org.springframework.stereotype.Component;

import com.team.planner.dao.EmployeeDao;
import com.team.planner.entity.Employee;

@Component("empDao")
public class EmployeeDaoImpl extends GenericDaoImpl<Employee, Integer> implements EmployeeDao {

	
}
