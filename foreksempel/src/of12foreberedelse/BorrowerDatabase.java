package of12foreberedelse;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BorrowerDatabase implements Database<Person> {
	private Set<Person> borrowers = new HashSet<>();

	@Override
	public void add(Person e) {
		borrowers.add(e);
	}

	@Override
	public void remove(Person e) {
		borrowers.remove(e);
	}

	@Override
	public boolean contains(Person e) {
		return borrowers.contains(e);
	}

	@Override
	public boolean containsByPredicate(Predicate<Person> predicate) {
		return borrowers.stream().anyMatch(predicate);
	}

	@Override
	public Collection<Person> getFiltered(Predicate<Person> predicate) {
		return borrowers.stream().filter(predicate).collect(Collectors.toSet());
	}
	
}
