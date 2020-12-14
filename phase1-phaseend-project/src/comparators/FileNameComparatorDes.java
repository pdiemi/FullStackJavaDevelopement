package comparators;

import java.io.File;
import java.util.Comparator;

public class FileNameComparatorDes implements Comparator<File>{

	@Override
	public int compare(File o1, File o2) {
		return o2.getName().compareTo(o1.getName());
	}

}
