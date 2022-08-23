/* Name: Cole Ternes
 * ID: 2323955
 */
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class AffiliateDriver {
  //MEMBER VARIABLES
  HashMap<Integer, AbstractAffiliates> allAffiliates;
  Scanner sin;

  //CONSTRUCTOR
  /** Default AffiliateDriver Constructor
  */
  public AffiliateDriver() {
    allAffiliates = new HashMap<>();
    sin = new Scanner(System.in);
  }

  //METHODS
  /** Method to print out the menu
  */
  public int printMenu() {
    //Spacing eats up the extra \n's
    String spacing = "";
    //Menu string
    String prompt2 = "Enter a Number:";
    prompt2 += "\n1 - Create an Affiliate Record";
    prompt2 += "\n2 - Print Information for an Affiliate";
    prompt2 += "\n3 - List all Affiliates";
    prompt2 += "\n4 - Delete an Affiliate Record";
    prompt2 += "\n5 - Exit Program";
    //Prints the menu string
    System.out.println(prompt2);
    //User enters the option
    int n = sin.nextInt();
    spacing = sin.nextLine();
    return n;
  }
  /** Method to create an AbstractAffiliate record
  */
  public void createRecord() {
    //Spacing eats up the extra \n's
    String spacing = "";
    //Affiliate type string
    String prompt1 = "Enter the number of the Affiliate Type you want to create:";
    prompt1 += "\n1 - Assistant Professor";
    prompt1 += "\n2 - Associate Professor";
    prompt1 += "\n3 - Full Professor";
    prompt1 += "\n4 - Graduate Student";
    prompt1 += "\n5 - Undergraduate Student";
    prompt1 += "\n6 - Full Time Staff";
    prompt1 += "\n7 - Part Time Staff";
    //Prints the affiliate type string
    System.out.println(prompt1);
    //User enters the option
    int num1 = sin.nextInt();
    spacing = sin.nextLine();

    //AbstractAffiliates Parameters
    System.out.println("Enter your Name:");
    String name = sin.nextLine();
    System.out.println("Enter your Age:");
    int age = sin.nextInt();
    spacing = sin.nextLine();
    System.out.println("Enter your Address:");
    String address = sin.nextLine();
    System.out.println("Enter your Phone Number (numbers only):");
    long phoneNum = sin.nextLong();
    spacing = sin.nextLine();
    System.out.println("Enter your First Year at Chapman:");
    int firstYear = sin.nextInt();
    spacing = sin.nextLine();

    if (num1 >= 1 && num1 < 4) {
      //AbstractFaculty Parameters
      System.out.println("Enter your Faculty ID:");
      int facID = sin.nextInt();
      spacing = sin.nextLine();
      System.out.println("Enter your Department:");
      String department = sin.nextLine();
      System.out.println("Enter your Yearly Salary:");
      int yearlySalary = sin.nextInt();
      spacing = sin.nextLine();
      System.out.println("Enter your Number of Papers:");
      int numPapers = sin.nextInt();
      spacing = sin.nextLine();

      switch (num1) {
        case 1:
          //AssistantProf Parameters
          System.out.println("Enter the Number of Years until your Tenure:");
          int yearsUntilTenure = sin.nextInt();
          spacing = sin.nextLine();

          AbstractAffiliates assistantProf = new AssistantProf(name, age, address, phoneNum, firstYear, facID, department, yearlySalary, numPapers, yearsUntilTenure);
          allAffiliates.put(facID, assistantProf);
          break;
        case 2:
          //AssociateProf Parameters
          System.out.println("Enter the Number of Years since your Tenure:");
          int yearsSinceTenure = sin.nextInt();
          spacing = sin.nextLine();

          AbstractAffiliates associateProf = new AssociateProf(name, age, address, phoneNum, firstYear, facID, department, yearlySalary, numPapers, yearsSinceTenure);
          allAffiliates.put(facID, associateProf);
          break;
        case 3:
          //FullProf Parameters
          System.out.println("Enter the Number of Years until your Retirement:");
          int yearsUntilRetirement = sin.nextInt();
          spacing = sin.nextLine();

          AbstractAffiliates fullProf = new FullProf(name, age, address, phoneNum, firstYear, facID, department, yearlySalary, numPapers, yearsUntilRetirement);
          allAffiliates.put(facID, fullProf);
          break;
        default:
          System.out.println("!!ERROR!!\nCannot create Faculty Affiliate");
      }
    }
    else if (num1 >= 4 && num1 < 6) {
      //AbstractStudents Parameters
      System.out.println("Enter your Student ID:");
      int stuID = sin.nextInt();
      spacing = sin.nextLine();
      System.out.println("Enter your Major(s):");
      String major = sin.nextLine();
      System.out.println("Enter your Minor(s):");
      String minor = sin.nextLine();
      System.out.println("Enter your Class Standing:");
      String classStanding = sin.nextLine();

      switch (num1) {
        case 4:
          //GradStudents Parameters
          System.out.println("Enter your Number of Papers:");
          int numPapers = sin.nextInt();
          spacing = sin.nextLine();
          System.out.println("Enter your Thesis Advisor:");
          String thesisAdvisor = sin.nextLine();

          AbstractAffiliates gradStu = new GradStudents(name, age, address, phoneNum, firstYear, stuID, major, minor, classStanding, numPapers, thesisAdvisor);
          allAffiliates.put(stuID, gradStu);
          break;
        case 5:
          //UndergradStudents Parameters
          System.out.println("Enter your Number of Courses Taken:");
          int coursesTaken = sin.nextInt();
          spacing = sin.nextLine();
          System.out.println("Enter your Scholarship Amount:");
          int scholarship = sin.nextInt();
          spacing = sin.nextLine();

          AbstractAffiliates undergradStu = new UndergradStudents(name, age, address, phoneNum, firstYear, stuID, major, minor, classStanding, coursesTaken, scholarship);
          allAffiliates.put(stuID, undergradStu);
          break;
        default:
          System.out.println("!!ERROR!!\nCannot create Student Affiliate");
      }
    }
    else if (num1 >= 6 && num1 < 8) {
      //AbstractStaff Parameters
      System.out.println("Enter your Staff ID:");
      int staffID = sin.nextInt();
      spacing = sin.nextLine();
      System.out.println("Enter your Title:");
      String title = sin.nextLine();
      System.out.println("Enter your Building:");
      String building = sin.nextLine();

      switch (num1) {
        case 6:
          //FullTimeStaff Parameters
          System.out.println("Enter your Yearly Salary:");
          int yearlySalary = sin.nextInt();
          spacing = sin.nextLine();

          AbstractAffiliates fullTimeStaff = new FullTimeStaff(name, age, address, phoneNum, firstYear, staffID, title, building, yearlySalary);
          allAffiliates.put(staffID, fullTimeStaff);
          break;
        case 7:
          //PartTimeStaff Parameters
          System.out.println("Enter your Hourly Salary:");
          int hourlySalary = sin.nextInt();
          spacing = sin.nextLine();

          AbstractAffiliates partTimeStaff = new PartTimeStaff(name, age, address, phoneNum, firstYear, staffID, title, building, hourlySalary);
          allAffiliates.put(staffID, partTimeStaff);
          break;
        default:
          System.out.println("!!ERROR!!\nCannot create Staff Affiliate");
      }
    }
    else {
        System.out.println("!!ERROR!!\nEntered incorrect Number");
    }
  }
  /** Method to print an AbstractAffiliate record
  */
  public void printRecord() {
    //Spacing eats up the extra \n's
    String spacing = "";
    //Asks user for ID
    System.out.println("Enter the ID of the Affiliate you wish to Print:");
    int id = sin.nextInt();
    spacing = sin.nextLine();
    //Prints the information of the affiliate with the corresponding id
    allAffiliates.get(id).print();
  }
  /** Method to list all AbstractAffiliate records
  */
  public void listAllRecords() {
    int index = 1;
    //For-Loop to iterate through the HashMap of Affiliates
    for (int id1 : allAffiliates.keySet()) {
      //Makes sure that things are only printed once
      int dupeCounter = 0;
      //For-Loop to again iterate through the HashMap of Affiliates
      for (int id2 : allAffiliates.keySet()) {
        int comparedVal = allAffiliates.get(id2).compareTo(allAffiliates.get(id1));
        //Prints the affiliates in senority order
        if (comparedVal < 1 && dupeCounter == 0) {
          String line = index + ") " + allAffiliates.get(id1).getName() + " - " + allAffiliates.get(id1).getFirstYear();
          System.out.println(line);
          index++;
          dupeCounter++;
        }
      }
    }
  }
  /** Method to delete an AbstractAffiliate record
  */
  public void deleteRecord() {
    //Spacing eats up the extra \n's
    String spacing = "";
    //Asks user for ID
    System.out.println("Enter the ID of the Affiliate you wish to Delete:");
    int id = sin.nextInt();
    spacing = sin.nextLine();
    //Deletes the information of the affiliate with the corresponding id
    allAffiliates.remove(id);
  }
  //Main Method
  /** Main method
   * @param args An array of strings
   */
  public static void main(String[] args) {
    AffiliateDriver ad = new AffiliateDriver();
    int num2 = 0;

    //Do-While Loop to run the program for as long as the user wants to
    do {
      //Prints the menu and asks for user's input
      num2 = ad.printMenu();
      switch (num2) {
        case 1:
          //Creates a record
          ad.createRecord();
          break;
        case 2:
          //Prints a record
          ad.printRecord();
          break;
        case 3:
          //Lists all records
          ad.listAllRecords();
          break;
        case 4:
          //Deletes a record
          ad.deleteRecord();
          break;
        default:
          System.out.println("Exiting Program");
      }
    } while (num2 == 1 || num2 == 2 || num2 == 3 || num2 == 4);
  }
}
