package day2;

//Program 1: Loop ad break
class Control {

	public static void main (String args[]) {
		boolean bool = true;
		 for(int i=0;i<5; i++) {
			 for(int j=0; j<10; j++) {
				 System.out.println(j + "\t");
				 if(j>5) {
					 break;
				 }
			 }
			 System.out.println("Outer loop");
		 }
		 System.out.println("End");
	}
}
