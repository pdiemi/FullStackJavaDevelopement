package accessmodifier;

public class AccessSpecifier {

	public static void main(String[] args) {
		//Using default specifier
		System.out.println("Default access specifier:");
		DefaultSpecifier def = new DefaultSpecifier();
		def.display();

		//Using private specifier
		System.out.println("Private access specifier:");
		PrivateSpecifier pri = new PrivateSpecifier();
		pri.callDisplay();
		
		//Using protected specifier
		System.out.println("Protected access specifier within same package:");
		ProtectedSpecifier pro = new ProtectedSpecifier();
		pro.display();
		
		//Using public specifier
		System.out.println("Public access specifier within same package:");
		PublicSpecifier pub = new PublicSpecifier();
		pub.display();
	}

}
