package of14;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class PartnerTest extends TestCase{

	private Partner ola ;
	private Partner kari ; 
	private Partner truls ; 
	
	@Before
	public void setUp() throws Exception {
		ola = new Partner("Ola");
		kari = new Partner("Kari");
		truls = new Partner("Truls"); 
	}

	@Test
	public void testConstructor() {
		assertNull(ola.getPartner());
	}
	
	@Test
	public void testSetPartner() {
		ola.setPartner(kari);
		assertEquals(kari, ola.getPartner());
		assertEquals(ola, kari.getPartner());
	}
	
	@Test
	public void testChangePartner() {
		ola.setPartner(kari);
		ola.setPartner(truls);
		assertEquals(truls, ola.getPartner());
		assertEquals(ola, truls.getPartner()); 
		assertNull(kari.getPartner()); 
	}
	
	@Test
	public void testEndPartner() {
		ola.setPartner(kari);
		kari.setPartner(null);
		assertNull("Ola skal ikke ha noen partner", ola.getPartner()); 
		assertNull(kari.getPartner()); 
	}
}
