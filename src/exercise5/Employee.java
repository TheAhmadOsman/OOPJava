package exercise5;

/**
 * 
 * Class Employee
 * Task 3: Create a class Employee with the following private data members: String firstName, String lastName, double salary, boolean fullTime. 
 * The string representation of an object of this class depends on the value of the isFullTime member. 
 * If an employee is full time, their salary is reported as annual, otherwise it's hourly.
 * @author Ahmad M. Osman - Original template by Dr. Roman Yasinovskyy
 * @assignment Week 4: Exercise 5
 * 
 */
public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private boolean fullTime;

    public Employee(String firstName, String lastName, double salary, boolean fullTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.fullTime = fullTime;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    @Override
    public String toString() {
        if(fullTime == true){
            return firstName + " " + lastName + String.format(" earns $%.2f", salary) + " annually";}
        else
            return firstName + " " + lastName + String.format(" earns $%.2f", salary) + " hourly";
    }    
}