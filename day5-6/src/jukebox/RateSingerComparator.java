package jukebox;

import java.util.*;

public class RateSingerComparator implements Comparator<Song>{

	@Override
	public int compare(Song o1, Song o2) {
		/*
		 * This Comparator compares on rating first, then singer
		 * */
		if (o1.getRating().compareToIgnoreCase(o2.getRating()) < 0)
			return -1;
		else if (o1.getRating().compareToIgnoreCase(o2.getRating()) > 0)
			return 1;
		else if (o1.getSinger().compareToIgnoreCase(o2.getSinger()) < 0)
			return -1;
		else if (o1.getSinger().compareToIgnoreCase(o2.getSinger()) > 0)
			return 1;
		else
			return 0;
	}

}
