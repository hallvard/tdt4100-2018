package of13forberedelse;

public abstract class Animal {
	
	private String name; 
	private boolean hungry;
	public Animal(String name) {
		this.name = name; 
		
		
	}
	
	public void feed() {
		this.hungry = false;
	}
	public void getHungry() {
		this.hungry = true; 
	}
	
	public abstract String toString();
	
	
	
}
