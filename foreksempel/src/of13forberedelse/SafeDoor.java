package of13forberedelse;

public class SafeDoor extends Door {
	
	String combination; 
	boolean correctInput = false; 
	
	
	public SafeDoor(String combination) {
		super(); 
		this.combination = combination ; 
	}
	
	public void enterCombination(String combination) {
		if (combination.equals(this.combination)){
			this.correctInput = true; 
		}
		else {
			this.correctInput = false; 
		}
	}
	@Override
	public void openDoor() {
		if (this.correctInput) {
			super.openDoor();
		}
	}
	
	

}
