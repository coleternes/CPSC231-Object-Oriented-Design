/* Name: Cole Ternes
 * ID: 2323955
 */
public class FullTimeStaff extends AbstractStaff implements Printable {
  //MEMBER VARIABLES
  private int m_yearly_salary_staff;

  //CONSTRUCTORS
  //Default
  /** Default FullTimeStaff Constructor
  */
  public FullTimeStaff() {
    super();
    m_yearly_salary_staff = -1;
  }
  //Overloaded
  /** Overloaded FullTimeStaff Constructor
  */
  public FullTimeStaff(String name, int age, String address, long phoneNum, int firstYear, int staffID, String title, String building, int yearlySalary) {
    super(name, age, address, phoneNum, firstYear, staffID, title, building);
    m_yearly_salary_staff = yearlySalary;
  }
  //Copy
  /** Copy FullTimeStaff Constructor
  */
  public FullTimeStaff(FullTimeStaff f) {
    super(f.getName(), f.getAge(), f.getAddress(), f.getPhoneNum(), f.getFirstYear(), f.getStaffID(), f.getTitle(), f.getBuilding());
    m_yearly_salary_staff = f.getYearlySalaryStaff();
  }

  //ACCESSORS & MUTATORS
  /** Accessor for staff yearly salary
   * @return An int for the staff yearly salary
  */
  public int getYearlySalaryStaff() {
    return m_yearly_salary_staff;
  }
  /** Mutator for staff yearly salary
   * @param y An int to set the new staff yearly salary as
  */
  public void setYearlySalaryStaff(int y) {
    m_yearly_salary_staff = y;
  }

  //METHODS
  /** Method to print out all FullTimeStaff information
  */
  public void print() {
    String output = "Name: " + super.getName();
    output += "\nAge: " + super.getAge();
    output += "\nAddress: " + super.getAddress();
    output += "\nPhone Number: " + super.getPhoneNum();
    output += "\nFirst Year at Chapman: " + super.getFirstYear();
    output += "\nStaff ID: " + super.getStaffID();
    output += "\nTitle: " + super.getTitle();
    output += "\nBuilding: " + super.getBuilding();
    output += "\nYearly Salary: $" + this.getYearlySalaryStaff();
    System.out.println(output);
  }
}
