/* Name: Cole Ternes
 * ID: 2323955
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Deck {
  //Member Variables
  private Random rnd;
  private List<Card> m_deck;

  //Default Constructor
  /** Default Deck Constructor
  */
  public Deck() {
    rnd = new Random();
    m_deck = new LinkedList<Card>();
    //Hearts
    Card c1 = new Card(2, "Heart"); m_deck.add(c1);
    Card c2 = new Card(3, "Heart"); m_deck.add(c2);
    Card c3 = new Card(4, "Heart"); m_deck.add(c3);
    Card c4 = new Card(5, "Heart"); m_deck.add(c4);
    Card c5 = new Card(6, "Heart"); m_deck.add(c5);
    Card c6 = new Card(7, "Heart"); m_deck.add(c6);
    Card c7 = new Card(8, "Heart"); m_deck.add(c7);
    Card c8 = new Card(9, "Heart"); m_deck.add(c8);
    Card c9 = new Card(10, "Heart"); m_deck.add(c9);
    Card c10 = new Card(11, "Heart"); m_deck.add(c10);
    Card c11 = new Card(12, "Heart"); m_deck.add(c11);
    Card c12 = new Card(13, "Heart"); m_deck.add(c12);
    Card c13 = new Card(14, "Heart"); m_deck.add(c13);
    //Spades
    Card c14 = new Card(2, "Spades"); m_deck.add(c14);
    Card c15 = new Card(3, "Spades"); m_deck.add(c15);
    Card c16 = new Card(4, "Spades"); m_deck.add(c16);
    Card c17 = new Card(5, "Spades"); m_deck.add(c17);
    Card c18 = new Card(6, "Spades"); m_deck.add(c18);
    Card c19 = new Card(7, "Spades"); m_deck.add(c19);
    Card c20 = new Card(8, "Spades"); m_deck.add(c20);
    Card c21 = new Card(9, "Spades"); m_deck.add(c21);
    Card c22 = new Card(10, "Spades"); m_deck.add(c22);
    Card c23 = new Card(11, "Spades"); m_deck.add(c23);
    Card c24 = new Card(12, "Spades"); m_deck.add(c24);
    Card c25 = new Card(13, "Spades"); m_deck.add(c25);
    Card c26 = new Card(14, "Spades"); m_deck.add(c26);
    //Clubs
    Card c27 = new Card(2, "Clubs"); m_deck.add(c27);
    Card c28 = new Card(3, "Clubs"); m_deck.add(c28);
    Card c29 = new Card(4, "Clubs"); m_deck.add(c29);
    Card c30 = new Card(5, "Clubs"); m_deck.add(c30);
    Card c31 = new Card(6, "Clubs"); m_deck.add(c31);
    Card c32 = new Card(7, "Clubs"); m_deck.add(c32);
    Card c33 = new Card(8, "Clubs"); m_deck.add(c33);
    Card c34 = new Card(9, "Clubs"); m_deck.add(c34);
    Card c35 = new Card(10, "Clubs"); m_deck.add(c35);
    Card c36 = new Card(11, "Clubs"); m_deck.add(c36);
    Card c37 = new Card(12, "Clubs"); m_deck.add(c37);
    Card c38 = new Card(13, "Clubs"); m_deck.add(c38);
    Card c39 = new Card(14, "Clubs"); m_deck.add(c39);
    //Diamonds
    Card c40 = new Card(2, "Diamonds"); m_deck.add(c40);
    Card c41 = new Card(3, "Diamonds"); m_deck.add(c41);
    Card c42 = new Card(4, "Diamonds"); m_deck.add(c42);
    Card c43 = new Card(5, "Diamonds"); m_deck.add(c43);
    Card c44 = new Card(6, "Diamonds"); m_deck.add(c44);
    Card c45 = new Card(7, "Diamonds"); m_deck.add(c45);
    Card c46 = new Card(8, "Diamonds"); m_deck.add(c46);
    Card c47 = new Card(9, "Diamonds"); m_deck.add(c47);
    Card c48 = new Card(10, "Diamonds"); m_deck.add(c48);
    Card c49 = new Card(11, "Diamonds"); m_deck.add(c49);
    Card c50 = new Card(12, "Diamonds"); m_deck.add(c50);
    Card c51 = new Card(13, "Diamonds"); m_deck.add(c51);
    Card c52 = new Card(14, "Diamonds"); m_deck.add(c52);
  }

  //Accessors
  /** Accessor for deck
   * @return a list consisting of every card in a deck
  */
  public List<Card> getDeck() {
    return m_deck;
  }
  /** Accessor for deck size
   * @return An int for the size of a deck
  */
  public int getDeckSize() {
    return m_deck.size();
  }

  //dealCard Method
  /** Method for dealing cards
   * @return The top card of a deck
  */
  public Card dealCard() {
    int randomIndex = rnd.nextInt(m_deck.size());
    Card dealtCard = m_deck.get(randomIndex);
    m_deck.remove(randomIndex);
    return dealtCard;
  }
}
