package of12;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class PersonDatabase implements Database<Person> {
	Set<Person> persons;
	
	public PersonDatabase() {
		persons = new HashSet<>();
	}
	
	@Override
	public void add(Person e) {
		persons.add(e);
	}

	@Override
	public void remove(Person e) {
		persons.remove(e);
	}

	@Override
	public boolean contains(Person e) {
		return persons.contains(e);
	}

	@Override
	public boolean containsByPredicate(Predicate<Person> predicate) {
		return persons.stream().anyMatch(predicate);
	}

	@Override
	public Collection<Person> getFiltered(Predicate<Person> predicate) {
		Collection<Person> filtered = new HashSet<>();
		for (Person p : persons) {
			if (predicate.test(p)) filtered.add(p);
		}
		return filtered;
	}

}
