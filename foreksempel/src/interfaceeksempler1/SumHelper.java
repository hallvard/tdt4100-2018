package interfaceeksempler1;

/*
 * Klasse som hjelper process-metoden i Steps med å akkumulere steg.
 * Implementerer ProcessHelper-grensesnittet på sin egen måte.
 */
public class SumHelper implements ProcessHelper {

	private double sum = 0.0;

	@Override
	public void accumulate(StepData stepData) {
		sum += stepData.count;
	}

	@Override
	public double getResult() {
		return sum;
	}
}
