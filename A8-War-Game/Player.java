/* Name: Cole Ternes
 * ID: 2323955
 */
import java.util.LinkedList;
import java.util.List;

public class Player {
  //Member Variables
  private int m_num;
  private List<Card> m_hand;

  //Overloaded Constructor
  /** Overloaded Player Constructor
  */
  public Player(int n) {
    m_num = n;
    m_hand = new LinkedList<Card>();
  }

  //Accessors
  /** Accessor for player hand
   * @return A list consisting of every card in a player's hand
  */
  public List<Card> getHand() {
    return m_hand;
  }
  /** Accessor for player hand size
   * @return An int for the size of a player's hand
  */
  public int getHandSize() {
    return m_hand.size();
  }

  //flipCard Method
  /** Method for flipping cards
   * @return The top card of a player's hand
  */
  public Card flipCard() {
    Card flippedCard = m_hand.get(0);
    m_hand.remove(0);
    return flippedCard;
  }

  //collectEnd Method
  /** Method for collecting cards to the end of a player's hand
   * @param c A card from a battle or war
  */
  public void collectEnd(Card c) {
    m_hand.add(c);
  }
  //collectFront Method
  /** Method for collecting cards to the front of a player's hand
   * @param c A card from a battle or war
  */
  public void collectFront(Card c) {
    m_hand.add(0,c);
  }

  //hasLost Method
  /** Method for checking if a player has lost
   * @return A boolean if a player lost
  */
  public boolean hasLost() {
    if (m_hand.size() == 0) {
      return true;
    } else {
      return false;
    }
  }

  //getWarCards Method
  /** Method for creating an array to hold the cards during a war
   * @return An array of cards from the front of a player's hand
  */
  public Card[] getWarCards() {
    Card[] warHand;
    if (m_hand.size() == 0) {
      warHand = new Card[0];
    }
    else if (m_hand.size() == 1) {
      warHand = new Card[1];
      warHand[0] = m_hand.get(0);
    }
    else if (m_hand.size() == 2) {
      warHand = new Card[2];
      warHand[0] = m_hand.get(0);
      warHand[1] = m_hand.get(1);
    }
    else if (m_hand.size() == 3) {
      warHand = new Card[3];
      warHand[0] = m_hand.get(0);
      warHand[1] = m_hand.get(1);
      warHand[2] = m_hand.get(2);
    }
    else {
      warHand = new Card[4];
      warHand[0] = m_hand.get(0);
      warHand[1] = m_hand.get(1);
      warHand[2] = m_hand.get(2);
      warHand[3] = m_hand.get(3);
    }
    return warHand;
  }
}
