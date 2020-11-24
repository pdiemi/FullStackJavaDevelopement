package collectiondemos;

import java.util.Comparator;

public class CityComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmpCity().compareToIgnoreCase(o2.getEmpCity());
	}

}
