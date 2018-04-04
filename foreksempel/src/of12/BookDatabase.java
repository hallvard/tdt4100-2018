package of12;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;

public class BookDatabase implements IBookDatabase{
	Map<Book, Integer> ownedBooks;
	Map<Book, Integer> freeBooks;
	
	public BookDatabase() {
		ownedBooks = new HashMap<>();
		freeBooks = new HashMap<>();
	}
	
	@Override
	public void add(Book e) {
		if (contains(e)) {
			ownedBooks.put(e, ownedBooks.get(e) + 1);
			freeBooks.put(e, freeBooks.get(e) + 1);
		} else {
			ownedBooks.put(e, 1);
			freeBooks.put(e, 1);
		}
	}

	@Override
	public void remove(Book e) {
		if (contains(e) && freeBooks.get(e) > 0) {
			ownedBooks.put(e, ownedBooks.get(e) - 1);
			freeBooks.put(e, freeBooks.get(e) - 1);
		}
	}

	@Override
	public boolean contains(Book e) {
		return ownedBooks.containsKey(e) 
				&& ownedBooks.get(e) > 0;
	}

	@Override
	public boolean containsByPredicate(Predicate<Book> predicate) {
		for (Entry<Book, Integer> entry : ownedBooks.entrySet()) {
			if (entry.getValue() > 0
					&& predicate.test(entry.getKey())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Collection<Book> getFiltered(Predicate<Book> predicate) {
		Collection<Book> filtered = new HashSet<>();
		for (Entry<Book, Integer> entry : ownedBooks.entrySet()) {
			if (entry.getValue() > 0
					&& predicate.test(entry.getKey())) {
				filtered.add(entry.getKey());
			}
		}
		return filtered;
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
		if (getFreeCount(book) > 0) {
			freeBooks.put(book, freeBooks.get(book) - 1);
			return true;
		}
		return false;
	}

	@Override
	public boolean returnBorrowed(Book book) {
		if (getCount(book) > getFreeCount(book)) {
			freeBooks.put(book, freeBooks.get(book) + 1);
			return true;
		}
		return false;
	}

}
