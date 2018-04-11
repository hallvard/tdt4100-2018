package of13forberedelse;

import java.time.LocalDateTime;

public class TimeVaultDoor extends Door{

	public TimeVaultDoor() {
		super(); 
	}
	
	@Override
	public void openDoor() {
		int hour = LocalDateTime.now().getHour();
		if (hour>8 && hour < 17) {
			super.openDoor();
		}
	}
	
	public static void main(String[] args) {
		TimeVaultDoor door = new TimeVaultDoor(); 
		Door safe = new SafeDoor("ABCD");
		
		SafeDoor safeDoor = (SafeDoor) safe;
	
		
		
	}
	
}
