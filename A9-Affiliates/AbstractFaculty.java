/* Name: Cole Ternes
 * ID: 2323955
 */
public abstract class AbstractFaculty extends AbstractAffiliates implements Printable {
  //MEMBER VARIABLES
  protected int m_fac_id;
  protected String m_department;
  protected int m_yearly_salary_fac;
  protected int m_num_of_papers_fac;

  //CONSTRUCTORS
  //Default
  /** Default AbstractFaculty Constructor
  */
  public AbstractFaculty() {
    super();
    m_fac_id = -1;
    m_department = "";
    m_yearly_salary_fac = -1;
    m_num_of_papers_fac = -1;
  }
  //Overloaded
  /** Overloaded AbstractFaculty Constructor
  */
  public AbstractFaculty(String name, int age, String address, long phoneNum, int firstYear, int facID, String department, int yearlySalary, int numPapers) {
    super(name, age, address, phoneNum, firstYear);
    m_fac_id = facID;
    m_department = department;
    m_yearly_salary_fac = yearlySalary;
    m_num_of_papers_fac = numPapers;
  }
  //Copy
  /** Copy AbstractFaculty Constructor
  */
  public AbstractFaculty(AbstractFaculty a) {
    super(a.getName(), a.getAge(), a.getAddress(), a.getPhoneNum(), a.getFirstYear());
    m_fac_id = a.getFacID();
    m_department = a.getDepartment();
    m_yearly_salary_fac = a.getYearlySalaryFac();
    m_num_of_papers_fac = a.getNumOfPapersFac();
  }

  //ACCESSORS & MUTATORS
  /** Accessor for faculty id
   * @return An int for the faculty id
  */
  public int getFacID() {
    return m_fac_id;
  }
  /** Mutator for faculty id
   * @param f An int to set the new faculty id as
  */
  public void setFacID(int f) {
    m_fac_id = f;
  }
  /** Accessor for department
   * @return A string for the department id
  */
  public String getDepartment() {
    return m_department;
  }
  /** Mutator for department
   * @param d A string to set the new department as
  */
  public void setDepartment(String d) {
    m_department = d;
  }
  /** Accessor for faculty yearly salary
   * @return An int for the faculty yearly salary
  */
  public int getYearlySalaryFac() {
    return m_yearly_salary_fac;
  }
  /** Mutator for faculty yearly salary
   * @param y An int to set the new faculty yearly salary as
  */
  public void setYearlySalaryFac(int y) {
    m_yearly_salary_fac = y;
  }
  /** Accessor for number of faculty papers published
   * @return An int for the number of faculty papers published
  */
  public int getNumOfPapersFac() {
    return m_num_of_papers_fac;
  }
  /** Mutator for number of faculty papers published
   * @param n An int to set the new number of faculty papers published as
  */
  public void setNumOfPapersFac(int n) {
    m_num_of_papers_fac = n;
  }
}
