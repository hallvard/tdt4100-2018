package of6forberedelse;

public class MineSweeperCell {
	
	private char value = 'x' ; 
	private boolean isBomb = false; 
	public char getValue() {
		return value; 
	}
	public MineSweeperCell() {
		
	}
	public void setBomb() {
		isBomb = true;  
	}
	
	public boolean isBomb() {
		return isBomb; 
	}
	public void openCell(int count) {
		if (isBomb()) {
			this.value = 'B';
			
		}
		else {
		this.value = Character.forDigit(count, 10);}
	}
	
	public String toString() {
		return ""+value;
	}
	
}
