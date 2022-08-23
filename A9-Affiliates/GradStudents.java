/* Name: Cole Ternes
 * ID: 2323955
 */
public class GradStudents extends AbstractStudents implements Printable {
  //MEMBER VARIABLES
  private int m_num_of_papers_stu;
  private String m_thesis_advisor;

  //CONSTRUCTORS
  //Default
  /** Default GradStudents Constructor
  */
  public GradStudents() {
    super();
    m_num_of_papers_stu = -1;
    m_thesis_advisor = "";
  }
  //Overloaded
  /** Overloaded GradStudents Constructor
  */
  public GradStudents(String name, int age, String address, long phoneNum, int firstYear, int stuID, String major, String minor, String classStanding, int numPapers, String thesisAdvisor) {
    super(name, age, address, phoneNum, firstYear, stuID, major, minor, classStanding);
    m_num_of_papers_stu = numPapers;
    m_thesis_advisor = thesisAdvisor;
  }
  //Copy
  /** Copy GradStudents Constructor
  */
  public GradStudents(GradStudents g) {
    super(g.getName(), g.getAge(), g.getAddress(), g.getPhoneNum(), g.getFirstYear(), g.getStuID(), g.getMajor(), g.getMinor(), g.getClassStanding());
    m_num_of_papers_stu = g.getNumOfPapersStu();
    m_thesis_advisor = g.getThesisAdvisor();
  }

  //ACCESSORS & MUTATORS
  /** Accessor for number of student papers published
   * @return An int for the number of student papers published
  */
  public int getNumOfPapersStu() {
    return m_num_of_papers_stu;
  }
  /** Mutator for number of student papers published
   * @param n An int to set the new number of student papers published as
  */
  public void setNumOfPapersStu(int n) {
    m_num_of_papers_stu = n;
  }
  /** Accessor for thesis advisor
   * @return A string for the thesis advisor
  */
  public String getThesisAdvisor() {
    return m_thesis_advisor;
  }
  /** Mutator for the thesis advisor
   * @param t A string to set the new the thesis advisor as
  */
  public void setThesisAdvisor(String t) {
    m_thesis_advisor = t;
  }

  //METHODS
  /** Method to print out all GradStudents information
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
    output += "\nNumber of Papers: " + this.getNumOfPapersStu();
    output += "\nThesis Advisor: " + this.getThesisAdvisor();
    System.out.println(output);
  }
}
