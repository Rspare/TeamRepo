package com.team.planner.service;

import java.util.List;

import com.team.planner.entity.Department;


public interface DepartmentService {

	Integer saveDepartment(Department dept);
	List<Department> getAllDepartments();
	
	
}
