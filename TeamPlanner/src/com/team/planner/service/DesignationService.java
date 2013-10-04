package com.team.planner.service;

import java.util.List;

import com.team.planner.entity.Designation;

public interface DesignationService {

	public Integer saveDesig(Designation des);
	public List<Designation> getAllDesignations();
	
}
