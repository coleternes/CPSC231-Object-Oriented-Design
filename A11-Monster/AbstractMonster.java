/* Name: Cole Ternes
 * ID: 2323955
 */

public abstract class AbstractMonster {
  //Member Variables
  protected String m_name;
  protected String m_origin;

  //Default Constructor
  /** Default Monster Constructor
  */
  public AbstractMonster() {
    m_name = "";
    m_origin = "";
  }

  //Overloaded Constructor
  /** Overloaded Monster Constructor
  */
  public AbstractMonster(String n, String o) {
    m_name = n;
    m_origin= o;
  }

  //Accessor
  public String getName() {
    return m_name;
  }
  public String getOrigin() {
    return m_origin;
  }

  //Methods
  /** Method to print monster's speech
  */
  public abstract void speak();
  /** Method to print monster's diet
  */
  public abstract void diet();
}
