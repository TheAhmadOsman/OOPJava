package exercise5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * Class Roster
 * Task 10: Create a class Roster that contains a private member ArrayList<Student> studentList (reuse class Student from task 9).
 * Its constructor must take the name of a file as a parameter, read data from the file (sample roster.csv is provided, another file of a similar structure may be used for grading), 
 * create an object of type Student based on the content of a line, and add that object to the ArrayList studentList.
 * Implement method printRoster that prints all the elements of the studentList.
 * @author Ahmad M. Osman - Original template by Dr. Roman Yasinovskyy
 * @assignment Week 4: Exercise 5
 * 
 */
public class Roster {
    private ArrayList<Student> studentList = new ArrayList();

    public Roster(String fileName) throws IOException{
        try {
            BufferedReader inputFile = new BufferedReader(new FileReader(fileName));
            Scanner line = new Scanner(inputFile);
            while(line.hasNextLine()!= false){
                String lineStudent = line.nextLine();
                String[] splitted = lineStudent.split(",");
                Student thisStudent;
                thisStudent = new Student(splitted[0], splitted[1], Double.parseDouble(splitted[2]));
                studentList.add(thisStudent);
            }
        } catch(FileNotFoundException exc) {
            Logger.getLogger(Roster.class.getName()).log(Level.SEVERE, null, exc);
        }
    }
    
    public void printRoster() {
        for(Student student: studentList){
            System.out.println(student);
        }
    }
}