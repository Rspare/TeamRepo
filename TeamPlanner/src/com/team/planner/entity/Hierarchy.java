package com.team.planner.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hierarchy")
public class Hierarchy {

	@Id
	@Column(name="hie_id")
	private Integer hieId;
	@Column(name="hie_name")
	private String hieNm;
	@Column(name="hie_desc")
	private String hie_desc;
	public Integer getHieId() {
		return hieId;
	}
	public void setHieId(Integer hieId) {
		this.hieId = hieId;
	}
	public String getHieNm() {
		return hieNm;
	}
	public void setHieNm(String hieNm) {
		this.hieNm = hieNm;
	}
	public String getHie_desc() {
		return hie_desc;
	}
	public void setHie_desc(String hie_desc) {
		this.hie_desc = hie_desc;
	}
	
	
	
	
}
