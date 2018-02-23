package interfaceeksempler2;

import java.util.ArrayList;
import java.util.List;

/*
 * Klasse som samler mange temperaturmålinger i en to-nivå-struktur.
 */
public class Temps {

	/*
	 * En liste av tabeller av målepunkter.
	 * De "indre" tabellene er f.eks. alle temperaturene for én dag.
	 */
	public List<TempData[]> tempArrays = new ArrayList<TempData[]>();

	public void addTempArray(TempData[] tempDatas) {
		tempArrays.add(tempDatas);
	}

	public double average() {
//		int count = 0;
//		double sum = 0.0;
//		for (TempData[] segment : tempArrays) {
//			for (TempData temp : segment) {
//				sum += temp.temp;
//				count += 1;
//			}
//		}
//		return sum / count;

// Med process-metoden og AverageHelper, så kan den doble løkke
// erstattes av et enkelt kall.
		return process(new AverageHelper());
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
