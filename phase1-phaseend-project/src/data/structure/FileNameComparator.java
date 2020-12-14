package data.structure;

import java.io.File;
import java.util.Comparator;

public class FileNameComparator implements Comparator<File>{

	@Override
	public int compare(File o1, File o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
