package day2;

public class PassByVal {

	public static void main(String args[]) {
		int sId = 25;
		PassByVal val = new PassByVal();
		
		System.out.println(sId);
		val.passTheValueMethod(sId);
		System.out.println("2. The sId is "+sId);
		
		Student stu = new Student();
		stu.setStudentId(25);
		
		System.out.println(sId);
		val.passTheValueMethod(stu);
		System.out.println("2. The studentId is "+stu.getStudentId());
	}
	
	public void passTheValueMethod(int sId) {
		sId = 10;
		System.out.println("1. The sId is "+sId);
	}
	
	public void passTheValueMethod(Student stu) {
		stu.setStudentId(10);
		System.out.println("1. The studentId is "+stu.getStudentId());
	}
}
