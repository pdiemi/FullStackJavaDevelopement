package accessmodifier2;

import accessmodifier.*;

public class AccessSpecifier2 extends ProtectedSpecifier{

	public static void main(String[] args) {
		//Using protected specifier
		System.out.println("Protected access specifier from another package:");
		AccessSpecifier2 pro = new AccessSpecifier2();
		pro.display();
		
		//Using public specifier
		System.out.println("Public access specifier from another package:");
		PublicSpecifier pub = new PublicSpecifier();
		pub.display();

	}

}
