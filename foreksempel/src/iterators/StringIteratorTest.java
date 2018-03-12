package iterators;

import junit.framework.TestCase;

public class StringIteratorTest extends TestCase {

	public void testJava() {
		StringIterator sli = new StringIterator(Character::isLetter, new StringCharactersIterator("Java"));
		assertTrue(sli.hasNext()); assertEquals(Character.valueOf('J'), sli.next());
		assertTrue(sli.hasNext()); assertEquals(Character.valueOf('a'), sli.next());
		assertTrue(sli.hasNext()); assertEquals(Character.valueOf('v'), sli.next());
		assertTrue(sli.hasNext()); assertEquals(Character.valueOf('a'), sli.next());
		assertFalse(sli.hasNext());
	}
	
	public void testTDT4100() {
		StringIterator sli = new StringIterator(Character::isLetter, new StringCharactersIterator("TDT4100"));
		assertTrue(sli.hasNext());
		assertEquals(Character.valueOf('T'), sli.next());
		assertTrue(sli.hasNext());
		assertEquals(Character.valueOf('D'), sli.next());
		assertTrue(sli.hasNext());
		assertEquals(Character.valueOf('T'), sli.next());
		assertFalse(sli.hasNext());
	}
	
	public void test1337() {
		StringIterator sli = new StringIterator(Character::isLetter, new StringCharactersIterator("1337"));
		assertFalse(sli.hasNext());
	}
	
	public void test1337x() {
		StringIterator sli = new StringIterator(Character::isDigit, new StringCharactersIterator("1337"));
		assertTrue(sli.hasNext());
		assertEquals(Character.valueOf('1'), sli.next());
		assertTrue(sli.hasNext());
		assertEquals(Character.valueOf('3'), sli.next());
		assertTrue(sli.hasNext());
		assertEquals(Character.valueOf('3'), sli.next());
		assertTrue(sli.hasNext());
		assertEquals(Character.valueOf('7'), sli.next());
		assertFalse(sli.hasNext());
	}
	
	public void testLU() {
		StringIterator sli = new StringIterator(Character::isLetter, new StringCharactersIterator("<8LU"));
		assertTrue(sli.hasNext());
		assertEquals(Character.valueOf('L'), sli.next());
		assertTrue(sli.hasNext());
		assertEquals(Character.valueOf('U'), sli.next());
		assertFalse(sli.hasNext());
	}
}
