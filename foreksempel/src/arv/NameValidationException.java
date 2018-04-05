package arv;

public class NameValidationException extends IllegalArgumentException {

	private final Person person;
	private final String illegalName;

	public NameValidationException(final Person person, final String illegalName) {
		this.person = person;
		this.illegalName = illegalName;
	}

	@Override
	public String getMessage() {
		return illegalName + " is illegal for " + person;
	}

	public static void main(final String[] args) {
		try {
			new Person("fghjkl.pl78090ååsæåÆ");
		} catch (final IllegalArgumentException e) {
		}
	}
}
