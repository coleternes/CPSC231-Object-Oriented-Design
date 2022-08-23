/* Name: Cole Ternes
 * ID: 2323955
 */
public class UndergradStudents extends AbstractStudents implements Printable{
  //MEMBER VARIABLES
  private int m_num_of_courses_taken;
  private int m_scholarship;

  //CONSTRUCTORS
  //Default
  /** Default UndergradStudents Constructor
  */
  public UndergradStudents() {
    super();
    m_num_of_courses_taken = -1;
    m_scholarship = -1;
  }
  //Overloaded
  /** Overloaded UndergradStudents Constructor
  */
  public UndergradStudents(String name, int age, String address, long phoneNum, int firstYear, int stuID, String major, String minor, String classStanding, int coursesTaken, int scholarship) {
    super(name, age, address, phoneNum, firstYear, stuID, major, minor, classStanding);
    m_num_of_courses_taken = coursesTaken;
    m_scholarship = scholarship;
  }
  //Copy
  /** Copy UndergradStudents Constructor
  */
  public UndergradStudents(UndergradStudents u) {
    super(u.getName(), u.getAge(), u.getAddress(), u.getPhoneNum(), u.getFirstYear(), u.getStuID(), u.getMajor(), u.getMinor(), u.getClassStanding());
    m_num_of_courses_taken = u.getCoursesTaken();
    m_scholarship = u.getScholarship();
  }

  //ACCESSORS & MUTATORS
  /** Accessor for courses taken
   * @return An int for the courses taken
  */
  public int getCoursesTaken() {
    return m_num_of_courses_taken;
  }
  /** Mutator for the courses taken
   * @param n An int to set the new the courses taken as
  */
  public void setCoursesTaken(int n) {
    m_num_of_courses_taken = n;
  }
  /** Accessor for scholarship
   * @return An int for the scholarship
  */
  public int getScholarship() {
    return m_scholarship;
  }
  /** Mutator for the scholarship
   * @param s An int to set the new the scholarship as
  */
  public void setScholarship(int s) {
    m_scholarship = s;
  }

  //METHODS
  /** Method to print out all UndergradStudents information
  */
  public void print() {
    String output = "Name: " + super.getName();
    output += "\nAge: " + super.getAge();
    output += "\nAddress: " + super.getAddress();
    output += "\nPhone Number: " + super.getPhoneNum();
    output += "\nFirst Year at Chapman: " + super.getFirstYear();
    output += "\nStudent ID: " + super.getStuID();
    output += "\nMajor: " + super.getMajor();
    output += "\nMinor: " + super.getMinor();
    output += "\nClass Standing: " + super.getClassStanding();
    output += "\nNumber of Courses Taken: " + this.getCoursesTaken();
    output += "\nScholarship: $" + this.getScholarship();
    System.out.println(output);
  }
}
