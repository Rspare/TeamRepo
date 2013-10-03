package com.team.planner.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "employee")
public class Employee {
	@Id
	@GeneratedValue
	@Column (name = "empId")
	private Integer	empId;
	@Column (name = "empFName")
	private String empFName;
	@Column (name = "empLName")	
	private	String empLName;
	@Column (name = "empDob")
	private String	empDob;
	@Column (name = "empDoj")
	private String	empDoj;
	@Column (name = "empType")
	private Integer empType;
	@Column (name = "empSkillSet")
	private String empSkillSet;
	@Column (name = "deptId")
	private	Integer deptId;
	@Column (name = "desigId")
	private Integer	desigId;
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpFName() {
		return empFName;
	}
	public void setEmpFName(String empFName) {
		this.empFName = empFName;
	}
	public String getEmpLName() {
		return empLName;
	}
	public void setEmpLName(String empLName) {
		this.empLName = empLName;
	}
	public String getEmpDob() {
		return empDob;
	}
	public void setEmpDob(String empDob) {
		this.empDob = empDob;
	}
	public String getEmpDoj() {
		return empDoj;
	}
	public void setEmpDoj(String empDoj) {
		this.empDoj = empDoj;
	}
	public Integer getEmpType() {
		return empType;
	}
	public void setEmpType(Integer empType) {
		this.empType = empType;
	}
	public String getEmpSkillSet() {
		return empSkillSet;
	}
	public void setEmpSkillSet(String empSkillSet) {
		this.empSkillSet = empSkillSet;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public Integer getDesigId() {
		return desigId;
	}
	public void setDesigId(Integer desigId) {
		this.desigId = desigId;
	}
	
}
