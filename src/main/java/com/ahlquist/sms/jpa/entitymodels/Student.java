package com.ahlquist.sms.jpa.entitymodels;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


/*
 * This is the Student application which provides hibernate the framework
 * to build tables in the connected database labeled "student". This Class has
 * a ManyToMany relationship with the Course Class and table.  
 */
@Entity
@Table
public class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "Email")
	private String sEmail;
	@Column(name = "Name")
	private String sName;
	@Column(name = "Password")
	private String sPass;
	@ManyToMany(fetch=FetchType.EAGER, targetEntity = Course.class, cascade = {CascadeType.ALL})
	private List<Course> sCourses;
	
	public Student(){}

	public Student(String sEmail, String sName, String sPass, List<Course> sCourses) {
		super();
		this.sEmail = sEmail;
		this.sName = sName;
		this.sPass = sPass;
		this.sCourses = sCourses;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsPass() {
		return sPass;
	}

	public void setsPass(String sPass) {
		this.sPass = sPass;
	}

	public List<Course> getsCourses() {
		return sCourses;
	}

	public void setsCourses(List<Course> sCourses) {
		this.sCourses = sCourses;
	}
	//overriding equals() method  
	@Override  
	public boolean equals(Object obj)   
	{  
	if (obj == null)   
	return false;  
	if (obj == this)  
	return true;  
	return this.getsEmail() == ((Student) obj).getsEmail();
	}  

	
}
