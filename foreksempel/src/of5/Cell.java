package of5;

public class Cell {
	
	private int value; 
	
	public int getValue() {
		return value;
	}

	public Cell(int value) {
		this.value = value; 
	}
	//Cellen er tom om verdien er 0
	public boolean isEmpty() {
		return value==0;
	}
	
	public String toString() {
		return ""+value;
	}
	
	
}
