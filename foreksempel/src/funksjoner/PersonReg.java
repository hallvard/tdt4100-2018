package funksjoner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;
import java.util.function.Predicate;

public class PersonReg {

	private Collection<Person> people = new ArrayList<Person>();
	
	public PersonReg(Person...persons) {
		people.addAll(Arrays.asList(persons));
	}
	
	public Person findPerson(Predicate<Person> tester) {
		for (Person person : people) {
			if (tester.test(person)) {
				return person;
			}
		}
		return null;
	}

	public Person findPerson(String s, Function<Person, String> fun) {
		for (Person person : people) {
			String val = fun.apply(person);
			if (val == s || (val != null && val.equals(s))) {
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
		
		System.out.println(reg.findPerson(person -> person.getGivenName().equals("Hallvard")));
		System.out.println(reg.findPerson("Hallvard", person -> person.getGivenName()));
	}
}
