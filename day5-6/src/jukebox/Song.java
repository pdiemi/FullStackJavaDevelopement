package jukebox;

public class Song {

	private String title;
	private String artist;
	private String rating;
	private String singer;
	
	public Song() {
		super();
	}

	public Song(String title, String artist, String rating, String singer) {
		super();
		this.title = title;
		this.artist = artist;
		this.rating = rating;
		this.singer = singer;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}

	/**
	 * @return the rating
	 */
	public String getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}

	/**
	 * @return the singer
	 */
	public String getSinger() {
		return singer;
	}

	/**
	 * @param singer the singer to set
	 */
	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", rating=" + rating + ", singer=" + singer + "]";
	}
	
	
}
