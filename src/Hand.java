
/*
 * I affirm that this program is entirely my own work and 
 *none of it is the work of any other person.
 *	__@author Onel Sanchez__
 */
//  File: Hand.java 
import java.util.ArrayList;

/**
 * Coding representation of a Hand with 13 cards in a card game with methods for
 * fill the hand with cards from the deck in order.
 */
public class Hand
{

    private ArrayList<Card> hand;   //Hand representation of a group of 13 cards
    private int HAND_SIZE = 13;     //Size of the Hand

    /**
     * Creates an empty Hand of card with a size of 13.
     */
    public Hand()
    {
        hand = new ArrayList<Card>(HAND_SIZE);
    }

    /**
     * Fill the Hand with 13 cards drawn from the deck in order by suit and rank
     *
     * @param deck object with cards
     */
    public void fillHand(Deck deck)
    {
        //Creates Arraylist of each suit to insert cards by suit
        ArrayList<Card> heart = new ArrayList<Card>();
        ArrayList<Card> spade = new ArrayList<Card>();
        ArrayList<Card> club = new ArrayList<Card>();
        ArrayList<Card> diamond = new ArrayList<Card>();
        Card tempCard;
        for (int i = 0; i < HAND_SIZE; i++)  //For each card in the hand...
        {
            tempCard = deck.getTopCard();    //Draw top card from the deck
            //Sort each card and insert it in its respective arraylist.
            if (tempCard.getSuit().equals("Spade"))
            {
                spade.add(tempCard);
            }
            if (tempCard.getSuit().equals("Diamond"))
            {
                diamond.add(tempCard);
            }
            if (tempCard.getSuit().equals("Club"))
            {
                club.add(tempCard);
            }
            if (tempCard.getSuit().equals("Heart"))
            {
                heart.add(tempCard);
            }
        }
        //Order each list of card suit by rank.
        spade = this.orderDeck(spade);
        diamond = this.orderDeck(diamond);
        club = this.orderDeck(club);
        heart = this.orderDeck(heart);
        //Add all four arraylist of cards already ordered into the Hand. 
        hand.addAll(spade);
        hand.addAll(diamond);
        hand.addAll(club);
        hand.addAll(heart);
    }

    /**
     * Order an ArrayList of cards by rank.
     *
     * @param cards ArrayList of cards to be ordered
     * @return ArrayList of cards ordered by rank
     */
    public ArrayList orderDeck(ArrayList<Card> cards)
    {
        Card tempCard;   //Temporary card to make a swap in the ArrayList
        //Bubblesort method. On each i iteration the last element of the 
        //ArrayList is going to be ordered.
        for (int i = 0; i < cards.size() - 1; i++)
        {
            //Index j stars in the second element and compare with 
            //the element j-1. On each j iteration the greater card rank goes 
            //up one position in the ArrayList, at the end of the loop.
            for (int j = 1; j < cards.size() - i; j++)
            {
                //if card rank in index j is greater that the previous card 
                if (cards.get(j - 1).getRank() > cards.get(j).getRank())
                {
                    //Sawp card in index j with the previous card (j-1)
                    tempCard = cards.get(j - 1);
                    cards.set(j - 1, cards.get(j));
                    cards.set(j, tempCard);
                }
            }
        }
        return cards; //return ArrayList ordered
    }

    /**
     * Creates a String variable representation of all cards in the Hand
     *
     * @return a string with all cards representation in the hand.
     */
    public String toString()
    {
        String handCards = new String();
        for (int i = 0; i < hand.size(); i++)  //For each card in the hand
        {
            /**
             * Convert the card object into a string using the toString method
             * from the card object and concatenate that on each iteration in
             * the handCards variable.
             */
            handCards += hand.get(i).toString() + "   ";
        }
        return handCards;  //Return the string variable with all cards on it.
    }
}
