package of12foreberedelse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Library {
	private Database<Person> borrowers = new BorrowerDatabase();
	private IBookDatabase books = new BookDatabase();
	private Map<Person, List<Book>> borrows = new HashMap<>();
	private Set<LibraryController> observers = new HashSet<>();
	
	public boolean borrow(Person borrower, Book book) {
		if (borrowers.contains(borrower) && books.borrow(book)) {
			List<Book> personBorrows = borrows.getOrDefault(borrower, new ArrayList<>());
			personBorrows.add(book);
			borrows.put(borrower, personBorrows);
			notifyObservers(LibraryChangeEvent.BOOKS);
			return true;
		}
		return false;
	}
	
	public boolean returnBook(Person borrower, Book book) {
		if (borrowers.contains(borrower) 
				&& borrows.getOrDefault(borrows, Collections.emptyList()).contains(book)
				&& books.returnBorrowed(book)) {
			borrows.get(borrower).remove(book);
			return true;
		}
		return false;
	}
	
	public IBookDatabase getBooks() {
		return books;
	}
	
	public void addBook(Book book) {
		books.add(book);
		notifyObservers(LibraryChangeEvent.BOOKS);
	}
	
	public void addBorrower(Person p) {
		borrowers.add(p);
	}
	
	public void addObserver(LibraryController ctr) {
		observers.add(ctr);
	}
	
	public void notifyObservers(int type) {
		for (LibraryController ctr : observers) {
			ctr.propertyChanged(new LibraryChangeEvent(type, this));
		}
	}
}
