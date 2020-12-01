package stringdemos;

public class StringDemo2 {

	public static void main(String[] args) {
		
		byte b[] = {65, 66, 67, 68, 69, 70};

		String sc1 = new String(b);
		System.out.println(sc1);

		/*
		 * String(array-source, position-to-start, number-of-elements)
		 * */
		String sc2 = new String(b, 2, 3); 
		System.out.println(sc2);

		System.out.println("------------------------------------------------------------");

		char c1[] = {'a', 'b', 'c', 'd', 'e', 'f'};

		String sc3 = new String(c1, 2, 3);
		System.out.println(sc3);

		System.out.println("------------------------------------------------------------");
		char c2[] = {'J', 'a', 'v', 'a'};

		String sc4 = new String(c2);
		String sc5 = new String(sc4);

		System.out.println(sc4);
		System.out.println(sc5);

		System.out.println("------------------------------------------------------------");
		System.out.println(" String Length ");

		System.out.println(sc4.length());

		System.out.println("Java".length());

		System.out.println("------------------------------------------------------------");
		System.out.println("Special String Operarions... ");
		System.out.println();
		System.out.println("Concatenation Operation");

		String s1 = "First String";
		String s2 = "Second String";
		String s3 = s1 + " and " + s2; // Concatenation Operation

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println("------------------------------------------------------------");
		System.out.println();
		System.out.println("Concatenation Operation with Other data types");
		int a = 9;

		String s = "He is " + a + " years old";

		System.out.println(s);

		s = "four : " + 2 + 2;

		System.out.println(s);

		s = "four : " + (2 + 2);

		System.out.println(s);

		System.out.println("------------------------------------------------------------");
		System.out.println();
		System.out.println("Character Extraction...");

		System.out.println("Length of s1 " + s1.length());

		System.out.println("Char at index 3 in s1 " + s1.charAt(3));

		String s4 = "This is a demo of the getChars method.";
		int start = 10;
		int end = 14;
		char buf[] = new char[end - start];

		s4.getChars(start, end, buf, 0);

		System.out.println(buf);

		System.out.println("------------------------------------------------------------");
		System.out.println();
		System.out.println("String Comparison...");
		s3 = s1;

		if(s1.equals(s2))
			System.out.println(" s1 == s2 ");
		else
			System.out.println(" s1 != s2 ");

		if(s1.equals(s3))
			System.out.println(" s1 == s3 ");
		else
			System.out.println(" s1 != s3 ");

		System.out.println("------------------------------------------------------------");

		String s5 = "Hello";
		String s6 = "HELLO";

		System.out.println(s5 + " equals " + s6 + " --> " + s5.equals(s6));
		System.out.println(s5 + " equalsIgnoreCase " + s6 + " --> " + s5.equalsIgnoreCase(s6));

		System.out.println("------------------------------------------------------------");

		// The regionMatches() method compares 
		// a specific region inside a string with another 
		// specific region in another string

		System.out.println( "Syntax : boolean regionMatches(int startIndex, String str2, int str2StartIndex, int numChars)" );
		System.out.println( "Syntax : boolean regionMatches(boolean ignoreCase, int startIndex, String str2, int str2StartIndex, int numChars)" );

		String s7 = "Welcome to CMC, Ameerpet";
		String s8 = "Welcome to cmc, Dilshuknagar";

		System.out.println(s7.regionMatches(0, s8, 0, 10));

		System.out.println(s7.regionMatches(true, 0, s8, 0, 14));

		System.out.println("------------------------------------------------------------");
		System.out.println("--- startsWith() and endsWith() methods ----");
		s7 = "Welcome to CMC, Ameerpet";

		System.out.println(s7.startsWith("Welcome"));

		System.out.println(s7.endsWith("Ameerpet"));

		System.out.println(s7.startsWith("come", 3));

		System.out.println("------------------------------------------------------------");
		// The equals() method compares the characters inside s String object. 
		// The == operator compares two object references to see whether they refer to the same instance.
		System.out.println("---			equals() Vs ==		----");

		String s9 = "Hello";
		String s10 = new String(s9);

		System.out.println(s9 + " equals " + s10 + " --> " + s9.equals(s10));
		System.out.println(s9 + "   ==   " + s10 + " --> " + (s9 == s10));

		System.out.println("------------------------------------------------------------");

		for(int i=0; i<args.length; i++)
			System.out.println("args[ "+ i + " ] : " + args[i]);

		System.out.println("------------------------------------------------------------");
		System.out.println("---		Searching Strings		----");

		String s11 = "Now is the time for all good men to come to the aid of their country.";

		System.out.println(s11);

		System.out.println("indexof(t)" + s11.indexOf('t'));
		System.out.println("lastIndexof(t)" + s11.lastIndexOf('t'));

		System.out.println("indexof(the)" + s11.indexOf("the"));
		System.out.println("lastIndexof(the)" + s11.lastIndexOf("the"));

		System.out.println("indexof(t, 10)" + s11.indexOf('t', 10));
		System.out.println("lastIndexof(t, 60)" + s11.lastIndexOf('t', 60));

		System.out.println("indexof(the, 10)" + s11.indexOf("the", 10));
		System.out.println("lastIndexof(the, 60)" + s11.lastIndexOf("the", 60));

		System.out.println("------------------------------------------------------------");
		System.out.println("---		Modifying a String		----");
		
		String s12 = "This is a test. This is, too.";

		String search = "is";
		String sub = "was";
		String result = "";
		int i;

		do
		{
			System.out.println(s12);
			i = s12.indexOf(search);

			if(i != -1)
			{
				result = s12.substring(0, i);
				result = result + sub;
				result = result + s12.substring(i + search.length());
				s12 = result;
			}
		}while(i != -1);

		System.out.println(s12);
/*
		System.out.println("------------------------------------------------------------");
		System.out.println("---		concat() method		----");
		String s12 = "This is a test. This is, too.";

		String s13 = s12.concat("Hello.");
		System.out.println(s13);

		System.out.println("------------------------------------------------------------");
		System.out.println("---		replace() method	----");

		String s14 = "Hello".replace('l', 'w');
		System.out.println(s14);

		System.out.println("------------------------------------------------------------");
		System.out.println("---		trim() method	----");

		String s15 = "    Hello World     ".trim();
		System.out.println(s15);

		System.out.println("------------------------------------------------------------");
		// The valueOf() method converts data from its internal format into a human-readable
		// form. It is a static method that is overloaded within String to be converted properly
		// into a string.
		//		static String valueOf(double num)
		//		static String valueOf(long num)
		//		static String valueOf(Object obj)
		//		static String valueOf(char ch[], int startIndex, int numChars)

		System.out.println("---		valueOf() method	----");
		String s15 = "    Hello World     ".trim();

		double d = 20.28;

		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(s15));

		System.out.println("------------------------------------------------------------");
		System.out.println("---		Case Conversion		----");
		
		String s16 = "This is a test.";

		System.out.println("Original String : " + s16);

		String upper = s16.toUpperCase();
		String lower = s16.toLowerCase();
		
		System.out.println("Uppercase String : " + upper);
		System.out.println("Lowercase String : " + lower);
*/
	}

}
