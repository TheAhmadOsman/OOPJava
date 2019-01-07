package exercise7;

/**
 *
 * @author Ahmad M. Osman - Exercise 7
 * I made sure to follow the UML diagram when it comes down the the access of the data members and methods in the classes.
 * Also, I only included getters and setters as shown in the UML diagram - not doing all of them as in the assignment on Katie.
 * 
**/

public class SalariedEmployee extends Employee{
    private double salary;

    public SalariedEmployee(double salary, String name, String ssn) {
        super(name, ssn);
        this.salary = salary;
        //This one is taxes - not so lucky..
        this.netPay = salary - (0.05 * salary);
    }

    public double getSalary() {
        return salary;
    }

    public double getNetPay() {
        return netPay;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void printWeeklyCheck(){
        super.printWeeklyCheck();
        System.out.println(" gets " + (this.salary/52) + " USD per week!");
    }
}