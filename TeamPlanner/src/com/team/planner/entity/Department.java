package com.team.planner.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "depertment")

public class Department {

	@Id
	@Column(name = "deptId")
	@GeneratedValue
	private Integer deptId;
	
	@Column(name = "deptName")
	private String deptName;
	
	@Column(name = "vpId")
	private Integer vpId;
	
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Integer getVpId() {
		return vpId;
	}
	public void setVpId(Integer vpId) {
		this.vpId = vpId;
	}
		
}
