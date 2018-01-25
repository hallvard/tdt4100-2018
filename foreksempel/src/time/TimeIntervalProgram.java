package time;

public class TimeIntervalProgram {

	public static void main(String[] args) {
		TimeInterval ti1 = new TimeInterval(12, 15, 105);
		ti1.setStartHour(-1);
		System.out.println(ti1.getStartHour());
	}
}
