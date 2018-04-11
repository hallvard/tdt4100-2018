package of13;

public class Door {
	
	private boolean open; 
	
	public Door() {
		this.open = false; 
	}
	
	
	public void openDoor() {
		this.open = true; 
	}
	
	protected void closeDoor() {
		this.open = false; 
	}
	
	public String toString() {
		if(this.open) {
			return "Døren er åpen"; 
		}
		return "Døren er lukket"; 
	}
	
	
}
