/* Name: Cole Ternes
 * ID: 2323955
 */

public class Zombie extends Undead {
  //Member Variables
  private String m_favorite_weapon;

  //Default Constructor
  /** Default Zombie Constructor
  */
  public Zombie() {
    super();
    m_favorite_weapon = "";
  }

  //Overloaded Constructor
  /** Overloaded Zombie Constructor
  */
  public Zombie(String n, String o, int y, String w) {
    super(n,o,y);
    m_favorite_weapon = w;
  }

  //Accessor
  /** Accessor for weapon
   * @return A string for the weapon
  */
  public String getWeapon() {
    return m_favorite_weapon;
  }

  //Methods
  /** Method to print monster's speech
  */
  public void speak() {
    System.out.println("Grrrrrrrr...\"");
  }
  /** Method to print monster's diet
  */
  public void diet() {
    System.out.println("Brains");
  }
}
