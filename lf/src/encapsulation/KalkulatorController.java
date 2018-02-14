package encapsulation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class KalkulatorController {
	private Kalkulator kalkulator = new Kalkulator();
	
	@FXML
	private TextField valueTextField;
	
	@FXML
	public void updateValueTextField() {
		valueTextField.setText(kalkulator.getValueText());
	}
	
	@FXML
	public void handleDigitButton(ActionEvent event) {
		Button button = (Button) event.getSource();
		kalkulator.appendDigit(button.getText());
		updateValueTextField();
	}
	
	@FXML
	public void handleDecimalButton(ActionEvent event) {
		kalkulator.addDecimalPoint();
		updateValueTextField();
	}
	
	@FXML
	public void computeAndStoreValue(ActionEvent event) {
		Button button = (Button) event.getSource();
		String operator = button.getText();
		kalkulator.computeAndStoreValue(operator);
		updateValueTextField();
	}
}
