package arv;

public class Person {

	private String name;

	public Person(final String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		checkName(name);
		this.name = name;
	}

	private void checkName(final String name) {
		for (int i = 0; i < name.length(); i++) {
			final char c = name.charAt(i);
			if (! (Character.isLetter(c) || " -".indexOf(c) >= 0)) {
				throw new NameValidationException(this, name);
			}
		}
	}
}
