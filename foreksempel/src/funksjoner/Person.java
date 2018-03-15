package funksjoner;

public class Person {

	private String givenName, familyName, email;

	public Person(final String givenName, final String familyName, final String email) {
		this.givenName = givenName;
		this.familyName = familyName;
		this.email = email;
	}

	@Override
	public String toString() {
		return String.format("%s, %s", getFullName(), getEmail());
	}

	public String getGivenName() {
		return givenName;
	}
	public void setGivenName(final String givenName) {
		this.givenName = givenName;
	}

	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(final String familyName) {
		this.familyName = familyName;
	}

	public String getFullName() {
		return givenName + " " + familyName;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(final String email) {
		this.email = email;
	}
}
