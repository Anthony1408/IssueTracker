package com.epam.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Member")
public class Member {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	
	@JoinColumn(name = "projectid")
	@ManyToOne(cascade = CascadeType.ALL)
	private Project projectid;
	
	
	@JoinColumn(name = "employeeid")
	@ManyToOne(cascade = CascadeType.ALL)
	private Employee employeeid;
	
	
	@JoinColumn(name = "roleid")
	@ManyToOne(cascade = CascadeType.ALL)
	private Role roleid;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Project getProjectid() {
		return projectid;
	}


	public void setProjectid(Project projectid) {
		this.projectid = projectid;
	}


	public Employee getEmployeeid() {
		return employeeid;
	}


	public void setEmployeeid(Employee employeeid) {
		this.employeeid = employeeid;
	}


	public Role getRoleid() {
		return roleid;
	}


	public void setRoleid(Role roleid) {
		this.roleid = roleid;
	}
	
	

}
