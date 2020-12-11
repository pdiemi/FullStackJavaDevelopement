package com.examples.business.data;

public class Student {
private int rollNo;
private String name;
private String gender;
private int maths;
private int physics;
private int chemistry;
private int compscience;
public int getChemistry() {
	return chemistry;
}
public void setChemistry(int chemistry) {
	this.chemistry = chemistry;
}
public int getCompscience() {
	return compscience;
}
public void setCompscience(int compscience) {
	this.compscience = compscience;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getMaths() {
	return maths;
}
public void setMaths(int maths) {
	this.maths = maths;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPhysics() {
	return physics;
}
public void setPhysics(int physics) {
	this.physics = physics;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public String toString()
{
	int total = maths + chemistry + physics + compscience;
	return getRollNo()+"\t"+getName()+"\t\t"+getMaths()+"\t\t"+getPhysics()+"\t\t"+getChemistry()+"\t"+getCompscience()+"\t\t"+total;
	
}

}
