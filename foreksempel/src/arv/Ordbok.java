package arv;

public class Ordbok extends Bok {

	public Ordbok(final String tittel, final int antallOrd) {
		super(tittel);
		this.antallOrd = antallOrd;
	}

	private int antallOrd;

	@Override
	public String toString() {
		return "[Ordbok tittel=" + getTittel()  + " antallOrd=" + antallOrd + "]";
	}

	@Override
	public boolean isValidTittel(final String tittel) {
		if (! super.isValidTittel(tittel)) {
			return false;
		}
		return tittel.endsWith("ordbok");
	}

	@Override
	public void setTittel(String tittel) {
		if (! tittel.endsWith(" ordbok")) {
			tittel += " ordbok";
		}
		super.setTittel(tittel);
	}

	public int getAntallOrd() {
		return antallOrd;
	}

	public void setAntallOrd(final int antallOrd) {
		this.antallOrd = antallOrd;
	}

	public static void main(final String[] args) {
		final Bok ordbok = new Ordbok("Nynorsk", 15000);
		if (ordbok instanceof Tegneseriealbum) {
			((Tegneseriealbum) ordbok).setAntallStriper(15000);
		}
		System.out.println(ordbok);
	}
}
