package iterators;

import java.util.Iterator;
import java.util.function.Predicate;

public class StringIterator implements Iterator<Character> {

	private final Iterator<Character> it;
	
	public StringIterator(Predicate<Character> charTest, Iterator<Character> it) {
		this.it = it;
		this.charTest = charTest;
		wind();
	}
	
	private Predicate<Character> charTest;
	private Character next;

	private void wind() {
		while (it.hasNext()) {
			next = it.next();
			if (charTest.test(next)) {
				return;
			}
		}
		next = null;
	}
	
	@Override
	public boolean hasNext() {
		return next != null;
	}

	@Override
	public Character next() {
		char next = this.next;
		this.next = null;
		wind();
		return next;
	}
}
