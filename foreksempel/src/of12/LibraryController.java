package of12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class LibraryController implements LibraryListener {
	private Library library;
	@FXML
	private TableView<List<String>> bookTable;
	
	public void initialize() {
		TableColumn<List<String>, String> col = new TableColumn("Title");
		col.setEditable(false);
		col.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().get(0)));
		bookTable.getColumns().add(col);
		
		TableColumn<List<String>, String> col2 = new TableColumn("Author");
		col2.setEditable(false);
		col2.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().get(1)));
		bookTable.getColumns().add(col2);
		
		TableColumn<List<String>, String> col3 = new TableColumn("Free");
		col3.setEditable(false);
		col3.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().get(2)));
		bookTable.getColumns().add(col3);
		
		TableColumn<List<String>, String> col4 = new TableColumn("Owned");
		col4.setEditable(false);
		col4.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().get(3)));
		bookTable.getColumns().add(col4);
		this.library = new Library();
		library.addObserver(this);
	}
	
	@FXML
	private void add() {
		if (Math.random() > .5) {
			library.addBook(new Book("Harry Potter and the Deathly Hallows", "J. K. Rowling"));
		}
		else {
			library.addBook(new Book("The Picture of Dorian Gray", "Oscar Wilde"));
		}
	}
	
	@FXML
	private void borrow() {
		List<String> selected = bookTable.getSelectionModel().getSelectedItems().get(0);
		Book b = new Book(selected.get(0), selected.get(1));
		library.borrow(null, b);
	}

	@Override
	public void libraryChanged(int type, Library l) {
		if (type != LibraryListener.BOOKS) return;
		this.library = library;
		List<List<String>> strings = new ArrayList<>();
		for (Book b : l.getBooks().getFiltered(a -> true)) {
			strings.add(Arrays.asList(b.getTitle(), b.getAuthor(), String.valueOf(l.getBooks().getFreeCount(b)), String.valueOf(l.getBooks().getCount(b))));
		}
		bookTable.getItems().setAll(strings);
	}
}
