package interfaceeksempler3;

import java.util.ArrayList;
import java.util.List;

/*
 * Klasse som samler mange skrittellingsmålinger i en to-nivå-struktur.
 */
public class Steps implements DataProcessor {

	/*
	 * En liste av liste av målepunkter.
	 * De "indre" listene er segmenter som f.eks. tilsvarer en tur.
	 * Hvert målepunkt kan f.eks. være skrittellinger for ca. hvert minutt.
	 */
	public List<List<StepData>> stepSegments = new ArrayList<List<StepData>>();

	public void startNewSegment() {
		stepSegments.add(new ArrayList<StepData>());
	}

	public void addStepData(StepData stepData) {
		if (stepSegments.isEmpty()) {
			throw new IllegalStateException("Must all startNewSegment first");
		}
		stepSegments.get(stepSegments.size() - 1).add(stepData);
	}
	
	/*
	 * Generell metode for å prosessere data.
	 * Rollen til metoden er å gå gjennom alle målingsobjektene.
	 * Det er ProcessHelper-objektet som gjør selve analysen,
	 * ved å akkumulere informasjon over alle målingene.
	 */
	public double process(ProcessHelper helper) {
		for (List<StepData> segment : stepSegments) {
			for (StepData step : segment) {
				helper.accumulate(step);
			}
		}
		return helper.getResult();
	}
}
