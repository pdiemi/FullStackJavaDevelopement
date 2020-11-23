package day2;

public class UserType {

	String name;
	
	UserType(String parameterVal){
		name = parameterVal;
	}
	
	UserType(){
		this("student");
	}
	
	public static void main(String args[]) {
		UserType u1 = new UserType("Falcuty");
		UserType u2 = new UserType();
		
		System.out.println(u1.name);
		System.out.println(u2.name);
	}
}
