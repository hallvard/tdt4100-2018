package of12foreberedelse;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public boolean equals(Object other) {
		if (other == null) return this == null;
		try {
			Book b = (Book) other;
			return b.getAuthor().equals(author) && b.getTitle().equals(title);
		} catch (ClassCastException e) {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + title.hashCode();
		result = 31 * result + author.hashCode();
		return result;
	}
	
	public List<String> getStrings(Library library){
		return Arrays.asList(getTitle(), getAuthor(), String.valueOf(library.getBooks().getFreeCount(this)), String.valueOf(library.getBooks().getCount(this)));
	}
}
