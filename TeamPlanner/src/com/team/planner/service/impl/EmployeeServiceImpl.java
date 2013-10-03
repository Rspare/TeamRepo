package com.team.planner.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.team.planner.dao.EmployeeDao;
import com.team.planner.entity.Employee;
import com.team.planner.service.EmployeeService;

@Component("empServ")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao empDao;

	@Override
	public Integer saveEmployee(Employee emp) {
		empDao.add(emp);
		return 1;
	}

}
