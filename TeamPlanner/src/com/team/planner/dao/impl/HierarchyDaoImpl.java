package com.team.planner.dao.impl;

import org.springframework.stereotype.Component;

import com.team.planner.dao.HierarchyDao;
import com.team.planner.entity.Hierarchy;

@Component("hieDao")
public class HierarchyDaoImpl extends GenericDaoImpl<Hierarchy, Integer> implements HierarchyDao  {
}
