package notes;

/**
 *
 * @author yasiro01
 */
public class Employee {
  private String name;
  private String ssn;
  private double salary;
  private double rate;
  private double hours;
  private boolean isSalaried;

  public Employee(String name, String ssn, double salary, double rate, double hours, boolean isSalaried) {
    this.name = name;
    this.ssn = ssn;
    this.isSalaried = isSalaried;
    if (isSalaried) {
      this.salary = salary;
      this.rate = 0;
      this.hours = 0;
    } else {
      this.salary = 0;
      this.rate = rate;
      this.hours = hours;
    }
  }
  

}
