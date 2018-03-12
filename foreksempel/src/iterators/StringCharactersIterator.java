package iterators;

import java.util.Iterator;

public class StringCharactersIterator implements Iterator<Character> {

	private final String s;
	private int pos = 0;
	
	public StringCharactersIterator(String s) {
		this.s = s;
	}
	
	@Override
	public boolean hasNext() {
		return pos < s.length();
	}

	@Override
	public Character next() {
		char next = s.charAt(pos);
		pos = pos + 1;
		return next;
	}
}
