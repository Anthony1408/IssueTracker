package com.epam.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Task")
public class Task {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@JoinColumn(name = "projectid")
	@ManyToOne(cascade = CascadeType.ALL)
	private Project projectid;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "psd")
	private Date psd;
	
	@Column(name = "pdd")
	private int pdd;
	
	@Column(name = "asd")
	private Date asd;
	
	@Column(name = "addd")
	private int addd;
	
	@JoinColumn(name = "statusid")
	@ManyToOne(cascade = CascadeType.ALL)
	private Status statusid;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPsd() {
		return psd;
	}

	public void setPsd(Date psd) {
		this.psd = psd;
	}

	public int getPdd() {
		return pdd;
	}

	public void setPdd(int pdd) {
		this.pdd = pdd;
	}

	public Date getAsd() {
		return asd;
	}

	public void setAsd(Date asd) {
		this.asd = asd;
	}

	public int getAddd() {
		return addd;
	}

	public void setAddd(int addd) {
		this.addd = addd;
	}

	public Status getStatusid() {
		return statusid;
	}

	public void setStatusid(Status statusid) {
		this.statusid = statusid;
	}
	
	
}
