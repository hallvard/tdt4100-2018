package of12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Library {
	Database<Person> borrowers;
	IBookDatabase books;
	Map<Person, ArrayList<Book>> borrowedBooks;
	Set<LibraryListener> observers;
	
	public Library() {
		borrowers = new PersonDatabase();
		books = new BookDatabase();
		borrowedBooks = new HashMap<>();
		observers = new HashSet<>();
	}
	
	public void addObserver(LibraryListener observer) {
		observers.add(observer);
	}
	
	private void notifyObservers(int type) {
		for (LibraryListener obs : observers) {
			obs.libraryChanged(type, this);
		}
	}
	
	public IBookDatabase getBooks(){
		return books;
	}
	
	public void addBorrower(Person p) {
		borrowers.add(p);
		notifyObservers(LibraryListener.BORROWERS);
	}
	
	public void removeBorrower(Person p) {
		borrowers.remove(p);
		notifyObservers(LibraryListener.BORROWERS);
	}
	
	public void addBook(Book b) {
		books.add(b);
		notifyObservers(LibraryListener.BOOKS);
	}
	
	public void removeBook(Book b) {
		books.remove(b);
		notifyObservers(LibraryListener.BOOKS);
	}
	
	public boolean borrow(Person borrower, Book book) {
		if (borrowers.contains(borrower)
				&& books.borrow(book)) {
			if (borrowedBooks.containsKey(borrower)) {
				borrowedBooks.get(borrower).add(book);
			} else {
				borrowedBooks.put(borrower, new ArrayList(Arrays.asList(book)));
			}
			notifyObservers(LibraryListener.BORROWERS);
			notifyObservers(LibraryListener.BOOKS);
			return true;
		}
		return false;
	}
	
	public boolean returnBook(Person borrower, Book book) {
		if (borrowedBooks.getOrDefault(borrower, new ArrayList<>()).contains(book)) {
			books.returnBorrowed(book);
			borrowedBooks.get(borrower).remove(book);
			notifyObservers(LibraryListener.BORROWERS);
			notifyObservers(LibraryListener.BOOKS);
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Library l = new Library();
		Person p = new Person();
		l.addBook(new Book("Dorian Gray", "Oscar Wilde"));
		l.addBorrower(p);
		
		System.out.println(l.borrow(p, new Book("Dorian Gray", "Oscar Wilde")));
		System.out.println(l.borrow(p, new Book("Dorian Gray", "Oscar Wilde")));
		System.out.println(l.returnBook(p, new Book("Dorian Gray", "Oscar Wilde")));
	}
}
