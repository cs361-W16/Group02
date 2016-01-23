package model;

import org.junit.Test;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertArrayEquals;

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
        Deck deck = new Deck();
        Col col1 = new Col();
        Col col2 = new Col();
        Col col3 = new Col();
        Col col4 = new Col();
        Game game = new Game(deck, col1, col2, col3, col4);
       assertNotNull(game);
    }

    @Test
    public void testEqualSuit(){
        Deck deck = new Deck();
        Col col1 = new Col();
        Col col2 = new Col();
        Col col3 = new Col();
        Col col4 = new Col();
        Game game = new Game(deck, col1, col2, col3, col4);
        assertEquals(true, game.same_int(0,0));
    }
    @Test
    public void testInequalSuit(){
        Deck deck = new Deck();
        Col col1 = new Col();
        Col col2 = new Col();
        Col col3 = new Col();
        Col col4 = new Col();
        Game game = new Game(deck, col1, col2, col3, col4);
        assertEquals(false, game.same_int(0,1));
    }
//    // This test is meant to fail all the time, to make sure I'm actually making tests right. It should never pass.
//    @Test
//    public void testFailedEqual(){
//      Deck deck = new Deck();
//      Col col1 = new Col();
//      Col col2 = new Col();
//      Col col3 = new Col();
//      Col col4 = new Col();
//      Game game = new Game(deck, col1, col2, col3, col4);
//        assertEquals(true, game.same_int(0,1));
//    } // I'll comment it out when I'm finished with the feature.
    @Test
    public void testFirstNumBiggerTrue(){
        Deck deck = new Deck();
        Col col1 = new Col();
        Col col2 = new Col();
        Col col3 = new Col();
        Col col4 = new Col();
        Game game = new Game(deck, col1, col2, col3, col4);
        assertEquals(true, game.compare_face(13,8,"g"));
    }
    @Test
    public void testFirstNumBiggerFalse(){
        Deck deck = new Deck();
        Col col1 = new Col();
        Col col2 = new Col();
        Col col3 = new Col();
        Col col4 = new Col();
        Game game = new Game(deck, col1, col2, col3, col4);
        assertEquals(false, game.compare_face(2,8,"g"));
    }
    @Test
    public void testFirstNumSmallerTrue(){
        Deck deck = new Deck();
        Col col1 = new Col();
        Col col2 = new Col();
        Col col3 = new Col();
        Col col4 = new Col();
        Game game = new Game(deck, col1, col2, col3, col4);
        assertEquals(true, game.compare_face(4,5,"l"));
    }
    @Test
    public void testFirstNumSmallerFalse(){
        Deck deck = new Deck();
        Col col1 = new Col();
        Col col2 = new Col();
        Col col3 = new Col();
        Col col4 = new Col();
        Game game = new Game(deck, col1, col2, col3, col4);
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
        Card threeclubs = new Card(3,3);
        Card fiveclubs = new Card(3,10);
        Deck deck = new Deck();
        Col col1 = new Col();
        Col col2 = new Col();
        Col col3 = new Col();
        Col col4 = new Col();
        Game game = new Game(deck, col1, col2, col3, col4);
        assertEquals(true, game.can_remove(threeclubs,fiveclubs));
    }
    @Test
    public void testCanRemoveFalseFace(){
        Card threeclubs = new Card(3,3);
        Card twoclubs = new Card(3,2);
        Deck deck = new Deck();
        Col col1 = new Col();
        Col col2 = new Col();
        Col col3 = new Col();
        Col col4 = new Col();
        Game game = new Game(deck, col1, col2, col3, col4);
        assertEquals(false, game.can_remove(threeclubs,twoclubs));
    }
    @Test
    public void testCanRemoveFalseSuit(){
        Card threeclubs = new Card(3,3);
        Card fourspades = new Card(1,2);
        Deck deck = new Deck();
        Col col1 = new Col();
        Col col2 = new Col();
        Col col3 = new Col();
        Col col4 = new Col();
        Game game = new Game(deck, col1, col2, col3, col4);
        assertEquals(false, game.can_remove(threeclubs,fourspades));
    }
// End Compare portion tests ---------------------------------------------
    }
