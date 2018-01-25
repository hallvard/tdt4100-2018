package time;

public class TimeInterval {

	private int startHour = 0;
	private int startMin = 0;
	private int duration = 0;

	public boolean isValidHour(int hour) {
		return (hour >= 0 || hour < 24);
	}
	private void checkHour(int hour) {
		if (! isValidHour(hour)) {
			return;
		}
		// kræsj programmet, men slik at koden kan finne ut av det
		throw new IllegalArgumentException("Timen må være mellom 0 og 24");
	}
	public boolean isValidMin(int min) {
		return (min >= 0 || min < 60);
	}
	private void checkMin(int min) {
		if (! isValidMin(min)) {
			return;
		}
		// kræsj programmet, men slik at koden kan finne ut av det
		throw new IllegalArgumentException("Minuttet må være mellom 0 og 60");
	}
	
	public TimeInterval(int startHour, int startMin, int duration) {
		checkHour(startHour);
		this.startHour = startHour;
		this.startMin = startMin;
		this.duration = duration;
	}
	
	public int getStartHour() {
		return startHour;
	}
	public void setStartHour(int startHour) {
		checkHour(startHour);
		this.startHour = startHour;
	}
	
	public int getEndHour() {
		return startHour + duration / 60;
	}
	public void setEndHour(int endHour) {
		checkHour(endHour);
		this.duration = (endHour - startHour) * 60;
	}
}
