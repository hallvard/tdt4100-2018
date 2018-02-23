package interfaceeksempler1;

/*
 * Klasse for skrittellingsmålepunkter.
 * count angir antall skritt og seconds antall sekunder en brukte.
 */
public class StepData {

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
}
