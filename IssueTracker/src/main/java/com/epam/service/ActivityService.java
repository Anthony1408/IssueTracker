package com.epam.service;

import java.util.List;

import com.epam.model.Activity;

public interface ActivityService {
	
	public List<Activity> getActivity();
	public List<Activity> getActivityCount();

}
