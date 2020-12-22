package onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Library {

	@Id
	private int libraryId;
	private String libraryName;
	
	@OneToMany (cascade = CascadeType.ALL)
	@JoinColumn (name = "library")
	private List<Books> books;

	public Library(int libraryId, String libraryName, List<Books> books) {
		super();
		this.libraryId = libraryId;
		this.libraryName = libraryName;
		this.books = books;
	}

	public int getLibraryId() {
		return libraryId;
	}

	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public List<Books> getBooks() {
		return books;
	}

	public void setBooks(List<Books> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Library [libraryId=" + libraryId + ", libraryName=" + libraryName + ", books=" + books + "]";
	}
	
	
}
