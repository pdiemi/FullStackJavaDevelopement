package day2;

//Program 2: loop and continue
class ControlContinue {

	public static void main (String args[]) {
		boolean bool = true;
		 for(int i=0;i<5; i++) {
			 for(int j=0; j<10; j++) {
				 System.out.println(j + "\t");
				 if(j>5) {
					 System.out.println();
					 continue;
				 }
			 }
			 System.out.println("Outer loop");
		 }
		 System.out.println("End");
	}
}
