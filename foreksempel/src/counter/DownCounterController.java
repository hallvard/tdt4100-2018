package counter;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class DownCounterController {

	DownCounter downCounter = new DownCounter(3);
	
	@FXML TextField input;
	@FXML Text output;

	@FXML
	void handleNew() {
		downCounter = new DownCounter(Integer.valueOf(input.getText()));
		updateOutput();
	}

	void updateOutput() {
		String outputString = "Ferdig? ";
		if (downCounter.isFinished()) {
			outputString += "Ja";
		} else {
			outputString += "Nei";			
		}
		output.setText(outputString);
	}
	
	@FXML
	void handleCountDown() {
		downCounter.countDown();
		updateOutput();
	}
}
