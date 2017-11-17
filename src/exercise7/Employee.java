package exercise7;

/**
 *
 * @author Ahmad M. Osman - Exercise 7
 * I made sure to follow the UML diagram when it comes down the the access of the data members and methods in the classes.
 * Also, I only included getters and setters as shown in the UML diagram - not doing all of them as in the assignment on Katie.
 * 
**/

public class Employee {
    protected String name;
    protected String ssn;
    protected double netPay;

    public Employee(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public String getSSN() {
        return ssn;
    }

    protected double getNetPay() {
        return netPay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSSN(String ssn) {
        this.ssn = ssn;
    }
    
    protected void printWeeklyCheck() {
        System.out.print("Employee " + this.name + ", SSN: " + this.ssn);
    }
}