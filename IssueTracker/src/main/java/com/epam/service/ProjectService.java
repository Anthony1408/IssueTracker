package com.epam.service;

import java.util.List;

import com.epam.model.Project;

public interface ProjectService {

	public List<Project> getProject();
	
	public List<String> getProjectName();
}
