package model;

import java.util.ArrayList;

/**
 * Created by Cameron, Taylor, Jonathan and Brandom on 1/22/2016.
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

    // It will check the size of the specified column array whether zero or not. This is used for
    // finding which column is empty and can be filled with another card from another slot
    public static boolean checkColumn(ArrayList<Card> CardArray) {
        int cardSize = CardArray.size();
        if (cardSize == 0) {
            return true;
        }
        return false;
    }

    // It will grab the index of the last element in the array. Then "temp" will grab the value
    // of the element of the array. Finally, store that value to destination column which supposedly empty.
    public static void moveCard (ArrayList<Card> cardSource, ArrayList<Card> cardDestination) {
        int lastCardIndex = cardSource.size() - 1;
        Card temp = cardSource.get(lastCardIndex);
        cardDestination.add(temp);
        // ** need one more step which is call remove function but still in development as I type this notes
    }

    // The two inputs should be the int values that represent the suits. Would work fine with the faces, if I ever needed to test equality.
    // Yeah, this is pretty much a stock function, or method or whatever it is in Java.
    // This is called later in the greater compare function.
    // Author: Taylor Kirkpatrick
    public static boolean same_int(int a, int b){
        if(a == b) {
            return true;
        } else {
            return false;
        }
    }
    // Also rather simple, but hey, this is pretty good for hardly understanding Java.
    // This one takes in two ints, two ints representing the faces and one that asks if user wants a greater than or less than comparison.
    // Technically don't need the third one if this function was used cleverly, but let's be convenient.
    // Returns boolean.
    // Also incorporated into the larger compare function.
    // Author: Taylor Kirkpatrick
    public static boolean compare_face(int a, int b, String c){
        if (c.equals("g")){     // The less than is never actually used in this scope. But who knows what the future holds?
            if (a > b){
                return true;
            }
            return false;
        }
        if (c.equals("l")){
            if (a < b){
                return true;
            }
            return false;
        }
        return false;   // Something went wrong here. But logically it'll never happen, so don't worry boys and girls.
    }
    // Fire and forget function. Takes two cards as inputs, returns a boolean if the first card can be removed.
    // NOTE: First argument is the card to be removed, second argument is the top card of another column.
    // Author: Taylor Kirkpatrick
    public static boolean can_remove(Card a, Card b){
        int asuit = a.getSuit();
        int bsuit = b.getSuit();
        int aface = a.getRank();
        int bface = b.getRank();

        if (same_int(asuit,bsuit)){
            if (compare_face(aface,bface,"l")){
                return true;
            }
        }
        return false;
    }
}


