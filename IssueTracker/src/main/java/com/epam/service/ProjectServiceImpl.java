package com.epam.service;

import java.util.List;

import javax.transaction.Transactional;

import com.epam.dao.ProjectDao;
import com.epam.model.Project;

public class ProjectServiceImpl implements ProjectService {
	
	private ProjectDao projectDao;
	
	

	public ProjectDao getProjectDao() {
		return projectDao;
	}

	public void setProjectDao(ProjectDao projectDao) {
		this.projectDao = projectDao;
	}

	@Override
	@Transactional
	public List<Project> getProject() {
		return projectDao.getProject();
	}

	@Override
	@Transactional
	public List<String> getProjectName() {
		return projectDao.getProjectName();
	}

}
