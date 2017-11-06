package exercise4;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 * @author Ahmad M. Osman - Original template by Dr. Roman
 * @assignment Week 3: Exercise 4
 * 
 */
public class Ex4Driver {
  /* Define a function that takes 1 integer as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
    // This function returns the Integer passed to it
    public Integer task1(Integer n){
        return n;
    }
  /* Define a function that takes 1 string as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
    // This function returns the length of the string
    public Integer task2(String s){
        return s.length();
    }
  /* Define a function that takes 1 character as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
    // This function returns the ASCII code of the character
    public Integer task3(Character c){
        return (int) c;
    }
 /* Define a function that takes 1 string as a parameter and returns a character. Write 2 unit tests to verify the function validity. */
    // This function return the first character of a string
    public Character task4(String s) {
        return s.charAt(0);
    }
  /* Define a function that takes 2 integers as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
    // This function returns the sum of the two integers passed as a parameter
    public Integer task5(Integer i, Integer j){
        return (i + j);
    }
  /* Define a function that takes a string and an integer as parameters and returns a Character. Write 2 unit tests to verify the function validity. */
    // This function returns the character at index 'n' in string 's'
    public Character task6(String s, Integer n){
        return s.charAt(n);
    }
  /* Define a function that takes an array of integers as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
    // This function returns the length of the array 'arr'
    public Integer task7(Integer[] arr){
        return arr.length;
    }
  /* Define a function that takes an array of integers and an integer as parameters and returns a boolean. Write 2 unit tests to verify the function validity. */
    // This function returns true if the length of the array 'arr' is equal to 'n' and returns false otherwise
    public Boolean task8(Integer[] arr, Integer n){
        return arr.length == n;
    }
  /* Define a function that takes an ArrayList of Strings as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
    // This function returns the length of the ArrayList
    public Integer task9(ArrayList<String> arrlst) {
        return arrlst.size();
    }
  /* Define a function that takes a HashMap (exact details are up to you) as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
    // This function returns the size of the HashMap
    public Integer task10(HashMap<Integer, String> map){
        return map.size();
    }
}