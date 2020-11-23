package day2;

public class Student {

	//Assignment 4&5
	private int studentId;
	private char studentType;
	//Assignment 9, extending the assignment 4&5
	private String studentName;
		
	public Student() {
		//super();
		this.studentId = 10;
		this.studentType = 'F';
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	
	
}
