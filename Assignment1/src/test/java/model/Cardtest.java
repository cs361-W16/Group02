package model;

import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by Cameron on 1/20/2016.
 */
public class Cardtest {
    @Test
    public void testForCardRank(){
        Card card = new Card(1,1);

        assertEquals(1, card.getRank());

    }
    @Test
    public void testForCardSuit(){
        Card card = new Card(1,1);
        int test = 1;
        assertEquals(test, card.getSuit());

    }
    @Test
    public void testNotNull(){
        Card card = new Card(1,1);
        assertNotNull(card);
    }
}
