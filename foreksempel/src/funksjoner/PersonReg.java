package funksjoner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class PersonReg {

	private Collection<Person> people = new ArrayList<Person>();
	
	public PersonReg(Person...persons) {
		people.addAll(Arrays.asList(persons));
	}
	
	public Person findPerson(String name) {
		for (Person person : people) {
			if (name.equals(person.getFullName())) {
				return person;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		Person hallvard = new Person();
		hallvard.setGivenName("Hallvard");
		hallvard.setFamilyName("Trætteberg");
		hallvard.setEmail("hal@ntnu.no");
		
		Person marit = new Person();
		marit.setGivenName("Marit");
		marit.setFamilyName("Reitan");
		marit.setEmail("maritrei@ntnu.no");
		
		Person anne = new Person();
		anne.setGivenName("Anne Trætteberg");
		anne.setFamilyName("Reitan");
		anne.setEmail("anne.reitan@yahoo.no");
		
		Person jens = new Person();
		jens.setGivenName("Jens Reitan");
		jens.setFamilyName("Trætteberg");
		jens.setEmail("jenstraetteberg@gmail.com");

		PersonReg reg = new PersonReg(hallvard, marit, jens, jens);
		System.out.println(reg.findPerson("Hallvard Trætteberg"));
	}
}
