package iterators;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

public class StringLettersIteratorTest extends TestCase {

	public void testJava() {
		StringLettersIterator sli = new StringLettersIterator("Java");
		assertTrue(sli.hasNext());
		assertEquals(Character.valueOf('J'), sli.next());
		assertTrue(sli.hasNext());
		assertEquals(Character.valueOf('a'), sli.next());
		assertTrue(sli.hasNext());
		assertEquals(Character.valueOf('v'), sli.next());
		assertTrue(sli.hasNext());
		assertEquals(Character.valueOf('a'), sli.next());
		assertFalse(sli.hasNext());
	}
	
	public void testTDT4100() {
		StringLettersIterator sli = new StringLettersIterator("TDT4100");
		assertTrue(sli.hasNext());
		assertEquals(Character.valueOf('T'), sli.next());
		assertTrue(sli.hasNext());
		assertEquals(Character.valueOf('D'), sli.next());
		assertTrue(sli.hasNext());
		assertEquals(Character.valueOf('T'), sli.next());
		assertFalse(sli.hasNext());
	}
	
	public void test1337() {
		StringLettersIterator sli = new StringLettersIterator("1337");
		assertFalse(sli.hasNext());
	}
	
	public void testLU() {
		StringLettersIterator sli = new StringLettersIterator("<8LU");
		assertTrue(sli.hasNext());
		assertEquals(Character.valueOf('L'), sli.next());
		assertTrue(sli.hasNext());
		assertEquals(Character.valueOf('U'), sli.next());
		assertFalse(sli.hasNext());
	}
}
