package testing;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import junit.framework.TestCase;

public class CardTest extends TestCase {

	@Test
	public void testCardContructor() {
		// Sjekker at riktige verdier blir satt
		Card card = new Card('S', 2);
		assertEquals("c1.getSuit()", 'S', card.getSuit());
		assertEquals("c1.getFace()", 2, card.getFace());

		// sjekker at ugyldig type utløser IllegalArgumentException
		try {
			card = new Card('A', 2);
			fail("new Card('A',2) should result in IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		} catch (Exception e) {
			fail("Expected IllegalArgumentException was " + e.getClass());
		}

		// Sjekker at ugyldig tallverdi utløser IllegalArgumentException
		try {
			card = new Card('S', 50); // avdekker feil
			fail("IllegalArgumentException should be thrown after new Card('S', 50)");
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		} catch (Exception e) {
			fail("Expected IllegalArgumentException was " + e.getClass());
		}
	}

	@Test
	public void testCardDeckContructor() {
		int n = 5;
		CardDeck deck = new CardDeck(n);
		assertEquals("deck.getCardCount()", n * 4, deck.getCardCount()); // avdekker feil
		String suits = "SHDC";
		int face = 1;
		int suit = 0;
		for (int i = 0; i < n * 4; i++) {
			Card card = deck.getCard(i);
			assertEquals("card.getCard(" + i + ").getSuit()", suits.charAt(suit), card.getSuit());
			assertEquals("card.getCard(" + i + ").getFace()", face, card.getFace());
			face++;
			if (face > n) {
				face = 1;
				suit++;
			}
		}
	}

	@Test
	public void testShuffle() {
		int n = 3;
		CardDeck deck = new CardDeck(n);
		List<String> fasit = Arrays.asList("S1", "D1", "S2", "D2", "S3", "D3", "H1", "C1", "H2", "C2", "H3", "C3");
		deck.shufflePerfectly();
		for (int i = 0; i < n * 4; i++) { // avdekker feil
			assertEquals("deck.getCard(" + i + ")", fasit.get(i), deck.getCard(i).toString());
		}
	}

}
