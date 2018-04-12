package arv;

public class Tegneseriealbum extends Bok {

	private int antallStriper;

	public Tegneseriealbum(final String tittel, final int antallStriper) {
		super(tittel);
		this.antallStriper = antallStriper;
	}

	private String specialCharacters = "# $%&/()=)(";

	@Override
	public String getSpecialCharacters() {
		return specialCharacters;
	}

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
		final Tegneseriealbum album = new Tegneseriealbum("Flat firer", 128);
		System.out.println(album);
	}
}
