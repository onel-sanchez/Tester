/*
 * I affirm that this program is entirely my own work and 
 *none of it is the work of any other person.
 *	__@author Onel Sanchez__
 */
//  File: Hand.java
import java.util.ArrayList;
import java.util.Random;

/**
 * Deck class is an ArrayList of card objects. As a deck there is methods for
 * Shuffle, get a card from the top and, create a deck with a number of cards.
 */
public class Deck
{

    private ArrayList<Card> deck;    // List of Cards.
    private int DECK_SIZE = 52;      // Size of the Deck.

    /**
     * This Deck contains a collection of a common 52 card deck.
     */
    public Deck()
    {
        deck = new ArrayList<Card>(DECK_SIZE); //List of 52 cards.
        //List of all suits of a card deck.
        ArrayList<String> allSuits = new ArrayList<String>(4);
        //Add each suit to the list.
        allSuits.add(0, "Spade");
        allSuits.add(1, "Diamond");
        allSuits.add(2, "Club");
        allSuits.add(3, "Heart");
        Card card;
        //Card Counter to stop the loop when it get to the deck size
        int cardCounter = 0;
        for (int i = 0; i < 4 && cardCounter < DECK_SIZE; i++)
        {
            for (int j = 2; j < 15 && cardCounter < DECK_SIZE; j++)
            {
                card = new Card(j, allSuits.get(i));
                deck.add(card);
                cardCounter++;
            }
        }
    }

    /**
     * Draw a Card from the Deck
     *
     * @return Card removed from the deck
     */
    public Card getTopCard()
    {
        if (deck.size() == 0)   //If the Deck is empty return null
        {
            return null;
        } else
        {
            //Remove the top card from deck and return it
            return deck.remove(0);
        }
    }

    /**
     * Shuffle the Deck in a Random order
     */
    public void shuffle()
    {
        Random randomIndex = new Random();
        // Temporary card variable and index to swap cards in the deck
        Card tempCard;
        int tempIndex;
        for (int i = 0; i < deck.size(); i++)  //Go over each card in the deck
        {
            //get a random index to swap card from the deck and get the card 
            //from that index to swap it with the current i index card
            tempIndex = randomIndex.nextInt(52);
            tempCard = deck.get(tempIndex);
            deck.set(tempIndex, deck.get(i));
            deck.set(i, tempCard);
        }
    }
}
