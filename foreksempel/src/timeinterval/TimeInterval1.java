package timeinterval;

public class TimeInterval1 implements TimeInterval {

	private int startHour, startMin;
	private int endHour, endMin;
	
	public TimeInterval1(int startHour, int startMin, int endHour, int endMin) {
		checkInteger(0, 23, startHour, "Start hour");
		checkInteger(0, 59, startHour, "Start min");
		checkInteger(0, 23, endHour, "End hour");
		checkInteger(0, 59, endMin, "End min");
		checkInteger(0, 24 * 60, computeDuration(startHour, startMin, endHour, endMin), "Duration");
		this.startHour = startHour;
		this.startMin = startMin;
		this.endHour = endHour;
		this.endMin = endMin;
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d-%02d:%02d", getStartHour(), getStartMin(), getEndHour(), getEndMin());
	}

	private void checkInteger(int min, int max, int value, String prop) {
		if (value < min || value > max) {
			throw new IllegalArgumentException(prop + " must be between " + min + " and " + max + ", but was " + value);
		}
	}
	
	@Override
	public int getStartHour() {
		return startHour;
	}
	
	@Override
	public int getStartMin() {
		return startMin;
	}
	
	@Override
	public int getEndHour() {
		return endHour;
	}
	
	@Override
	public int getEndMin() {
		return endMin;
	}

	private int computeDuration(int startHour, int startMin, int endHour, int endMin) {
		return (endHour - startHour) * 60 + (endMin - startMin);
	}

	@Override
	public int getDuration() {
		return computeDuration(getStartHour(), getStartMin(), getEndHour(), getEndMin());
	}

	//

	public static void main(String[] args) {
		// lag tidsintervall tilsvarende tirsdagsforelesningen
		TimeInterval1 timeInterval = new TimeInterval1(14, 15, 16, 00);
		System.out.println(timeInterval);
		// beregn lengden, skal bli 2 * 45 + 15 = 105
		System.out.println(timeInterval.getDuration());
		// skal utløse unntak
		new TimeInterval1(14, 15, 14, 00);
	}
}
