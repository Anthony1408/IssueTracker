package com.epam.service;

import java.util.List;
import com.epam.model.Assigment;

public interface AssigmentService {
	
	public List<Assigment> getAssigment();
	
	public List<String> getAllAssigment(String asssignee, String status, String project);

}
