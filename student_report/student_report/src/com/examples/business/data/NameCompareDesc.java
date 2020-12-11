package com.examples.business.data;

public class NameCompareDesc implements java.util.Comparator<Student> 
{
public int compare(Student s1, Student s2)
{
	return s2.getName().compareTo(s1.getName());
}
	
}
