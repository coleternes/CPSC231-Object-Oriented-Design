/* Name: Cole Ternes
 * ID: 2323955
 */
import java.util.LinkedList;
import java.util.List;

public class Game {
  //Member Variables
  private int m_num_of_battles;
  private int m_num_of_wars;
  private int m_num_of_double_wars;
  private Player m_p1;
  private Player m_p2;
  private Deck m_deck;

  //Default Constructor
  /** Default Game Constructor
  */
  public Game() {
    m_p1 = new Player(1);
    m_p2 = new Player(2);
    m_deck = new Deck();
  }

  //Accessors
  /** Accessor for total battles
   * @return An int for the total battles from a game
  */
  public int getTotalBattles() {
    return m_num_of_battles;
  }
  /** Accessor for total wars
   * @return An int for the total wars from a game
  */
  public int getTotalWars() {
    return m_num_of_wars;
  }
  /** Accessor for total double wars
   * @return An int for the total double wars from a game
  */
  public int getTotalDoubleWars() {
    return m_num_of_double_wars;
  }

  //playGame Method
  /** Method for playing a game; this is what makes the beast works
  */
  public void playGame() {
    //Deals each player their hand
    for (int i = 0; i < 26; i++) {
      Card randomCard = m_deck.dealCard();
      m_p1.getHand().add(randomCard);
    }
    for (int i = 0; i < 26; i++) {
      Card randomCard = m_deck.dealCard();
      m_p2.getHand().add(randomCard);
    }

    //Continues to play until a player has won
    boolean p1Loser = false;
    boolean p2Loser = false;
    while (!p1Loser && !p2Loser) {
      //m_p1 has their winning cards added to the end of their deck always
      //m_p2 has their winning cards added to the front of their deck always
      //Plays top cards from both player's hands
      Card p1Card = m_p1.flipCard();
      Card p2Card = m_p2.flipCard();

      //If Statement to handle Battles or Wars
      if (p1Card.getValue() > p2Card.getValue()) {
        //P1 wins the Battle
        m_p1.collectEnd(p1Card);
        m_p1.collectEnd(p2Card);
        m_num_of_battles++;
      } else if (p2Card.getValue() > p1Card.getValue()) {
        //P2 wins the Battle
        m_p2.collectFront(p1Card);
        m_p2.collectFront(p2Card);
        m_num_of_battles++;
      } else {
        //Go to War
        //In case of repeated wars, then playedCards will keep track of which cards have been played already
        List<Card> playedCards = new LinkedList<Card>();

        //Controls if there is another war
        boolean someoneWonTheWar = false;
        //Prevents miscount of double wars
        int warLoopCounter = 0;

        while (!someoneWonTheWar) {
          //Array of Cards for the war
          Card[] p1WarHand = m_p1.getWarCards();
          Card[] p2WarHand = m_p2.getWarCards();

          //Makes sure that each player's war hands are greater than 0 so that
          //they can't go to war without anymore cards in their hand
          if (p1WarHand.length > 0 && p2WarHand.length > 0) {
            //The war cards are the new cards that are checked
            Card p1LastWarCard = p1WarHand[p1WarHand.length-1];
            Card p2LastWarCard = p2WarHand[p2WarHand.length-1];

            if (p1LastWarCard.getValue() > p2LastWarCard.getValue()) {
              //P1 wins the War
              someoneWonTheWar = true;
              m_num_of_wars++;
              //Collects the Cards that started the war
              m_p1.collectEnd(p1Card);
              m_p1.collectEnd(p2Card);
              //Collects the cards if the war was repeated
              if (playedCards.size() > 0) {
                for (int i = 0; i < playedCards.size(); i++) {
                  m_p1.collectEnd(playedCards.get(i));
                }
              }
              //Collects the cards from p1WarHand and removes it from their hand
              for (int i = 0; i < p1WarHand.length; i++) {
                m_p1.getHand().remove(0);
                m_p1.collectEnd(p1WarHand[i]);
              }
              //Collects the cards from p2WarHand and removes it from their hand
              for (int i = 0; i < p2WarHand.length; i++) {
                m_p2.getHand().remove(0);
                m_p1.collectEnd(p2WarHand[i]);
              }
            } else if (p2LastWarCard.getValue() > p1LastWarCard.getValue()) {
              //P2 wins the War
              someoneWonTheWar = true;
              m_num_of_wars++;
              //Collects the Cards that started the war
              m_p2.collectFront(p1Card);
              m_p2.collectFront(p2Card);
              //Collects the cards if the war was repeated
              if (playedCards.size() > 0) {
                for (int i = 0; i < playedCards.size(); i++) {
                  m_p2.collectFront(playedCards.get(i));
                }
              }
              //Collects the cards from p1WarHand and removes it from their hand
              for (int i = 0; i < p1WarHand.length; i++) {
                m_p1.getHand().remove(0);
                m_p2.collectFront(p1WarHand[i]);
              }
              //Collects the cards from p2WarHand and removes it from their hand
              for (int i = 0; i < p2WarHand.length; i++) {
                m_p2.getHand().remove(0);
                m_p2.collectFront(p2WarHand[i]);
              }
            } else {
              //Go to War... again
              warLoopCounter++;
              //Add p1WarHand to playedCards and removes it from their hand
              for (int i = 0; i < p1WarHand.length; i++) {
                Card tempCard = p1WarHand[i];
                playedCards.add(tempCard);
                m_p1.getHand().remove(0);
              }
              //Add p2WarHand to playedCards and removes it from their hand
              for (int i = 0; i < p2WarHand.length; i++) {
                Card tempCard = p2WarHand[i];
                playedCards.add(tempCard);
                m_p2.getHand().remove(0);
              }
              if (warLoopCounter == 1) {
                m_num_of_double_wars++;
              }
            }
          } else if (p1WarHand.length == 0) {
            someoneWonTheWar = true;
            //Collects the Cards that started the war
            m_p2.collectFront(p1Card);
            m_p2.collectFront(p2Card);
            //Collects the cards if the war was repeated
            if (playedCards.size() > 0) {
              for (int i = 0; i < playedCards.size(); i++) {
                m_p2.collectFront(playedCards.get(i));
              }
            }
            //Collects the cards from p2WarHand
            for (int i = 0; i < p2WarHand.length; i++) {
              m_p2.collectFront(p2WarHand[i]);
            }
          } else if (p2WarHand.length == 0) {
            someoneWonTheWar = true;
            //Collects the Cards that started the war
            m_p1.collectEnd(p1Card);
            m_p1.collectEnd(p2Card);
            //Collects the cards if the war was repeated
            if (playedCards.size() > 0) {
              for (int i = 0; i < playedCards.size(); i++) {
                m_p1.collectEnd(playedCards.get(i));
              }
            }
            //Collects the cards from p2WarHand
            for (int i = 0; i < p2WarHand.length; i++) {
              m_p1.collectEnd(p2WarHand[i]);
            }
          }
        }
      }
      //Checks to see if a player has won in order to break the loop
      p1Loser = m_p1.hasLost();
      p2Loser = m_p2.hasLost();
    }
  }
}
