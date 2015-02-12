package com.epam.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.epam.model.Activity;

@Repository
public class ActivityDaoImpl implements ActivityDao {
	
	private int countRecord = 0;
	
	
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Activity> getActivity() {
		@SuppressWarnings("unchecked")
		List<Activity> activityList = sessionFactory.getCurrentSession()
				.createCriteria(Activity.class).list();	
		return activityList;
	}

	@Override
	public List<Activity> getActivityCount() {
		//@SuppressWarnings("unchecked")
		countRecord += 3;
		String sql = "select firstname,lastname,comment,data,activity.id from activity,member,employee" +
				"	where memberid = member.id and employeeid = employee.id limit " + countRecord;
		//String sql = "select * from activity";
		List<Activity> activityListCount = sessionFactory.getCurrentSession().createSQLQuery(sql).list();
		return activityListCount;
	}

}
