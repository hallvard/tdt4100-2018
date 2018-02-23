package interfaceeksempler1;

/*
 * Klasse som hjelper process-metoden i Steps med å akkumulere steg og
 * telle sekunder, så den kan beregne snittet som resultat.
 * Implementerer ProcessHelper-grensesnittet på sin egen måte.
 */
public class AverageHelper implements ProcessHelper {

	private int count = 0;
	private double sum = 0.0;
	
	@Override
	public void accumulate(StepData stepData) {
		sum += stepData.count;
		count += stepData.seconds;
	}

	@Override
	public double getResult() {
		return sum / count;
	}
}
