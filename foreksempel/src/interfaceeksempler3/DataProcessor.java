package interfaceeksempler3;

/*
 * Generelt grensesnitt for objekter som inneholder målepunktdata, og
 * som ønsker å støtte prosessering av dem på en standard måte.
 */
public interface DataProcessor {

	/*
	* process-metoden går gjennom alle målepunktene og
	* kaller ProcessHelper sine metoder.
	 */
	public double process(ProcessHelper helper);
	
	//
	
	// Generell implementasjon av sum, uavhengig av f.eks. Steps og Temps
	default double sum(DataProcessor dataProcessor) {
		return dataProcessor.process(new SumHelper());
	}

	// Generell implementasjon av average, uavhengig av f.eks. Steps og Temps
	default double average(DataProcessor dataProcessor) {
		return dataProcessor.process(new AverageHelper());
	}
}
