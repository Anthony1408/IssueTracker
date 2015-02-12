package com.epam.service;

import java.util.List;

import com.epam.model.Employee;

public interface EmployeeService {

	public void addEmployee(Employee employee);
	public List<Employee> getEmployee();
	public boolean checkUser(String login,String password);
	public List<String> getPerson();
	public String getFirstName(String login);
	public String getLastName(String login);
	
}
