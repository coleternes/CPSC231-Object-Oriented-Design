/* Name: Cole Ternes
 * ID: 2323955
 */
public class PartTimeStaff extends AbstractStaff implements Printable {
  //MEMBER VARIABLES
  private int m_hourly_salary;

  //CONSTRUCTORS
  //Default
  /** Default PartTimeStaff Constructor
  */
  public PartTimeStaff() {
    super();
    m_hourly_salary = -1;
  }
  //Overloaded
  /** Overloaded PartTimeStaff Constructor
  */
  public PartTimeStaff(String name, int age, String address, long phoneNum, int firstYear, int staffID, String title, String building, int hourlySalary) {
    super(name, age, address, phoneNum, firstYear, staffID, title, building);
    m_hourly_salary = hourlySalary;
  }
  //Copy
  /** Copy PartTimeStaff Constructor
  */
  public PartTimeStaff(PartTimeStaff p) {
    super(p.getName(), p.getAge(), p.getAddress(), p.getPhoneNum(), p.getFirstYear(), p.getStaffID(), p.getTitle(), p.getBuilding());
    m_hourly_salary = p.getHourlySalary();
  }

  //ACCESSORS & MUTATORS
  /** Accessor for hourly salary
   * @return An int for the hourly salary
  */
  public int getHourlySalary() {
    return m_hourly_salary;
  }
  /** Mutator for hourly salary
   * @param h An int to set the new hourly salary as
  */
  public void setHourlySalary(int h) {
    m_hourly_salary = h;
  }

  //METHODS
  /** Method to print out all PartTimeStaff information
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
    output += "\nHourly Salary: $" + this.getHourlySalary();
    System.out.println(output);
  }
}
