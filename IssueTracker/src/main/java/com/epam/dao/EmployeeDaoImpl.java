package com.epam.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.epam.model.Employee;


@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	//private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void saveEmployee(Employee employee) {
		sessionFactory.getCurrentSession().saveOrUpdate(employee);
	}
	
	@Override
	public List<Employee> getEmployee() {
		@SuppressWarnings("unchecked")
		List<Employee> userlist = sessionFactory.getCurrentSession()
				.createCriteria(Employee.class).list();
		return userlist;
	}
	
	@Override
	public boolean checkLogin(String login, String password) {
		System.out.println(login);
		String queryResult = (String)sessionFactory.getCurrentSession().
				createSQLQuery("select login from employee where " +
				"login = :login and password=:password")
				.setString("login", login).setString("password", password).uniqueResult();
		System.out.println(queryResult);
		if (queryResult != null) {
			System.out.println("такой юзер существует");
			return true;
		} else {
			System.out.println("нет такого пользователя");
			return false;
		}
	}

	@Override
	public List<String> getPerson() {
		@SuppressWarnings("unchecked")
		String sql = "select firstname,lastname from employee order by firstname";
		List<String> listPerson = sessionFactory.getCurrentSession().createSQLQuery(sql).list();
		return listPerson;
	}

	@Override
	public String getUserFirstName(String login) {
		String sql = "select firstname from employee where login = '" + login + "'";
		String firstName = (String)sessionFactory.getCurrentSession().createSQLQuery(sql).uniqueResult();
		return firstName;
	}

	@Override
	public String getUserLastName(String login) {
		String sql = "select lastname from employee where login = '" + login + "'";
		String lastName = (String)sessionFactory.getCurrentSession().createSQLQuery(sql).uniqueResult();
		return lastName;
	}

	

}
