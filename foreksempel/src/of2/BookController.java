package of2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class BookController {
	
	private Book book;

	
	@FXML
	private TextField name;
	@FXML
	private TextField pages;
	
	@FXML
	private TextField sidetall;
	
	@FXML
	private Button blafrem; 
	
	@FXML
	private Button blabak; 
	

	@FXML
	private void initialize() {
		sidetall.setDisable(true);
		System.out.println(sidetall);
		blafrem.setDisable(true);
		blabak.setDisable(true);
		
	}
	
	@FXML
	private void handleCreateAction() {
		String bookName = name.getText(); 
		int bookPages = getIntFromTextField(pages); 
		this.book = new Book(bookName, bookPages);
		blafrem.setDisable(false);
		blabak.setDisable(false);
		update(); 
	}
	
	private void update() {
		sidetall.setText(Integer.toString(book.pageYouAreReading));
	}
	
	private int getIntFromTextField(TextField textField) {
		return Integer.parseInt(textField.getText());
	}
	
	@FXML
	private void turnForward() {
		this.book.flipToNextPage();
		update();
	}
	@FXML
	private void turnBackward() {
		this.book.flipToPreviousPage();
		update();
		
	}
}
