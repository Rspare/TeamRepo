package com.team.planner.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_details")
public class EmployeeDetails {
	@Id
	@Column(name="")
	private Integer empId;
	@Column(name="")
	private String pan_no;
	@Column(name="")

	private String phoneNum;
	@Column(name="")
	private String altNum;
	@Column(name="")
	private String emrNum;
	
	@Column(name="")
	private String bloodGrp;
	@Column(name="")
	private String perAddL1;
	@Column(name="")
	private String perAddL2;
	@Column(name="")
	private String perAddCity;
	@Column(name="")
	private String perAddState;
	@Column(name="")
	private String perAddPin;
	@Column(name="")
	private String perAddCountry;
	@Column(name="")
	private String temAddL1;
	@Column(name="")
	private String temAddL2;
	@Column(name="")
	private String temAddCity;
	@Column(name="")
	private String temAddState;
	@Column(name="")
	private String temAddPin;
	@Column(name="")
	private String temAddCountry;
	@Column(name="")
	private Date empDoj;
	@Column(name="")
	private Date empDob;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getPan_no() {
		return pan_no;
	}
	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getAltNum() {
		return altNum;
	}
	public void setAltNum(String altNum) {
		this.altNum = altNum;
	}
	public String getEmrNum() {
		return emrNum;
	}
	public void setEmrNum(String emrNum) {
		this.emrNum = emrNum;
	}
	public String getBloodGrp() {
		return bloodGrp;
	}
	public void setBloodGrp(String bloodGrp) {
		this.bloodGrp = bloodGrp;
	}
	public String getPerAddL1() {
		return perAddL1;
	}
	public void setPerAddL1(String perAddL1) {
		this.perAddL1 = perAddL1;
	}
	public String getPerAddL2() {
		return perAddL2;
	}
	public void setPerAddL2(String perAddL2) {
		this.perAddL2 = perAddL2;
	}
	public String getPerAddCity() {
		return perAddCity;
	}
	public void setPerAddCity(String perAddCity) {
		this.perAddCity = perAddCity;
	}
	public String getPerAddState() {
		return perAddState;
	}
	public void setPerAddState(String perAddState) {
		this.perAddState = perAddState;
	}
	public String getPerAddPin() {
		return perAddPin;
	}
	public void setPerAddPin(String perAddPin) {
		this.perAddPin = perAddPin;
	}
	public String getPerAddCountry() {
		return perAddCountry;
	}
	public void setPerAddCountry(String perAddCountry) {
		this.perAddCountry = perAddCountry;
	}
	public String getTemAddL1() {
		return temAddL1;
	}
	public void setTemAddL1(String temAddL1) {
		this.temAddL1 = temAddL1;
	}
	public String getTemAddL2() {
		return temAddL2;
	}
	public void setTemAddL2(String temAddL2) {
		this.temAddL2 = temAddL2;
	}
	public String getTemAddCity() {
		return temAddCity;
	}
	public void setTemAddCity(String temAddCity) {
		this.temAddCity = temAddCity;
	}
	public String getTemAddState() {
		return temAddState;
	}
	public void setTemAddState(String temAddState) {
		this.temAddState = temAddState;
	}
	public String getTemAddPin() {
		return temAddPin;
	}
	public void setTemAddPin(String temAddPin) {
		this.temAddPin = temAddPin;
	}
	public String getTemAddCountry() {
		return temAddCountry;
	}
	public void setTemAddCountry(String temAddCountry) {
		this.temAddCountry = temAddCountry;
	}
	public Date getEmpDoj() {
		return empDoj;
	}
	public void setEmpDoj(Date empDoj) {
		this.empDoj = empDoj;
	}
	public Date getEmpDob() {
		return empDob;
	}
	public void setEmpDob(Date empDob) {
		this.empDob = empDob;
	}
}
