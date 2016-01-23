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

    public void setCard(int index, Card card){
        col.set(index, card);
    }
    public void addCard(Card card){ col.add(card); };

    public Card getCard(int index){
        Card card = new Card(4, 15);
        if(col.get(index) == null){
            return card;
        }
        else if(col.get(index) != card) {
            return col.get(index);
        }else{
            return card;
        }

    }

    public Card topCard(){
        return getCard(col.size()-1);
    }

}
