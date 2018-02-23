package interfaceeksempler3;

/*
 * Klasse som hjelper process-metoden i Steps eller Temps med å akkumulere
 * målepunktverdier og tida de er målt over,
 * så den kan beregne snittet som resultat.
 * Implementerer ProcessHelper-grensesnittet på sin egen måte.
 */
public class AverageHelper implements ProcessHelper {

	private int count = 0;
	private double sum = 0.0;

	// Akkumulerer målepunktverdier og tida de er aggregert over
	@Override
	public void accumulate(MeasurementData data) {
		sum += data.getValue();
		count += data.getValueCount();
	}

	// Resultatet er snittet
	@Override
	public double getResult() {
		return sum / count;
	}
}
