package of14;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class LocationTest extends TestCase{
	
	Location loc ; 
	
	@Before
	public void setUp() throws Exception {
		loc = new Location(); 
	}

	@Test
	public void testConstructor() {
		assertEquals(loc.getX(), 0); 
		assertEquals(loc.getY(), 0); 
	}
	
	@Test
	public void testUp() {
		loc.up(); 
		assertEquals(-1, loc.getY()); 
		assertEquals(loc.getX(), 0 ); 
	}
	
	@Test
	public void testFancyTest() {
		loc.up();
		loc.up(); 
		loc.up(); 
		loc.down();
		loc.left(); 
		loc.right(); 
		loc.left(); 
		loc.left(); 
		
		assertEquals(-2, loc.getY());
		assertEquals(-2, loc.getX()) ;
	}

}
