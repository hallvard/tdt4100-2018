package of13forberedelse;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Woof woof, I'm i a dog";
	}
	public String bark() {
		return "Woof"; 
	}
	
	public static void main(String[] args) {
		Animal fido = new Dog("Fido"); 
		System.out.println(fido); 
	}

}
