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
@Table(name = "Attachment")
public class Attachment {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "size")
	private String size;
	
	@Column(name = "description")
	private String description;
	
	@JoinColumn(name = "projectid")
	@ManyToOne(cascade = CascadeType.ALL)
	private Project projectid;
	
	@JoinColumn(name = "taskid")
	@ManyToOne(cascade = CascadeType.ALL)
	private Task taskid;

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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Project getProjectid() {
		return projectid;
	}

	public void setProjectid(Project projectid) {
		this.projectid = projectid;
	}

	public Task getTaskid() {
		return taskid;
	}

	public void setTaskid(Task taskid) {
		this.taskid = taskid;
	}
	
	
}
