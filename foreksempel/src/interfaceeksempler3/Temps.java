package interfaceeksempler3;

import java.util.ArrayList;
import java.util.List;

/*
 * Klasse som samler mange temperaturmålinger i en to-nivå-struktur.
 */
public class Temps implements DataProcessor {

	/*
	 * En liste av tabeller av målepunkter.
	 * De "indre" tabellene er f.eks. alle temperaturene for én dag.
	 */
	public List<TempData[]> tempArrays = new ArrayList<TempData[]>();

	public void addTempArray(TempData[] tempDatas) {
		tempArrays.add(tempDatas);
	}

	/*
	 * Generell metode for å prosessere data.
	 * Rollen til metoden er å gå gjennom alle målingsobjektene.
	 * Det er ProcessHelper-objektet som gjør selve analysen,
	 * ved å akkumulere informasjon over alle målingene.
	 */
	public double process(ProcessHelper helper) {
		for (TempData[] segment : tempArrays) {
			for (TempData temp : segment) {
				helper.accumulate(temp);
			}
		}
		return helper.getResult();
	}

}
