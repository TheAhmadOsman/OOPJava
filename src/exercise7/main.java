package exercise7;

/**
 *
 * @author Ahmad M. Osman - Exercise 7
 * I made sure to follow the UML diagram when it comes down the the access of the data members and methods in the classes.
 * Also, I only included getters and setters as shown in the UML diagram - not doing all of them as in the assignment on Katie.
 * 
**/

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("First, an Employee object!");
        Employee emp = new Employee("Ahmad M. Osman", "000-00-000");
        System.out.println("We can get the following information:");
        System.out.println("    Name: " + emp.getName());
        System.out.println("    SSN: " + emp.getSSN());
        // The following two line are executable, however, that is only because my main class is part of the same package. They would not be accessible any where outside exercise7 package.
        //System.out.println("    NetPay: " + emp.getNetPay());
        //emp.printWeeklyCheck();
        
        //System.out.println("");
        System.out.println("");
        
        System.out.println("Second, an Hourly Employee object!");
        HourlyEmployee hrlyEmp = new HourlyEmployee(7.25, 13, "Matt Finix", "999-00-111");
        System.out.println("We can get the following information:");
        System.out.println("    Name: " + hrlyEmp.getName());
        System.out.println("    SSN: " + hrlyEmp.getSSN());
        System.out.println("    Wage Rate: $" + hrlyEmp.getWageRate());
        System.out.println("    Hours: " + hrlyEmp.getHours());
        System.out.println("    NetPay over the course of a year: " + hrlyEmp.getNetPay());
        hrlyEmp.printWeeklyCheck();
        
        System.out.println("");
        
        System.out.println("Third, an Salaried Employee object!");
        SalariedEmployee  slrEmp = new SalariedEmployee (150000, "Lucas Michael", "111-99-986");
        System.out.println("We can get the following information:");
        System.out.println("    Name: " + slrEmp.getName());
        System.out.println("    SSN: " + slrEmp.getSSN());
        System.out.println("    Salary: $" + slrEmp.getSalary());
        System.out.println("    NetPay after 5% taxes: " + slrEmp.getNetPay());
        slrEmp.printWeeklyCheck();
    }
    
}