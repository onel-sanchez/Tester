/*
 * I affirm that this program is entirely my own work and 
 *none of it is the work of any other person.
 *	__@author Onel Sanchez__
 */
//  File: Card.java
/**
 * Class Card contains the rank and the suit of a card.
 */
public class Card
{

    private int rank;         // face of the card
    private String suit;     // Suit of the card (Spade, Diamond, Club, Heart)

    /**
     * Constructor of the card with a given rank and suit.
     * @param cardRank The Rank of the Card
     * @param cardSuit The Suit of the Card
     */
    public Card(int cardRank, String cardSuit)
    {
        rank = cardRank ;
        suit = cardSuit ;
    }
    
    /**
     * Gets the face of the current card
     *
     * @return the face of the Card
     */
    public int getRank()
    {
        return rank;
    }

    /**
     * Gets the suit of the current card
     *
     * @return the suit of the Card
     */
    public String getSuit()
    {
        
        return suit;
    }

    /**
     * Covert the card object in a string representation of a card.
     * @return a string representation of a card 
     */
    public String toString()
    {
        // Convert 11-J, 12-Q, 13-K, 14-A and each suit in their unicode symbol
        String tempCard = String.valueOf(rank) ;  
        if (this.rank == 11)
                tempCard = "J" ;
        if (this.rank == 12)
                tempCard = "Q" ;        
        if (this.rank == 13)
                tempCard = "K" ;
        if (this.rank == 14)
                tempCard = "A" ; 
        if (this.suit.equals("Spade"))
                return tempCard + "\u2660" ;
        if (this.suit.equals("Diamond"))
                return tempCard + "\u2666" ;        
        if (this.suit.equals("Club"))
                {
                return tempCard.concat("\u2663") ;
                }
        return tempCard + "\u2665" ;        
                
    }              
}
