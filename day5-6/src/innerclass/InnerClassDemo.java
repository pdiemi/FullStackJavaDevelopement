package innerclass;

public class InnerClassDemo {

	private static final int ARRAY_SIZE = 15;
	private int[] arrayOfInts = new int[ARRAY_SIZE];
	
	public InnerClassDemo() {
		for (int i=0; i<ARRAY_SIZE; i++) {
			arrayOfInts[i] = i;
		}
	}
	
	public void printEven() {
		InnerEvenIterator it = new InnerEvenIterator();
		while (it.hasNext()) {
			System.out.println(it.getNext() + "\t");
		}
	}
	
	private class InnerEvenIterator {
		private int next = 0;
		
		private boolean hasNext() {
			return (next <= ARRAY_SIZE - 1);
		}
		
		private int getNext() {
			int returnValue = arrayOfInts[next];
			next += 2;
			return returnValue;
		}
	}
	
	public static void main(String[] args) {
		InnerClassDemo icd = new InnerClassDemo();
		icd.printEven();

	}

}
