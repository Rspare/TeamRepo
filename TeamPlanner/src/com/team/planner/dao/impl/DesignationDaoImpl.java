package com.team.planner.dao.impl;

import org.springframework.stereotype.Component;

import com.team.planner.dao.DesignationDao;
import com.team.planner.entity.Designation;

@Component("desigDao")
public class DesignationDaoImpl extends GenericDaoImpl<Designation, Integer> implements DesignationDao {

}
