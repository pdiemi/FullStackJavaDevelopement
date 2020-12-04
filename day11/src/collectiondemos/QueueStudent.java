package collectiondemos;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class QueueStudent {

	public static void main(String[] args) {

		PriorityQueue<Students> pq = new PriorityQueue<Students>(10, new StudentComparator());
		 pq.add(new Students("001", "A", "Austin", "Java"));
		 pq.add(new Students("005", "B", "Austin", "Java"));
		 pq.add(new Students("007", "C", "Austin", "Java"));
		 pq.add(new Students("004", "D", "Austin", "Java"));
		 
		 System.out.println(pq.element());
		 System.out.println();
		 
		 System.out.println(pq.peek());
		 System.out.println();
		 
		 Iterator<Students> itr = pq.iterator();
		 while (itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 
		 //pq.remove();
		 //pq.poll();
		 
		 
		 //Collections.sort((List<T>) pq);
		 
		 
		 System.out.println();
		 Iterator<Students> itr2 = pq.iterator();
		 while (itr2.hasNext()) {
			 System.out.println(itr2.next());
		 }
		 
	}

}
