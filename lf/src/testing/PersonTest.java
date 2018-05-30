package testing;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class PersonTest extends TestCase {
	private Person hallvard;
	private Person marit;
	private Person jens;
	private Person anne;

	@Before
	public void setUp() {
		hallvard = new Person("Hallvard", 'M');
		marit = new Person("Marit", 'F');
		jens = new Person("Jens", 'M');
		anne = new Person("Anne", 'F');
	}

	@Test
	public void testConstructor() {
		// Avdekker manglende innkapsling i konstruktøren ved å sjekke at å
		// gi en ugyldig verdi for kjønn til konstruktøren utløser et unntak.
		try {
			new Person("Robin Hood", 'A');
			fail("Constructor should only allow the genders M and F");
		} catch (IllegalArgumentException e) {};
		
		assertEquals(hallvard.getChildCount(), 0);
		assertEquals(marit.getChildCount(), 0);
		assertEquals(jens.getChildCount(), 0);
		assertEquals(anne.getChildCount(), 0);
	}
	
	@Test
	public void testAddChild() {
		hallvard.addChild(jens);
		hallvard.addChild(anne);
		
		marit.addChild(jens);
		marit.addChild(anne);
		
		// De følgende testene avdekker at å legge til et barn ikke har noen sjekk for
		// at barnet allerede er lagt til. Barn legges til flere ganger, og det blir mye rot.
		
		assertTrue(hallvard.getChild(0).equals(jens) && hallvard.getChild(1).equals(anne)
				|| hallvard.getChild(0).equals(anne) && hallvard.getChild(1).equals(jens));
		
		assertEquals(hallvard.getChildCount(), 2);
		
		assertTrue(marit.getChild(0).equals(jens) && marit.getChild(1).equals(anne)
				|| marit.getChild(0).equals(anne) && marit.getChild(1).equals(jens));
		
		assertEquals(marit.getChildCount(), 2);
	}
	
	@Test
	public void testRemoveChild() {
		hallvard.addChild(jens);
		hallvard.addChild(anne);
		
		marit.addChild(jens);
		marit.addChild(anne);
		
		hallvard.removeChild(jens);
		
		assertEquals(hallvard.getChild(0), anne);
		assertEquals(hallvard.getChildCount(), 1);
		
		// Avdekker at å fjerne et barn setter begge barnets foreldre til null i 
		// stedet for å sjekke hvilket forhold denne personen har til barnet.

		assertEquals(jens.getFather(), null);
		assertEquals(jens.getMother(), marit);
	}
	
	@Test
	public void testSetFather() {
		jens.setFather(hallvard);
		assertEquals(jens.getFather(), hallvard);
		assertEquals(hallvard.getChild(0), jens);
	}
	
	@Test
	public void testSetMother() {
		jens.setMother(marit);
		assertEquals(jens.getMother(), marit);
		assertEquals(marit.getChild(0), jens);
	}
}
	
