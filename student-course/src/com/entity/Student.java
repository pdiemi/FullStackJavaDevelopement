package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity  //convert class into a table
public class Student {

	@Id  //set following member (empId) as primary key
	private int stuId;
	private String stuName;
	private String stuEmail;
	
	@OneToOne (cascade = CascadeType.ALL)
	private Course stdCourse;

	public Student() {
		super();
	}

	public Student(int stuId, String stuName, String stuEmail, Course stdCourse) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuEmail = stuEmail;
		this.stdCourse = stdCourse;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getstuEmail() {
		return stuEmail;
	}

	public void setstuEmail(String stuEmail) {
		this.stuEmail = stuEmail;
	}

	public Course getStdCourse() {
		return stdCourse;
	}

	public void setStdCourse(Course stdCourse) {
		this.stdCourse = stdCourse;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuEmail=" + stuEmail + ", stdCourse=" + stdCourse
				+ "]";
	}
	
	
}
