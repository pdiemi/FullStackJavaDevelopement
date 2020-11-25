package jukebox;

import java.io.*;
import java.util.*;


public class JukeBox {

	ArrayList<Song> playList = new ArrayList<Song>();
	
	public static void main(String[] args) {
		
		new JukeBox().go();
	}

	public void go() {
		getSong();
		
		
		//TODO: sort the playList by rating then by singer 
		Collections.sort(playList, new RateSingerComparator());
		
		for (Object ob : playList) {
			System.out.println(ob);
		}
	}
	
	public void getSong() {
		try {
			File file = new File("songs.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = br.readLine()) != null) {
				addSong(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void addSong(String lineToParse) {
		String tokens[]	= lineToParse.split("/");
		Song song = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		playList.add(song);
	}
}
