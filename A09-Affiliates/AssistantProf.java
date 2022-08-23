/* Name: Cole Ternes
 * ID: 2323955
 */
public class AssistantProf extends AbstractFaculty implements Printable {
  //MEMBER VARIABLES
  private int m_years_until_tenure;

  //CONSTRUCTORS
  //Default
  /** Default AssistantProf Constructor
  */
  public AssistantProf() {
    super();
    m_years_until_tenure = -1;
  }
  //Overloaded
  /** Overloaded AssistantProf Constructor
  */
  public AssistantProf(String name, int age, String address, long phoneNum, int firstYear, int facID, String department, int yearlySalary, int numPapers, int yearsUntilTenure) {
    super(name, age, address, phoneNum, firstYear, facID, department, yearlySalary, numPapers);
    m_years_until_tenure = yearsUntilTenure;
  }
  //Copy
  /** Copy AssistantProf Constructor
  */
  public AssistantProf(AssistantProf a) {
    super(a.getName(), a.getAge(), a.getAddress(), a.getPhoneNum(), a.getFirstYear(), a.getFacID(), a.getDepartment(), a.getYearlySalaryFac(), a.getNumOfPapersFac());
    m_years_until_tenure = a.getYearsUntilTenure();
  }

  //ACCESSORS & MUTATORS
  /** Accessor for years until tenure
   * @return An int for the years until tenure
  */
  public int getYearsUntilTenure() {
    return m_years_until_tenure;
  }
  /** Mutator for years until tenure
   * @param y An int to set the new years until tenure as
  */
  public void setYearsUntilTenure(int y) {
    m_years_until_tenure = y;
  }

  //METHODS
  /** Method to print out all AssistantProf information
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
    output += "\nYears until Tenure: " + this.getYearsUntilTenure();
    System.out.println(output);
  }
}
