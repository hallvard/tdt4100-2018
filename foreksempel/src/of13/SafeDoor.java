package of13;

public class SafeDoor extends Door{
	
	private String combination ; 
	private boolean correctCombination = false; 
	
	public SafeDoor(String combination) {
		
		this.combination = combination; 
	}
	
	public void inputCombation(String combination) {
		if(combination.equals(this.combination)) {
			this.correctCombination = true; 
		}
		else {
			this.correctCombination = false; 
		}
	}
	
	@Override
	public void openDoor() {
		if(this.correctCombination) {
			super.openDoor(); 
		}
	}
	

}
