package com.epam.dao;

import java.util.List;

import com.epam.model.Assigment;

public interface AssigmentDao {
	
	public List<Assigment> getAssigment();
	public List<String> getAllAssigment(String assignee, String status, String project);

}
