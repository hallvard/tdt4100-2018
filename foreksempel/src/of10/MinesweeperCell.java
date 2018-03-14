package of10;

public class MinesweeperCell {
	
	private char value = 'x'; 
	private boolean isBomb = false; 
	
	public boolean isBomb() {
		return isBomb; 
	}
	
	public char getValue() {
		return value; 
	}
	
	public void setBomb() {
		isBomb = true; 
	}
	
	public String toString() {
		return ""+ this.value; 
	}
	
	public void openCell(int count) {
		if (this.isBomb()) {
			this.value = 'B';
			return ; 
		}
		this.value = Character.forDigit(count, 10);
	}
	
	public void setFlag() {
		if(this.value=='x') {
		this.value = 'F'; 
		}
	}
}
