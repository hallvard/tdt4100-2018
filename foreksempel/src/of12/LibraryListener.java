package of12;

public interface LibraryListener {
	static final int BOOKS=0, BORROWERS=1;
	void libraryChanged(int type, Library l);
}
