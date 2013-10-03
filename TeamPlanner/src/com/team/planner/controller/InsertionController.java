package com.team.planner.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team.planner.entity.Employee;
import com.team.planner.service.EmployeeService;

@Controller
public class InsertionController {

	@Autowired
	EmployeeService empServ;
	
	
	@RequestMapping(value = "/saveEmployee.do", method = RequestMethod.POST)
	public String saveEmployee(@ModelAttribute Employee emp)
	{
		empServ.saveEmployee(emp);
		return "home";
	}			
}
