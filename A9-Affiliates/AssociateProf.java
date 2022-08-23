/* Name: Cole Ternes
 * ID: 2323955
 */
public class AssociateProf extends AbstractFaculty implements Printable {
  //MEMBER VARIABLES
  private int m_years_since_tenure;

  //CONSTRUCTORS
  //Default
  /** Default AssociateProf Constructor
  */
  public AssociateProf() {
    super();
    m_years_since_tenure = -1;
  }
  //Overloaded
  /** Overloaded AssociateProf Constructor
  */
  public AssociateProf(String name, int age, String address, long phoneNum, int firstYear, int facID, String department, int yearlySalary, int numPapers, int yearsSinceTenure) {
    super(name, age, address, phoneNum, firstYear, facID, department, yearlySalary, numPapers);
    m_years_since_tenure = yearsSinceTenure;
  }
  //Copy
  /** Copy AssociateProf Constructor
  */
  public AssociateProf(AssociateProf a) {
    super(a.getName(), a.getAge(), a.getAddress(), a.getPhoneNum(), a.getFirstYear(), a.getFacID(), a.getDepartment(), a.getYearlySalaryFac(), a.getNumOfPapersFac());
    m_years_since_tenure = a.getYearsSinceTenure();
  }

  //ACCESSORS & MUTATORS
  /** Accessor for years since tenure
   * @return An int for the years since tenure
  */
  public int getYearsSinceTenure() {
    return m_years_since_tenure;
  }
  /** Mutator for years since tenure
   * @param y An int to set the new years since tenure as
  */
  public void setYearsSinceTenure(int y) {
    m_years_since_tenure = y;
  }

  //METHODS
  /** Method to print out all AssociateProf information
  */
  public void print() {
    String output = "Name: " + super.getName();
    output += "\nAge: " + super.getAge();
    output += "\nAddress: " + super.getAddress();
    output += "\nPhone Number: " + super.getPhoneNum();
    output += "\nFirst Year at Chapman: " + super.getFirstYear();
    output += "\nFaculty ID: " + super.getFacID();
    output += "\nDepartment: " + super.getDepartment();
    output += "\nYearly Salary: $" + super.getYearlySalaryFac();
    output += "\nNumber of Papers: " + super.getNumOfPapersFac();
    output += "\nYears since Tenure: " + this.getYearsSinceTenure();
    System.out.println(output);
  }
}
