package of14forberedelse;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class LocationTest extends TestCase{
	
	Location loc ; 
	@Before
	public void setUp() throws Exception {
		loc =new Location(); 
	}


	@Test
	public void testUp() {
		loc.up(); 
		assertEquals(loc.getX(), 0); 
		assertEquals(loc.getY(), -1);
	}
	
	@Test
	public void testDown() {
		loc.down(); 
		assertEquals(loc.getX(), 0); 
		assertEquals(loc.getY(), 1);
	}
	
	@Test
	public void testMultipleFancyThings() {
		loc.down(); 
		loc.up(); 
		loc.up(); 
		loc.left(); 
		loc.left(); 
		loc.left(); 
		loc.right(); 
		assertEquals(loc.getX(), -2); 
		assertEquals(loc.getY(), -1);
	}

}
