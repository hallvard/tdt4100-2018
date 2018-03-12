package iterators;

import java.util.Iterator;

public class StringLettersIterator implements Iterator<Character> {

	private final String s;
	private int pos = 0;
	
	public StringLettersIterator(String s) {
		this.s = s;
		windToLetter();
	}
	
	private void windToLetter() {
		while (pos < s.length()) {
			if (Character.isLetter(s.charAt(pos))) {
				break;
			}
			pos = pos + 1;
		}
	}
	
	@Override
	public boolean hasNext() {
		return pos < s.length();
	}

	@Override
	public Character next() {
		char next = s.charAt(pos);
		pos = pos + 1;
		windToLetter();
		return next;
	}
}
