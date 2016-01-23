package model;

import org.junit.Test;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.Assert.assertEquals;

/**
 * Created by Cameron on 1/22/2016.
 */
public class GameTest {

    @Test
    public void testDeal(){
         Deck deck = new Deck();

         Col col1 = new Col();
         Col col2 = new Col();
         Col col3 = new Col();
         Col col4 = new Col();

        Game game = new Game(deck, col1, col2, col3, col4);

        assertNotNull(game.col1.topCard());

    }
}
