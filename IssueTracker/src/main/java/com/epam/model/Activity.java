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
@Table(name = "Activity")
public class Activity {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "data")
	private Date data;

	@Column(name = "duration")
	private int duration;

	@Column(name = "comment")
	private String comment;

	@JoinColumn(name = "memberid")
	@ManyToOne(cascade = CascadeType.ALL)
	private Member memberid;

	@JoinColumn(name = "assigmentid")
	@ManyToOne(cascade = CascadeType.ALL)
	private Assigment assigmentid;
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void setAssigmentid(Assigment assigmentid) {
		this.assigmentid = assigmentid;
	}
	
	

	public Assigment getAssigmentid() {
		return assigmentid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getdata() {
		return data;
	}

	public void setdata(Date data) {
		this.data = data;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Member getMemberid() {
		return memberid;
	}

	public void setMemberid(Member memberid) {
		this.memberid = memberid;
	}


}
