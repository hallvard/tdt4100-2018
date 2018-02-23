package interfaceeksempler1;

/*
 * Generelt grensesnitt for å prosessere skrittellingsdata og beregne et resultat.
 * Det er implementasjonen som avgjør akkurat hva slags prosessering det blir.
 */
public interface ProcessHelper {
	public void accumulate(StepData stepData);
	public double getResult();
}
