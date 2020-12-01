package regexdemos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//. --> single character
		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");
		boolean res = m.matches();
		
		System.out.println(res);
		
		//another way
		boolean res2 = Pattern.compile(".s").matcher("asus").matches();
		System.out.println(res2);
		
		//[abc] --> a or b or c
		System.out.println(Pattern.matches("[abc]", "a"));
		System.out.println(Pattern.matches("[abc]", "am"));
		
		//X ? --> X occurs once or not at all
		
		//X* --> X occurs zero or more times
		
		//X{n} --> X occurs n times only
	}

}
