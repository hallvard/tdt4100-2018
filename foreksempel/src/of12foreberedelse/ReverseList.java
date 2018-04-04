package of12foreberedelse;

import java.util.ArrayList;
import java.util.Collection;

import com.sun.tools.javac.util.List;

public class ReverseList<E> extends ArrayList<E> {
	@Override
	public boolean add(E e) {
		add(0, e);
		return true;
	}
	
	@Override
	public boolean addAll(Collection<? extends E> collection) {
		for (E e : collection) add(e);
		return true;
	}
	
	public static void main(String...strings) {
		ReverseList<Integer> ints = new ReverseList<>();
		ints.addAll(List.of(0, 1, 2));
		System.out.println(ints);
	}
}
