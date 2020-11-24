package accessmodifier;

public class ProtectedSpecifier {

	protected void display() {
		
		System.out.println("You are using protected access specifier.\n");
	}
	void callDisplay() {
		display();
	}
}
