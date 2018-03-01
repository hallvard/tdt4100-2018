package funksjoner;

public class Person {

	private String givenName, familyName, email;
	
	@Override
	public String toString() {
		return String.format("%s, %s", getFullName(), getEmail());
	}
	
	public String getGivenName() {
		return givenName;
	}
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFullName() {
		return givenName + " " + familyName;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
