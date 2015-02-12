package com.epam.dao;

import java.util.List;

import com.epam.model.Project;

public interface ProjectDao {
	
	public List<Project> getProject(); 
	public List<String> getProjectName();

}
