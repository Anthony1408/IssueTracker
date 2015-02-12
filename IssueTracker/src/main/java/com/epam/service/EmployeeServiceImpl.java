package com.epam.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.epam.dao.EmployeeDao;
import com.epam.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao employeeDao;

	
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	@Override
	@Transactional
	public void addEmployee(Employee employee) {
		employeeDao.saveEmployee(employee);
	}
	@Override
	@Transactional
	public List<Employee> getEmployee() {
		return employeeDao.getEmployee();
	}
	@Override
	@Transactional
	public boolean checkUser(String login, String password) {
		return employeeDao.checkLogin(login, password);
		
	}
	@Override
	@Transactional
	public List<String> getPerson() {
		return employeeDao.getPerson();
	}
	
	@Override
	@Transactional
	public String getFirstName(String login) {
		return employeeDao.getUserFirstName(login);
	}
	
	@Override
	@Transactional
	public String getLastName(String login) {
		return employeeDao.getUserLastName(login);
	}
	

}
