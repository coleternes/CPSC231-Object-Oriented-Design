/* Name: Cole Ternes
 * ID: 2323955
 */
 interface Printable {
   public void print();
 }

public abstract class AbstractAffiliates implements Comparable<AbstractAffiliates>, Printable{
  //MEMBER VARIABLES
  protected String m_name;
  protected int m_age;
  protected String m_address;
  protected long m_phone_num;
  protected int m_first_year_at_chapman;

  //CONSTRUCTORS
  //Default
  /** Default AbstractAffiliates Constructor
  */
  public AbstractAffiliates() {
    m_name = "";
    m_age = -1;
    m_address = "";
    m_phone_num = -1;
    m_first_year_at_chapman = -1;
  }
  //Overloaded
  /** Overloaded AbstractAffiliates Constructor
  */
  public AbstractAffiliates(String name, int age, String address, long phoneNum, int firstYear) {
    m_name = name;
    m_age = age;
    m_address = address;
    m_phone_num = phoneNum;
    m_first_year_at_chapman = firstYear;
  }
  //Copy
  /** Copy AbstractAffiliates Constructor
  */
  public AbstractAffiliates(AbstractAffiliates a) {
    m_name = a.getName();
    m_age = a.getAge();
    m_address = a.getAddress();
    m_phone_num = a.getPhoneNum();
    m_first_year_at_chapman = a.getFirstYear();
  }

  //ACCESSORS & MUTATORS
  /** Accessor for name
   * @return A string for the name
  */
  public String getName() {
    return m_name;
  }
  /** Mutator for name
   * @param n A string to set the new name as
  */
  public void setName(String n) {
    m_name = n;
  }
  /** Accessor for age
   * @return An int for the age
  */
  public int getAge() {
    return m_age;
  }
  /** Mutator for age
   * @param a An int to set the new age as
  */
  public void setAge(int a) {
    m_age = a;
  }
  /** Accessor for address
   * @return A string for the address
  */
  public String getAddress() {
    return m_address;
  }
  /** Mutator for address
   * @param a A string to set the new address as
  */
  public void setAddress(String a) {
    m_address = a;
  }
  /** Accessor for phone number
   * @return A long for the phone number
  */
  public long getPhoneNum() {
    return m_phone_num;
  }
  /** Mutator for phone number
   * @param p A long to set the new phone number as
  */
  public void setPhoneNum(long p) {
    m_phone_num = p;
  }
  /** Accessor for first year
   * @return An int for the first year
  */
  public int getFirstYear() {
    return m_first_year_at_chapman;
  }
  /** Mutator for first year
   * @param f A long to set the new first year as
  */
  public void setFirstYear(int f) {
    m_first_year_at_chapman = f;
  }

  //METHODS
  /** Method to compare two AbstractAffiliates
   * @param a An AbstractAffiliate
   * @return An int that describes which AbstractAffiliate has an earlier first year
  */
  public int compareTo(AbstractAffiliates a) {
    int ret = 0;
    if (this.getFirstYear() < a.getFirstYear()) {
      ret = -1;
    }
    else if (this.getFirstYear() > a.getFirstYear()) {
      ret = 1;
    }
    return ret;
  }
}
