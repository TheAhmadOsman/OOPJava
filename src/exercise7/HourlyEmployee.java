package exercise7;

/**
 *
 * @author Ahmad M. Osman - Exercise 7
 * I made sure to follow the UML diagram when it comes down the the access of the data members and methods in the classes.
 * Also, I only included getters and setters as shown in the UML diagram - not doing all of them as in the assignment on Katie.
 * 
**/

public class HourlyEmployee extends Employee {
    private double wageRate;
    private double hours;

    public HourlyEmployee(double wageRate, double hours, String name, String ssn) {
        super(name, ssn);
        this.wageRate = wageRate;
        this.hours = hours;
        //Lets assume employee is not being taxed - lucky folk
        this.netPay = hours * wageRate * 52; 
    }

    public double getWageRate() {
        return wageRate;
    }

    public double getHours() {
        return hours;
    }

    public double getNetPay() {
        return netPay;
    }

    public void setWageRate(double wageRate) {
        this.wageRate = wageRate;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    
    public void printWeeklyCheck(){
        super.printWeeklyCheck();
        System.out.println(" gets " + (this.hours * this.wageRate) + " USD per week!");
    }
}