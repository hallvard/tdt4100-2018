package interfaceeksempler3;

/*
 * Generelt grensesnitt for å prosessere måledata og beregne et resultat.
 * Det er implementasjonen som avgjør akkurat hva slags prosessering det blir.
 * Her er måledataene generalisert til å være MeasurementData, og
 * ikke et spesifikt type måledataobjekt.
 */
public interface ProcessHelper {
	public void accumulate(MeasurementData data);
	public double getResult();
}
