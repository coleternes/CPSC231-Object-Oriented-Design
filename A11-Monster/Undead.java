/* Name: Cole Ternes
 * ID: 2323955
 */

public abstract class Undead extends AbstractMonster {
  //Member Variables
  protected int m_year_heart_stopped;

  //Default Constructor
  /** Default Undead Constructor
  */
  public Undead() {
    super();
    m_year_heart_stopped = -1;
  }

  //Overloaded Constructor
  /** Overloaded Undead Constructor
  */
  public Undead(String n, String o, int y) {
    super(n,o);
    m_year_heart_stopped = y;
  }

  public int getYear() {
    return m_year_heart_stopped;
  }
}
