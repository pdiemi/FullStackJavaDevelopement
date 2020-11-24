package accessmodifier;

public class PrivateSpecifier {

	private void display() {
		
		System.out.println("You are using private access specifier.\n");
	}
	void callDisplay() {
		display();
	}
}
