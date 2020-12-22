package onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.utility.HibernateUtility;

public class LibraryClient {

	public static void main(String args[]) {

		Session session = HibernateUtility.getSession();
		// Create a sample book list
		List<Books> bookList = createSampleBookList();
		// Insert a new Library with sample book list to DB
		insertLibrary(session, 2001, "My Library", bookList);
		// Show all libraries
		System.out.println();
		selectAllLibrary(session);
		// Show all books
		System.out.println();
		selectAllBooks(session);
	}

	public static List<Books> createSampleBookList(){
		Books book1 = new Books(1001, "Java", "java author");
		Books book2 = new Books(1002, "Hibernate", "hibernate author");
		
		List<Books> bookList = new ArrayList<Books>();
		bookList.add(book1);
		bookList.add(book2);
		
		return bookList;
	}
	
	public static void selectAllLibrary(Session session) {
		/*
		 * Show all Library in the DB. 
		 * Equivalent to SELECT * FROM Library
		 */
		List<Library> data = session.createQuery("from Library").list();
		System.out.println("Library list:");
		for (Library l : data)
			System.out.println(l);
	}

	public static void selectAllBooks(Session session) {
		/*
		 * Show all Library in the DB. 
		 * Equivalent to SELECT * FROM Library
		 */
		List<Books> data = session.createQuery("from Books").list();
		System.out.println("book list:");
		for (Books b : data)
			System.out.println(b);
	}
	
	public static void insertLibrary(Session session, int libraryId, String libraryName, List<Books> bookList) {
		/*
		 * Insert a new Library into DB. 
		 * Equivalent to INSERT INTO Library
		 */
		Transaction tx = session.beginTransaction();
		Library library = new Library(libraryId, libraryName, bookList);
		//session.save(libraryBooks);  // by using cascade, this line is done automatically
		session.save(library);
		tx.commit();
		System.out.println("Library added");
	}

}
