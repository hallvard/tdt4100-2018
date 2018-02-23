package interfaceeksempler2;

/*
 * Klasse for skrittellingsmålepunkter.
 * count angir antall skritt og seconds antall sekunder en brukte.
 */
public class StepData implements MeasurementData {

	// Bruker final for å angi at verdiene ikke kan endres,
	// etter at de er satt i konstruktøren.
	// Da gjør det ikke så mye at de er public.
	public final int count;
	public final int seconds;

	// Må sette alle final-variabler i konstruktøren
	public StepData(int count, int seconds) {
		this.count = count;
		this.seconds = seconds;
	}

	// Målepunktverdien er count-tallet
	@Override
	public double getValue() {
		return count;
	}

	// Tida som målepunktverdien er aggregert over er seconds
	@Override
	public double getValueCount() {
		return seconds;
	}
}
