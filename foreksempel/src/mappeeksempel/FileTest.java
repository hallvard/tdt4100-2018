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
		List<Object> findAllFiles = teaching.findAll(new FilesOnly());
		assertEquals(1, findAllFiles.size());
		assertSame(grades, findAllFiles.get(0));

		List<Object> findAllFolder = teaching.findAll(new FoldersOnly());
		assertEquals(1, findAllFolder.size());
		assertSame(folder105, findAllFolder.get(0));
	}
	
	public void testFindAllFiles() {
		File grades = new File("Grades.text", folder105);
		List<File> findAllFiles1 = teaching.findAllFiles(new FileNamePredicate("Grades.text"));
		assertEquals(1, findAllFiles1.size());
		assertSame(grades, findAllFiles1.get(0));

		List<File> findAllFiles2 = teaching.findAllFiles(new FileNamePredicate("Grades", null));
		assertEquals(1, findAllFiles2.size());
		assertSame(grades, findAllFiles2.get(0));

		List<File> findAllFiles3 = teaching.findAllFiles(new FileNamePredicate(null, "text"));
		assertEquals(1, findAllFiles3.size());
		assertSame(grades, findAllFiles3.get(0));
		
		List<File> findAllFiles4 = teaching.findAllFiles(new FileNamePredicate("xyz"));
		assertEquals(0, findAllFiles4.size());
	}
}
