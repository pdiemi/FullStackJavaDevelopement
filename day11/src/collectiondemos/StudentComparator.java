package collectiondemos;

import java.util.Comparator;

public class StudentComparator implements Comparator<Students> {

	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		return o1.stuId.compareTo(o2.stuId)
;	}

}
