package of13;

public class Kangaroo extends Animal{
	
	
	public Kangaroo(String name) {
		super(name);
		super.feedMe();
	}
	
	public String box() {
		return "PAM"; 
	}
	public String toString() {
		return "PAM, I'm a kangaroo";
	}
	
	
		
}
