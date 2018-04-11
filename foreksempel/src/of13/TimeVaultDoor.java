package of13;

import java.time.LocalDateTime;

public class TimeVaultDoor extends Door{

	
	@Override
	public void openDoor() {
		int hour = LocalDateTime.now().getHour(); 
		if(hour>8 && hour <13) {
			super.openDoor(); 
		}	
	}
	
	
	public static void main(String[] args) {
		Door tvd = new TimeVaultDoor(); 
		Door safe = new SafeDoor("ABCD");
		System.out.println(tvd); 
		System.out.println(safe);
		
		
		
		tvd.openDoor();
		//safe.inputCombation("ABCD");
		//safe.openDoor(); 
		System.out.println(tvd); 
		//System.out.println(safe);
		
	}
}
