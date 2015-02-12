package com.epam.dao;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.epam.model.Activity;
import com.epam.model.Assigment;

@Repository
public class AssigmentDaoImpl implements AssigmentDao {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Assigment> getAssigment() {
		@SuppressWarnings("unchecked")
		List<Assigment> assigmentList = sessionFactory.getCurrentSession()
				.createCriteria(Assigment.class).list();
		return assigmentList;
	}

	@Override
	public List<String> getAllAssigment(String assignee, String status,
			String project) {
		@SuppressWarnings("unchecked")
		List<String> listAssigment = null;
		SQLQuery q = null;
		String sql = "select firstname,lastname,status.name as statusName,assigment.description,project.name as projectName "
				+ "	from status,assigment,employee,member,project,task "
				+ "	where status.id = assigment.statusid and assigment.memberid = member.id"
				+ "	and assigment.taskid = task.id and task.projectid = project.id"
				+ "	and member.employeeid = employee.id and task.statusid = status.id ";
		if (status != null) {
			if (!status.equals("All")) {
				String newSql = sql + "and status.name =:status.name ";
				q = (SQLQuery) sessionFactory.getCurrentSession()
						.createSQLQuery(newSql);
				q.setString("status.name", status);
				listAssigment = q.list();
			}
		}
		
		if (project != null) {
			if (!project.equals("All")) {
				String newSql = sql + "and project.name =:project.name ";
				q = (SQLQuery) sessionFactory.getCurrentSession().createSQLQuery(newSql);
				q.setString("project.name", project);
				listAssigment = q.list();
			}
		}
		
		if (assignee != null) {
			if (!assignee.equals("All")) {
				String[] assign = assignee.split(" ");
				
				String newSql = sql + "and lastname =:lastname and firstname =:firstname";
				q = (SQLQuery) sessionFactory.getCurrentSession().createSQLQuery(newSql);
				q.setString("lastname", assign[1]);
				q.setString("firstname", assign[0]);
				listAssigment = q.list();
			}
		}
		
		if ((assignee == null && project == null && status == null)
				|| (assignee.equals("All") && status.equals("All") && project
						.equals("All"))) {
			q = (SQLQuery) sessionFactory.getCurrentSession().createSQLQuery(sql);
			listAssigment = q.list();
		}
		return listAssigment;
	}
}
