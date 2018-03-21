package of11;

public class UkeFunk implements UkeArbeider{
	private String name;
	private String role;
	private Student boss;
	
	public UkeFunk(String name, String role) {
		this.name = name;
		this.role = role;
	}
	
	public String getName() {
		return name;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setBoss(Student boss) {
		this.boss = boss;
	}
	
	public void work() {
		System.out.println("Jeg er en ukearbeider med rollen " + role);
	}
}
