package of12;

public interface IBookDatabase extends Database<Book> {
	int getCount(Book book);
	int getFreeCount(Book book);
	boolean borrow(Book book);
	boolean returnBorrowed(Book book);
}
