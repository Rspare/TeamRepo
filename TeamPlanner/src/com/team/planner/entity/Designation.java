package com.team.planner.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="designation")
public class Designation {
	
	@Id
	@Column(name="desig_id")
	private Integer desId;
	@Column(name="hie_id")
	private Integer hieId;
	@Column(name="desig_name")
	private String desName;
	public Integer getDesId() {
		return desId;
	}
	public void setDesId(Integer desId) {
		this.desId = desId;
	}
	public Integer getHieId() {
		return hieId;
	}
	public void setHieId(Integer hieId) {
		this.hieId = hieId;
	}
	public String getDesName() {
		return desName;
	}
	public void setDesName(String desName) {
		this.desName = desName;
	}
	
	
}
