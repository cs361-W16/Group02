package model;

import java.util.ArrayList;

/**
 * Created by Cameron on 1/22/2016.
 */
public class Game {


    public Deck deck = new Deck();

    public Col col1 = new Col();
    public Col col2 = new Col();
    public Col col3 = new Col();
    public Col col4 = new Col();


    int dealCount = 0;
    Card blankCard = new Card(4,15);

    public Game(Deck deck, Col col1, Col col2, Col col3, Col col4){
        this.deck = deck;
        this.col1 = col1;
        this.col2 = col2;
        this.col3 = col3;
        this.col4 = col4;
        for(int i = 0; i < 13; i++) {
            col1.addCard(blankCard);
            col2.addCard(blankCard);
            col3.addCard(blankCard);
            col4.addCard(blankCard);
        }
    }


    public void Deal(){

        col1.setCard(dealCount, deck.drawFromDeck());
        col2.setCard(dealCount, deck.drawFromDeck());
        col3.setCard(dealCount, deck.drawFromDeck());
        col4.setCard(dealCount, deck.drawFromDeck());
        dealCount++;
    }


}
