package com.team.planner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team.planner.entity.Department;
import com.team.planner.entity.Designation;
import com.team.planner.entity.Employee;
import com.team.planner.service.DepartmentService;
import com.team.planner.service.DesignationService;
import com.team.planner.service.EmployeeService;

@Controller
public class InsertionController {

	@Autowired
	EmployeeService empServ;
	@Autowired
	DepartmentService deptServ;
	@Autowired 
	DesignationService desigServ;
	
	@RequestMapping(value = "/saveEmployee.do", method = RequestMethod.POST)
	public String saveEmployee(@ModelAttribute Employee emp)
	{
		empServ.saveEmployee(emp);
		return "home";
	}
	
	@RequestMapping(value = "/showForm.do", method = RequestMethod.GET)
	public String showForm()
//	public String showForm(Model model)
	{
		//model.addAttribute("deptLst", getDeptLst());
		//model.addAttribute("desigLst", getDesigLst());
		
		return "home";
	}
	
	@ModelAttribute("deptLst")
	public List<Department> getDeptLst(){
		return deptServ.getAllDepartments();
	}
	
	@ModelAttribute("desigLst")
	public List<Designation> getDesigLst()
	{
		return desigServ.getAllDesignations();
		
	}
}
