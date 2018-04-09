package arv;

public class Bok extends Object {

	private String tittel;

	public Bok(final String tittel) {
		setTittel(tittel);
	}

	@Override
	public String toString() {
		return "[Bok tittel=" + tittel + "]";
	}

	public String getTittel() {
		return tittel;
	}

	private static String validCharacters = " -,.%";

	public boolean isValidTittel(final String tittel) {
		for (int i = 0; i < tittel.length(); i++) {
			final char c = tittel.charAt(i);
			if (! (Character.isLetter(c) || Character.isDigit(c) || validCharacters.indexOf(c) >= 0)) {
				return false;
			}
		}
		return true;
	}

	public void setTittel(final String tittel) {
		if (! isValidTittel(tittel)) {
			throw new IllegalArgumentException(tittel + " er ikke en gyldig boktittel");
		}
		this.tittel = tittel;
	}

	public static void main(final String[] args) {
		final Bok bok = new Bok("Lasso rundt fru Luna");
		System.out.println(bok);
	}
}
