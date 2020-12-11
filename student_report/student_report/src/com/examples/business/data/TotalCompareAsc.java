package com.examples.business.data;

import java.util.Comparator;

public class TotalCompareAsc implements Comparator<Student> {
	public int compare(Student s1, Student s2)
	{
		int t1 = s1.getMaths() + s1.getChemistry() + s1.getPhysics() + s1.getCompscience();
		int t2 = s2.getMaths() + s2.getChemistry() + s2.getPhysics() + s2.getCompscience();
		if(t1 == t2)
			return 0;
		else if (t1 > t2)
			return 1;
		else 
			return -1;
		
	}

}
