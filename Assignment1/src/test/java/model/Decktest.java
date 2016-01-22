package model;



        import org.junit.Test;

        import static junit.framework.TestCase.assertNotNull;
        import static junit.framework.Assert.assertEquals;
        import static org.junit.Assert.*;

/**
 * Created by Cameron on 1/20/2016.
 */
public class Decktest {
    @Test
    public void testForDeck(){
        Deck deck = new Deck();

        assertNotNull(deck);

    }
    @Test
    public void testForDeal(){
        Deck deck = new Deck();
        Card card = deck.drawFromDeck();
        assertNotNull(card);

    }

    @Test
    public void testForShuffle(){
        Deck deck = new Deck();
        Card card = deck.drawFromDeck();
        Card card2 = deck.drawFromDeck();
        assertNotEquals(card, card2);

    }
    @Test
    public void testTotalCards(){
        Deck deck = new Deck();

        assertEquals(52, deck.getTotalCards());
    }

}
