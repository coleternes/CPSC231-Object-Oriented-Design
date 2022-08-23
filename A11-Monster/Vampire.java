/* Name: Cole Ternes
 * ID: 2323955
 */

public class Vampire extends Undead {
  //Member Variables
  private int m_num_of_victims;

  //Default Constructor
  /** Default Vampire Constructor
  */
  public Vampire() {
    super();
    m_num_of_victims = -1;
  }

  //Overloaded Constructor
  /** Overloaded Vampire Constructor
  */
  public Vampire(String n, String o, int y, int v) {
    super(n,o,y);
    m_num_of_victims = v;
  }

  //Accessor
  /** Accessor for victims
   * @return An int for the number of victims
  */
  public int getVictims() {
    return m_num_of_victims;
  }

  //Methods
  /** Method to print monster's speech
  */
  public void speak() {
    System.out.println("I vant to suck your blood.\"");
  }
  /** Method to print monster's diet
  */
  public void diet() {
    System.out.println("Blood");
  }
}
