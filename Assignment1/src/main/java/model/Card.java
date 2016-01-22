package model;

/**
 * Created by Cameron on 1/20/2016.
 */

public class Card
{
    private int rank, suit;

    private static String[] suits = { "H", "S", "D", "C" };
    private static String[] ranks  = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };


    public Card(int suit, int rank)
    {
        this.rank=rank;
        this.suit=suit;
    }

    public @Override String toString()
    {
        return ranks[rank] + " of " + suits[suit];
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

}

