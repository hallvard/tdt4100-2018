package of13;

public class Dog extends Animal{

	private boolean sitting ; 
	public Dog(String name) {
		super(name); 
	}
	
	
	public void bark() {
		System.out.println("Woof");
	}
	public void sit() {
		this.sitting = true; 
		
	}


	@Override
	public String toString() {
		return "Woof woof, I'm a dog"; 
	}
	
	
	
}
