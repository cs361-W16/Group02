package model;

import java.util.ArrayList;

/**
 * Created by Cameron on 1/22/2016.
 */
public class Game {

    Deck deck= new Deck();

    Col col1 = new Col();
    Col col2 = new Col();
    Col col3 = new Col();
    Col col4 = new Col();

    public void Deal(){

        col1.addCard(deck.drawFromDeck());
        col2.addCard(deck.drawFromDeck());
        col3.addCard(deck.drawFromDeck());
        col4.addCard(deck.drawFromDeck());

    }


}
