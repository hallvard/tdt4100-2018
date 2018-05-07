package eksamensforelesning2018;

public class Employee extends Person{

	public Employee(String name) {
		super(name);
	}
	
	public void sayHello() {
		System.out.println("Hei. Jeg jobber i banken. Skal vi ta alle pengene dine?");
	}
	
}
