package time;

public class TimeInterval {

	private int startHour = 0;
	private int startMin = 0;
	private int duration = 0;
	
	public int getStartHour() {
		return startHour;
	}
	public void setStartHour(int startHour) {
		if (startHour < 0 || startHour >= 24) {
			// kræsj programmet, men slik at koden kan finne ut av det
			throw new IllegalArgumentException("Timen må være mellom 0 og 24");
		}
		this.startHour = startHour;
//		if (startHour >= 0 && startHour < 24) {
//			this.startHour = startHour;
//		}
	}
}
