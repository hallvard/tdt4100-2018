package of13forberedelse;

public class Door {
	
	private boolean open ; 
	
	public Door() {
		open = false; 
	}
	
	public void openDoor() {
		this.open = true; 
	}
	
	public void closeDoor() {
		this.open = false; 
	}

}
