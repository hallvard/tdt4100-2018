package timeinterval;

public class TimeIntervalApp {

	public static void main(String[] args) {
		// lag tidsintervall tilsvarende tirsdagsforelesningen
		TimeInterval timeInterval = new TimeInterval1(14, 15, 16, 00);
		System.out.println(timeInterval);
		// beregn lengden, skal bli 2 * 45 + 15 = 105
		System.out.println(timeInterval.getDuration());
		// skal utløse unntak
		new TimeInterval1(14, 15, 14, 00);
	}
}
