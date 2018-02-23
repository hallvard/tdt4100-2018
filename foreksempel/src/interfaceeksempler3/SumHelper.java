package interfaceeksempler3;

/*
 * Klasse som hjelper process-metoden i Steps eller Temps
 * med å akkumulere målepunktverdier.
 * Implementerer ProcessHelper-grensesnittet på sin egen måte.
 */
public class SumHelper implements ProcessHelper {

	private double sum = 0.0;

	// Akkumulerer selve målepunktverdien
	@Override
	public void accumulate(MeasurementData data) {
		sum += data.getValue();
	}

	// Resultatet er summen
	@Override
	public double getResult() {
		return sum;
	}
}
