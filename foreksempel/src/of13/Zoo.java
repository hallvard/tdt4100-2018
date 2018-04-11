package of13;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	
	private List<Animal> animals = new ArrayList<Animal>(); 
	
	public void addAnimal(Animal animal) {
		animals.add(animal); 
	}
	
	public void feedAllAnimals() {
		for(Animal animal: animals) {
			animal.feedMe();
			if(animal instanceof Dog) {
				((Dog) animal).bark(); 
			}
		}
	}
	
	public void printAnimals() {
		for(Animal animal: animals) {
			System.out.println(animal.toString());
		}
	}
	
	public static void main(String[] args) {
		Dog fido = new Dog("fido"); 
		Animal boxer = new Kangaroo("boxer");
		
		Zoo utopia = new Zoo(); 
		
		
		utopia.addAnimal(boxer);
		utopia.addAnimal(fido); 
		
		utopia.printAnimals();
		
	}
	
	
}
