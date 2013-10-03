package com.team.planner.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.team.planner.dao.DepartmentDao;
import com.team.planner.entity.Department;
import com.team.planner.service.DepartmentService;

@Component("deptServ")
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired 
	DepartmentDao deptDao;
	
	@Override
	public Integer saveDepartment(Department dept) {
		
		deptDao.add(dept);
		
		return 1;
	}

}
