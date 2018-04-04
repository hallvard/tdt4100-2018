package of12foreberedelse;

public class LibraryChangeEvent {
	public static final int BOOKS = 0, BORROWERS = 1;
	private int type;
	private Library library;
	
	public LibraryChangeEvent(int type, Library library) {
		this.type = type;
		this.library = library;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}
}
