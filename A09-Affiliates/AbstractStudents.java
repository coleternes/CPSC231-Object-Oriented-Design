/* Name: Cole Ternes
 * ID: 2323955
 */
public abstract class AbstractStudents extends AbstractAffiliates implements Printable {
  //MEMBER VARIABLES
  protected int m_stu_id;
  protected String m_major;
  protected String m_minor;
  protected String m_class_standing;

  //CONSTRUCTORS
  //Default
  /** Default AbstractStudents Constructor
  */
  public AbstractStudents() {
    super();
    m_stu_id = -1;
    m_major = "";
    m_minor = "";
    m_class_standing = "";
  }
  //Overloaded
  /** Overloaded AbstractStudents Constructor
  */
  public AbstractStudents(String name, int age, String address, long phoneNum, int firstYear, int stuID, String major, String minor, String classStanding) {
    super(name, age, address, phoneNum, firstYear);
    m_stu_id = stuID;
    m_major = major;
    m_minor = minor;
    m_class_standing = classStanding;
  }
  //Copy
  /** Copy AbstractStudents Constructor
  */
  public AbstractStudents(AbstractStudents a) {
    super(a.getName(), a.getAge(), a.getAddress(), a.getPhoneNum(), a.getFirstYear());
    m_stu_id = a.getStuID();
    m_major = a.getMajor();
    m_minor = a.getMinor();
    m_class_standing = a.getClassStanding();
  }

  //ACCESSORS & MUTATORS
  /** Accessor for student id
   * @return An int for the student id
  */
  public int getStuID() {
    return m_stu_id;
  }
  /** Mutator for student id
   * @param s An int to set the new student id as
  */
  public void setStuID(int s) {
    m_stu_id = s;
  }
  /** Accessor for major
   * @return A string for the major
  */
  public String getMajor() {
    return m_major;
  }
  /** Mutator for major
   * @param m A string to set the new major as
  */
  public void setMajor(String m) {
    m_major = m;
  }
  /** Accessor for minor
   * @return A string for the minor
  */
  public String getMinor() {
    return m_minor;
  }
  /** Mutator for minor
   * @param m A string to set the new minor as
  */
  public void setMinor(String m) {
    m_minor = m;
  }
  /** Accessor for class standing
   * @return A string for the class standing
  */
  public String getClassStanding() {
    return m_class_standing;
  }
  /** Mutator for class standing
   * @param c A string to set the new class standing as
  */
  public void setClassStanding(String c) {
    m_class_standing = c;
  }
}
