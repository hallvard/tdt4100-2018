package of12;

import java.util.Collection;
import java.util.function.Predicate;

public interface Database<E> {
	public void add(E e);
	public void remove(E e);
	public boolean contains(E e);
	public boolean containsByPredicate(Predicate<E> predicate);
	public Collection<E> getFiltered(Predicate<E> predicate);
}
