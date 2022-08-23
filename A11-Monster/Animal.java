/* Name: Cole Ternes
 * ID: 2323955
 */

public abstract class Animal extends AbstractMonster {
  //Member Variables
  protected String m_species;

  //Default Constructor
  /** Default Animal Constructor
  */
  public Animal() {
    super();
    m_species = "";
  }

  //Overloaded Constructor
  /** Overloaded Animal Constructor
  */
  public Animal(String n, String o, String s) {
    super(n,o);
    m_species = s;
  }

  //Accessor
  public String getSpecies() {
    return m_species;
  }
}
