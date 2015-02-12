package com.epam.service;

import java.util.List;

import javax.transaction.Transactional;

import com.epam.dao.AssigmentDao;
import com.epam.model.Assigment;

public class AssigmentServiceImpl implements AssigmentService {
	
	private AssigmentDao assigmentDao;
	
	public AssigmentDao getAssigmentDao() {
		return assigmentDao;
	}

	public void setAssigmentDao(AssigmentDao assigmentDao) {
		this.assigmentDao = assigmentDao;
	}

	@Override
	@Transactional
	public List<Assigment> getAssigment() {
		return assigmentDao.getAssigment();
	}
	
	@Override
	@Transactional
	public List<String> getAllAssigment(String assigne, String status, String project) {
		return assigmentDao.getAllAssigment(assigne, status, project);
	}

}
