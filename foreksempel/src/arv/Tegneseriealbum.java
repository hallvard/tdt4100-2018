package arv;

public class Tegneseriealbum extends Bok {

	private int antallStriper;

	@Override
	public String toString() {
		return "[Tegneseriealbum tittel=" + getTittel() + " antallStriper=" + antallStriper + "]";
	}

	public int getAntallStriper() {
		return antallStriper;
	}

	public void setAntallStriper(final int antallStriper) {
		this.antallStriper = antallStriper;
	}

	public static void main(final String[] args) {
		final Tegneseriealbum album = new Tegneseriealbum();
		album.setTittel("Flat firer");
		album.setAntallStriper(128);
		System.out.println(album);
	}
}
