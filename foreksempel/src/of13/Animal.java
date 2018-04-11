package of13;

public abstract class Animal {
	
	private boolean hungry ; 
	protected String name; 
	
	public Animal(String name) {
		this.name = name; 
		this.hungry = true; 
	}
	public Animal() {
		
	};
	
	public void feedMe() {
		this.hungry = false; 
	}
	
	public void getHungry() {
		this.hungry = true; 
	}
	
	public abstract String toString(); 
	
	

}
