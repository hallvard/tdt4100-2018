package interfaceeksempler3;

/*
 * Generaliserer måledata til å omfatte
 * - selve målepunktverdien
 * - tid/antall som målepunktet er aggregert over
 * Mange ulike typer måledata kan passe til dette, og
 * kan dermed implementere grensesnittet.
 * Se StepData og TempData for eksempler.
 */
public interface MeasurementData {

	// Selve målepunktverdien
	public double getValue();
	// tid/antall som målepunktet er aggregert over
	public double getValueCount();
}
