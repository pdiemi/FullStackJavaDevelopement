package day2;

public class CourseManagement {

	public static void main(String args[]) {
		
		//Assignment 4
		int stuId = 1;
		char stuType = 'F';
		
		Student stu = new Student();
		stu.setStudentId(stuId);
		stu.setStudentType(stuType);
		
		System.out.println(stu.getStudentId() + "\t" + stu.getStudentType());
		
		//Assignment 5
		Student student = new Student();
		System.out.println(student.getStudentId() + "\t" + student.getStudentType());
	}
}
