/* Name: Cole Ternes
 * ID: 2323955
 */

public class Werewolf extends Animal {
  //Member Variables
  private int m_days_until_transformation;

  //Default Constructor
  /** Default Werewolf Constructor
  */
  public Werewolf() {
    super();
    m_days_until_transformation = -1;
  }

  //Overloaded Constructor
  /** Overloaded Werewolf Constructor
  */
  public Werewolf(String n, String o, String s, int d) {
    super(n,o,s);
    m_days_until_transformation = d;
  }

  //Accessor
  /** Accessor for transformation
   * @return An int for the days until transformation
  */
  public int getTransformation() {
    return m_days_until_transformation;
  }

  //Methods
  /** Method to print monster's speech
  */
  public void speak() {
    System.out.println("RAWR!\"");
  }
  /** Method to print monster's diet
  */
  public void diet() {
    System.out.println("Literally Anything");
  }
}
