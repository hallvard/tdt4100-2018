package average;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class AverageController {

	Average average = new Average();
	
	@FXML TextField input;
	@FXML Text output;

	@FXML
	void handleClick() {
		String s = input.getText();
		double value = Double.valueOf(s);
		average.acceptValue(value);
		double avg = average.getAverage();
		output.setText(String.valueOf(avg));
	}
}
