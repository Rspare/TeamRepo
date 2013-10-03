package com.team.planner.dao.impl;

import org.springframework.stereotype.Component;

import com.team.planner.dao.EmployeeDetailsDao;
import com.team.planner.entity.EmployeeDetails;

@Component("empDetDao")
public class EmployeeDetailsDaoImpl extends GenericDaoImpl<EmployeeDetails, Integer> implements EmployeeDetailsDao {

}
