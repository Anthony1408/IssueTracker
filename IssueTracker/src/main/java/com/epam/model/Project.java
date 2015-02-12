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
@Table(name = "Project")
public class Project {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "psd")
	private Date psd;
	
	@Column(name = "ped")
	private Date ped;
	
	@Column(name = "asd")
	private Date asd;
	
	@Column(name = "aed")
	private Date aed;
	
	@JoinColumn(name ="statusid")
	@ManyToOne(cascade = CascadeType.ALL)
	private Status statusid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Date getPed() {
		return ped;
	}

	public void setPed(Date ped) {
		this.ped = ped;
	}

	public Date getAsd() {
		return asd;
	}

	public void setAsd(Date asd) {
		this.asd = asd;
	}

	public Date getAed() {
		return aed;
	}

	public void setAed(Date aed) {
		this.aed = aed;
	}

	public Status getStatusid() {
		return statusid;
	}

	public void setStatusid(Status statusid) {
		this.statusid = statusid;
	}
	
	
	

}
