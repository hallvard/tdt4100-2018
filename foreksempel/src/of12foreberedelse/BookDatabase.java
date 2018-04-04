package of12foreberedelse;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BookDatabase implements IBookDatabase {
	public Map<Book, Integer> ownedBooks = new HashMap<>();
	public Map<Book, Integer> freeBooks = new HashMap<>();
	
	@Override
	public void add(Book e) {
		ownedBooks.put(e, ownedBooks.getOrDefault(e, 0) + 1);
		freeBooks.put(e, freeBooks.getOrDefault(e, 0) + 1);
	}

	@Override
	public void remove(Book e) {
		Integer free = freeBooks.get(e);
		if (free != null) {
			ownedBooks.put(e, ownedBooks.getOrDefault(e, 0) - 1);
			freeBooks.put(e, free - 1);
		}
	}

	@Override
	public boolean contains(Book e) {
		return ownedBooks.containsKey(e);
	}

	@Override
	public boolean containsByPredicate(Predicate<Book> predicate) {
		return ownedBooks.keySet().stream().anyMatch(predicate);
	}

	@Override
	public Collection<Book> getFiltered(Predicate<Book> predicate) {
		return ownedBooks.keySet().stream().filter(predicate).collect(Collectors.toList());
	}

	@Override
	public int getCount(Book book) {
		return ownedBooks.getOrDefault(book, 0);
	}

	@Override
	public int getFreeCount(Book book) {
		return freeBooks.getOrDefault(book, 0);
	}

	@Override
	public boolean borrow(Book book) {
		Integer numFree = freeBooks.getOrDefault(book, ownedBooks.getOrDefault(book, 0));
		if (numFree > 0) {
			freeBooks.put(book, numFree - 1);
			return true;
		}
		return false;
	}

	@Override
	public boolean returnBorrowed(Book book) {
		if (ownedBooks.containsKey(book) && ownedBooks.get(book) > freeBooks.getOrDefault(book, ownedBooks.get(book))) {
			freeBooks.put(book, freeBooks.getOrDefault(book, 0) + 1);
			return true;
		}
		return false;
	}

}
