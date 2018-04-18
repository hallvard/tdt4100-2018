package of14forberedelse;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class PartnerTest extends TestCase{
	
	private Partner p1; 
	private Partner p2; 
	private Partner p3 ; 
	private Partner p4; 
	
	@Before
	public void setUp() throws Exception {
		p1 = new Partner("Ola"); 
		p2 = new Partner("Kari"); 
		p3 = new Partner("Truls"); 
		p4 = new Partner("Marit"); 
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHasNoPartnerAfterConstruction() {
		assertEquals(p1.getPartner(), null); 
		assertEquals(p2.getPartner(), null); 
	}
	
	@Test
	public void testSetPartner() {
		p1.setPartner(p2);
		assertEquals(p1.getPartner(), p2); 
		assertEquals(p2.getPartner(), p1);
	}
	
	@Test
	public void testChangePartner() {
		p1.setPartner(p2);
		p2.setPartner(p4);
		
		assertEquals(p1.getPartner(), null); 
		assertEquals(p2.getPartner(), p4); 
		assertEquals(p4.getPartner(), p2);
	}
	
	@Test
	public void testEndPartner() {
		p1.setPartner(p2);
		p2.setPartner(null);
		assertEquals(p1.getPartner(), null); 
		assertEquals(p2.getPartner(), null); 
	}

}
