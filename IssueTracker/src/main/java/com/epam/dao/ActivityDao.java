package com.epam.dao;

import java.util.List;
import com.epam.model.Activity;

public interface ActivityDao {
	
	public List<Activity> getActivity();
	public List<Activity> getActivityCount();
}
