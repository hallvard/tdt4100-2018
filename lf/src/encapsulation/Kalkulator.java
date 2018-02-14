package encapsulation;

import javafx.scene.control.Button;

public class Kalkulator {
	
	private String valueText = "";
	
	private double memory;
	
	private String operator;
	
	public String getValueText() {
		return valueText;
	}
	
	private void clearValueText() {
		valueText = "";
	}
	
	public void appendDigit(String digit) {
		valueText += digit;
	}
	
	private void setMemory(double value) {
		this.memory = value;
	}
	
	private void setOperator(String operator) {
		this.operator = operator;
	}
	
	public void addDecimalPoint() {
		if (!valueText.contains(".")) {
			appendDigit(".");
		}
	}
	
	public void computeAndStoreValue(String action) {
		if (valueText.isEmpty()) {
			return;
		}
		
		double value = Double.valueOf(valueText);
		
		if (this.operator == null) {
			setMemory(value);
		} else if (this.operator.equals("+")) {
			memory += value;
		} else if (this.operator.equals("-")) {
			memory -= value;
		} else if (this.operator.equals("*")) {
			memory *= value;
		} else if (this.operator.equals("/")) {
			memory /= value;
		}

		if (action.equals("=")) {
			setOperator(null);
			valueText = String.valueOf(memory);
		} else {
			setOperator(action);
			clearValueText();
		}
	}
}
