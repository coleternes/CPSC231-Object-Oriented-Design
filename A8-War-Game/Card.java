/* Name: Cole Ternes
 * ID: 2323955
 */
public class Card {
  //Member Variables
  private int m_value; //2-10, J, Q, K, A (2-14)
  private String m_suit; //Heart, Spade, Club, Diamond

  //Overloaded Constructor
  /** Overloaded Card Constructor
  */
  public Card(int v, String s) {
    m_value = v;
    m_suit = s;
  }

  //Accessors
  /** Accessor for value
   * @return An int for the value of the card object
  */
  public int getValue() {
    return m_value;
  }
}
