package collectiondemos;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {

		PriorityQueue<String> pq = new PriorityQueue<String>();
		 pq.add("admin");
		 pq.add("manager");
		 pq.add("supervisor");
		 pq.add("tester");
		 
		 System.out.println(pq.element());
		 
		 System.out.println(pq.peek());
		
		 Iterator<String> itr = pq.iterator();
		 while (itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 pq.remove();
		 pq.poll();
		
		 Iterator<String> itr2 = pq.iterator();
		 while (itr2.hasNext()) {
			 System.out.println(itr2.next());
		 }
		 
	}

}
