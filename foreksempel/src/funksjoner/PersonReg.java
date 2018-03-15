package funksjoner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PersonReg {

	private final Collection<Person> people = new ArrayList<Person>();

	public PersonReg(final Person...persons) {
		people.addAll(Arrays.asList(persons));
	}

	public Person findPerson(final Predicate<Person> tester) {
		for (final Person person : people) {
			if (tester.test(person)) {
				return person;
			}
		}
		return null;
	}

	public Person findPerson(final String s, final Function<Person, String> fun) {
		for (final Person person : people) {
			final String val = fun.apply(person);
			if (val == s || (val != null && val.equals(s))) {
				return person;
			}
		}
		return null;
	}

	public void forEach(final Consumer<Person> consumer) {
		for (final Person person : people) {
			consumer.accept(person);
		}
	}

	public static void main(final String[] args) {
		final Person hallvard = new Person("Hallvard", "Trætteberg", "hal@ntnu.no");
		final Person marit = new Person("Marit", "Reitan", "maritrei@ntnu.no");
		final Person anne = new Person("Anne Trætteberg", "Reitan", "anne.reitan@yahoo.no");
		final Person jens = new Person("Jens Reitan", "Trætteberg", "jenstraetteberg@gmail.com");

		final PersonReg reg = new PersonReg(hallvard, marit, jens, anne);

		//		System.out.println(reg.findPerson(person -> person.getGivenName().equals("Hallvard")));
		//		System.out.println(reg.findPerson("Hallvard", person -> person.getGivenName()));
		//		System.out.println(reg.findPerson("Hallvard", Person::getGivenName));
		//		System.out.println(reg.findPerson("hal@ntnu.no", Person::getEmail));
		//
		//		reg.forEach(person -> System.out.println(person));
		//		reg.forEach(System.out::println);
		//		reg.people.stream().forEach(System.out::println);
		//		reg.people.stream().forEach(person -> System.out.println(person));
		//
		reg.people.stream().map(person -> person.getGivenName()).forEach(System.out::println);
		reg.people.stream().map(Person::getGivenName).forEach(System.out::println);

		System.out.println(reg.people.stream().map(Person::getEmail).filter(email -> email.endsWith("ntnu.no")).count());
		System.out.println(reg.people.stream().map(Person::getGivenName).filter(s -> s.contains(" ")).count());
	}
}
