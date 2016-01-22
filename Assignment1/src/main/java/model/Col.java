package model;
import model.Card;
import model.Deck;

import java.util.ArrayList;

/**
 * Created by Cameron on 1/22/2016.
 */
public class Col {

    private ArrayList<Card> col;


     public Col(){

        ArrayList<Card> col;
        col = new ArrayList<Card>();

        this.col = col;

    }
    public ArrayList<Card> getCol(){ return col;};

    public int sizeOfCol(){ return col.size(); }

    public void addCard(Card card){
        col.add(card);
    }

    public Card getCard(int index){

        return col.get(index);
    }

    public Card topCard(){
        return getCard(col.size()-1);
    }

}
