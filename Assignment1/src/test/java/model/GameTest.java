package model;

import org.junit.Test;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertNotNull;

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

// Begin Compare portion tests ------------------------
    @Test
    public void testGameExists(){
       Game game = new Game();
       assertNotNull(game);
    }

    @Test
    public void testEqualSuit(){
        Game game = new Game();
        assertEquals(true, game.same_int(0,0));
    }
    @Test
    public void testInequalSuit(){
        Game game = new Game();
        assertEquals(false, game.same_int(0,1));
    }
//    // This test is meant to fail all the time, to make sure I'm actually making tests right. It should never pass.
//    @Test
//    public void testFailedEqual(){
//        Game game = new Game();
//        assertEquals(true, game.same_int(0,1));
//    } // I'll comment it out when I'm finished with the feature.
    @Test
    public void testFirstNumBiggerTrue(){
        Game game = new Game();
        assertEquals(true, game.compare_face(13,8,"g"));
    }
    @Test
    public void testFirstNumBiggerFalse(){
        Game game = new Game();
        assertEquals(false, game.compare_face(2,8,"g"));
    }
    @Test
    public void testFirstNumSmallerTrue(){
        Game game = new Game();
        assertEquals(true, game.compare_face(4,5,"l"));
    }
    @Test
    public void testFirstNumSmallerFalse(){
        Game game = new Game();
        assertEquals(false, game.compare_face(5,4,"l"));
    }
    @Test   // These next two tests actually are unrelated to the compare part of this project. Just me testing making sure things work before I start using them.
    public void testCardRankCompare(){
        Card card = new Card(2,3);
        assertEquals(3,card.getRank());
    }
    @Test
    public void testCardSuitCompare(){
        Card card = new Card(2,3);
        assertEquals(2,card.getSuit());
    }
    @Test   // The big finisher.
    public void testCanRemoveTrue(){
        Card fivespades = new Card(1,5);
        Card tenspades = new Card(1,10);
        Game game = new Game();
        assertEquals(true, game.can_remove(fivespades,tenspades));
    }
    @Test
    public void testCanRemoveFalse(){
        Card fivespades = new Card(1,5);
        Card tenspades = new Card(1,10);
        Game game = new Game();
        assertEquals(false, game.can_remove(tenspades,fivespades));
    }
// End Compare portion tests ---------------------------------------------
    }
