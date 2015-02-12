package com.epam.dao;

import java.util.List;

import com.epam.model.Employee;


public interface EmployeeDao {

	public void saveEmployee ( Employee employee );
	public List<Employee> getEmployee();
	public boolean checkLogin(String login, String password);
	public List<String> getPerson();
	public String getUserFirstName(String login);
	public String getUserLastName(String login);
}
