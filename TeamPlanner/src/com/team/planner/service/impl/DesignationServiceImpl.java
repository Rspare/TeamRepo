package com.team.planner.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.team.planner.dao.DesignationDao;
import com.team.planner.entity.Designation;
import com.team.planner.service.DesignationService;
@Component("desigServ")
public class DesignationServiceImpl implements DesignationService {

	@Autowired 
	DesignationDao desigDao;
	
	@Override
	public Integer saveDesig(Designation des) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Designation> getAllDesignations() {
		return desigDao.list() ;
	}

}
