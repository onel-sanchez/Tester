/*
 * I affirm that this program is entirely my own work and 
 *none of it is the work of any other person.
 *	__@author Onel Sanchez__
 */
//  File: Test.java (Interactive method)
import javax.swing.JOptionPane;

/**
 * Test class for the Card, Hand and Deck class. Print all cards in the hand
 * after creating a deck, shuffle it, and draw cards into the hand.
 */
public class Test
{

    public static void main(String[] args)
    {
        //Initialize the variable with the YES_OPTION as default
        int option = JOptionPane.YES_OPTION;
        while (option == JOptionPane.YES_OPTION)
        {
            Deck deck = new Deck();  //Create a deck with all 52 cards
            deck.shuffle();          //Shuffle the deck
            Hand hand = new Hand();  //Create and empty hand
            hand.fillHand(deck);    //Fill and sort hand with cards from deck 
            String printHandCards = hand.toString(); //Cpnvert cards to string
            System.out.println(printHandCards);
            //If user doesn't want to draw another hand the option value is
            //changed to the NO_OPTION value and this ends the while loop
            option = JOptionPane.showConfirmDialog(null, "Do you want to draw "
                    + "another hand from the deck?", "Draw Hand", 0);
        }
    }
}
