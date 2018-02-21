package interfaces;


import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class CardPredicateTest extends TestCase{
	CardDeck deck ;

	@Before

	public void setUp() throws Exception {
		deck = new CardDeck(10);
	}

	@Test
	public void testHasCard() {
		assertTrue(deck.hasCard(c->c.getSuit()=='S'));
		assertFalse(deck.hasCard(c->c.getFace()==13));
		assertTrue(deck.hasCard(c->c.getSuit()=='S' && c.getFace()==8));
	}

	@Test
	public void testGetCardCount() {
		assertEquals(10, deck.getCardCount(c->c.getSuit()=='S'));
		assertEquals(4, deck.getCardCount(c->c.getFace()==4));
		assertEquals(1, deck.getCardCount(c->c.getFace()==4 && c.getSuit()=='H'));
	}

	@Test
	public void testGetCards() {
		Card card = new Card('S', 4);
		Card card2 = new Card('S', 5);

		List<Card> matching = Arrays.asList(card, card2);
		assertEquals(matching.size(), deck.getCards(c-> (c.getFace()==4|| c.getFace()==5) && c.getSuit()=='S').size());

		assertEquals(10, deck.getCards(c->c.getSuit()=='S').size());

	}

}
