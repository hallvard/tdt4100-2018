package mappeeksempel;

import java.util.List;

import junit.framework.TestCase;

public class FileTest extends TestCase {

	Folder teaching, folder105;

	public void setUp() {
		teaching = new Folder("TEACHING", null);
		folder105 = new Folder("105", teaching);
	}
	
	public void testToString() {
		File grades = new File("Grades", folder105);
		assertEquals("/TEACHING/105/Grades", grades.toString());
	}
	
	public void testContains() {
		Folder other = new Folder("other", null);
		assertTrue(teaching.contains(teaching));
		assertTrue(teaching.contains(folder105));
		assertFalse(teaching.contains(other));
	}
	
	public void testFindFirst() {
		File grades = new File("Grades", folder105);
		assertSame(grades, teaching.findFirst("Grades"));
	}
	
	public void testFindAll() {
		File grades = new File("Grades", folder105);
		List<Object> findAll = teaching.findAll("Grades");
		assertEquals(1, findAll.size());
		assertSame(grades, findAll.get(0));
	}
}
