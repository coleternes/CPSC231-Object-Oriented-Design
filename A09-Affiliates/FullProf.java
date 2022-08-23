/* Name: Cole Ternes
 * ID: 2323955
 */
public class FullProf extends AbstractFaculty implements Printable {
  //MEMBER VARIABLES
  private int m_years_until_retirement;

  //CONSTRUCTORS
  //Default
  /** Default FullProf Constructor
  */
  public FullProf() {
    super();
    m_years_until_retirement = -1;
  }
  //Overloaded
  /** Overloaded FullProf Constructor
  */
  public FullProf(String name, int age, String address, long phoneNum, int firstYear, int facID, String department, int yearlySalary, int numPapers, int yearsUntilRetirement) {
    super(name, age, address, phoneNum, firstYear, facID, department, yearlySalary, numPapers);
    m_years_until_retirement = yearsUntilRetirement;
  }
  //Copy
  /** Copy FullProf Constructor
  */
  public FullProf(FullProf f) {
    super(f.getName(), f.getAge(), f.getAddress(), f.getPhoneNum(), f.getFirstYear(), f.getFacID(), f.getDepartment(), f.getYearlySalaryFac(), f.getNumOfPapersFac());
    m_years_until_retirement = f.getYearsUntilRetirement();
  }

  //ACCESSORS & MUTATORS
  /** Accessor for years until retirement
   * @return An int for the years until retirement
  */
  public int getYearsUntilRetirement() {
    return m_years_until_retirement;
  }
  /** Mutator for years until retirement
   * @param y An int to set the new years until retirement as
  */
  public void setYearsUntilRetirement(int y) {
    m_years_until_retirement = y;
  }

  //METHODS
  /** Method to print out all FullProf information
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
    output += "\nYears until Retirement: " + this.getYearsUntilRetirement();
    System.out.println(output);
  }
}
