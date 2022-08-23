/* Name: Cole Ternes
 * ID: 2323955
 */
public abstract class AbstractStaff extends AbstractAffiliates implements Printable {
  //MEMBER VARIABLES
  protected int m_staff_id;
  protected String m_title;
  protected String m_building;

  //CONSTRUCTORS
  //Default
  /** Default AbstractStaff Constructor
  */
  public AbstractStaff() {
    super();
    m_staff_id = -1;
    m_title = "";
    m_building = "";
  }
  //Overloaded
  /** Overloaded AbstractStaff Constructor
  */
  public AbstractStaff(String name, int age, String address, long phoneNum, int firstYear, int staffID, String title, String building) {
    super(name, age, address, phoneNum, firstYear);
    m_staff_id = staffID;
    m_title = title;
    m_building = building;
  }
  //Copy
  /** Copy AbstractStaff Constructor
  */
  public AbstractStaff(AbstractStaff a) {
    super(a.getName(), a.getAge(), a.getAddress(), a.getPhoneNum(), a.getFirstYear());
    m_staff_id = a.getStaffID();
    m_title = a.getTitle();
    m_building = a.getBuilding();
  }

  //ACCESSORS & MUTATORS
  /** Accessor for staff id
   * @return An int for the staff id
  */
  public int getStaffID() {
    return m_staff_id;
  }
  /** Mutator for the staff id
   * @param s An int to set the new the staff id as
  */
  public void setStaffID(int s) {
    m_staff_id = s;
  }
  /** Accessor for title
   * @return A string for the title
  */
  public String getTitle() {
    return m_title;
  }
  /** Mutator for the title
   * @param t A tile to set the new the title as
  */
  public void setTitle(String t) {
    m_title = t;
  }
  /** Accessor for building
   * @return A string for the building
  */
  public String getBuilding() {
    return m_building;
  }
  /** Mutator for the building
   * @param b A tile to set the new the building as
  */
  public void setBuilding(String b) {
    m_building = b;
  }
}
