package com.epam.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.epam.model.Project;

@Repository
public class ProjectDaoImpl implements ProjectDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Project> getProject() {
		@SuppressWarnings("unchecked")
		List<Project> projectList = sessionFactory.getCurrentSession()
				.createCriteria(Project.class).list();	
		return projectList;
	}

	@Override
	public List<String> getProjectName() {
		@SuppressWarnings("unchecked")
		List<String> listProjectName = sessionFactory.getCurrentSession().createSQLQuery("select name from project").list();
		return listProjectName;
	}
}
