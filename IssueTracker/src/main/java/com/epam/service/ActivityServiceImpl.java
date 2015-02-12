package com.epam.service;

import java.util.List;

import javax.transaction.Transactional;

import com.epam.dao.ActivityDao;
import com.epam.model.Activity;

public class ActivityServiceImpl implements ActivityService {
	
	
	private ActivityDao activityDao;
	
	public ActivityDao getActivityDao() {
		return activityDao;
	}

	public void setActivityDao(ActivityDao activityDao) {
		this.activityDao = activityDao;
	}

	@Override
	@Transactional
	public List<Activity> getActivity() {
		return activityDao.getActivity();
	}

	@Override
	@Transactional
	public List<Activity> getActivityCount() {
		return activityDao.getActivityCount();
	}

}
