package exercise1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author yasiro01
 */
public class Ex1Driver {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numbers = new int[10];
    for (int i = 0; i < 10; i++) {
      numbers[i] = rnd.nextInt(10);
    }
    task1();
    task2();
    task3();
    task4();
    task5();
    // Added this because you had it ran two times in your output file, Dr. Roman
    task5();
    task6();
    task7();
    // Added this because you had it ran two times in your output file, Dr. Roman
    task7();
    task8(numbers);
    task9();
    // Added this because you had it ran two times in your output file, Dr. Roman
    task9();
    task10();
  }

  /**
   * TODO: Task 1: Print "Hello World" to the default system output
   */
  public static void task1() {
        System.out.println("---Task 1---");
        System.out.println("Hello World");
        System.out.println();
  }
  /**
   * TODO: Task 2: Print all numbers between 1 and 100 (inclusive) replacing all multiples of 3 with "foo", multiples of 5 with "bar", multiples of 3 and 5 with "huh"
   */
  public static void task2() {
        System.out.println("---Task 2---");
        for(int i = 1; i <= 100; ++i)
        {
            if(i % 3 == 0 && i % 5 == 0)
                System.out.println("huh");
            else if(i % 3 == 0)
                System.out.println("foo");
            else if(i % 5 == 0)
                System.out.println("bar");
            else
                System.out.println(i);
        }
        System.out.println();
  }
  /**
   * TODO: Task 3: Calculate and print the sum of all multiples of 7 between 1 and 100 (inclusive)
   */
  public static void task3() {
        System.out.println("---Task 3---");
        int sumOfMultiplesOf7 = 0;
        for(int i = 1; i <= 100; ++i)
        {
            if(i % 7 == 0)
                sumOfMultiplesOf7 += i;
        }
        System.out.println("The sum of all multiples of 7 between 1 and 100 is " + sumOfMultiplesOf7);
        System.out.println();
  }
  /**
   * TODO: Task 4: Calculate and print sum and product of all numbers between 1 and 20 (inclusive)
   */
  public static void task4() {
    System.out.println("---Task 4---");

    int sum = 0;
    long product = 1;
    
    for(int i = 1; i <= 20; ++i)
    {
        sum += i;
        product *= i;
    }
    System.out.println("The sum of all numbers between 1 and 20 is " + sum);
    System.out.println("The product of all numbers between 1 and 20 is " + product);    
    System.out.println();
  }
  /**
   * TODO: Task 5: Ask a user to enter their full name and print the initials (ie John Q Doe should yield JQD)
   */
  public static void task5() {
    System.out.println("---Task 5---");
    
    Scanner keyboard = new Scanner(System.in);
    String fullName = "";
    System.out.println("Please enter your full name");
    fullName = keyboard.nextLine();
    
    String[] names = fullName.split(" ");
    
    String initials = "";
    
    for(int i = 0; i < names.length; ++i)
    {
        initials += names[i].charAt(0);
    }
    
    System.out.println("Your initials are " + initials);
    System.out.println();
  }
  /**
   * TODO: Task 6: Create an array of 10 elements and initiate each element in it to the cube of its index (Do it in a loop, not during declaration)
   */
  public static void task6() {
    System.out.println("---Task 6---");
    int array_size = 10;
    int[] numbers = new int[array_size];
    
    for(int i = 0; i < array_size; ++i)
    {
        numbers[i] = i * i * i;
        System.out.print(numbers[i] + " ");
    }
    System.out.println();
    System.out.println();
  }
  /**
   * TODO: Task 7: Create an array of 100 random integers between 1 and 100, ask the user for an integer and tell if that number is in the array
   */
  public static void task7() {
    System.out.println("---Task 7---");

    Random rnd = new Random();
    rnd.setSeed(252);
    
    int array_size = 100;
    int[] numbers = new int[array_size];
    
    for (int i = 0; i < array_size; i++) 
    {
      numbers[i] = rnd.nextInt(100) + 1;
    }
    
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a number");
    int userNum = keyboard.nextInt();
    
    boolean contains = IntStream.of(numbers).anyMatch(x -> x == userNum);
    
    if(contains == false)
        System.out.println(userNum + " was NOT found in the array");
    else
        System.out.println(userNum + " was found in the array");
    
    System.out.println();
  }
  /**
   * TODO: Task 8: Take an array of integers as a parameter, calculate, print, and return the sum of its elements
   * @param numbers
   * @return 
   */
  public static int task8(int[] numbers) {
    System.out.println("---Task 8---");
    int sum = 0;
    for(int i = 0; i < numbers.length; ++i)
    {
        sum += numbers[i];
    }
    System.out.println("Sum of all items in " + Arrays.toString(numbers) + " is " + sum);
    System.out.println();
    return sum;
}
  /**
   * TODO: Task 9: Ask a user to enter a word and write a function that tells if letters of a word are ordered (ie. "buy" would return true, while "bye" - false).
   * @return 
   */
  public static boolean task9() {
    System.out.println("---Task 9---");
    
    Scanner keyboard = new Scanner(System.in);
    String word = "";
    System.out.println("Please enter a word");
    word = keyboard.nextLine();
        
    for(int i = 0; i < word.length() - 1; ++i)
    {
        if(word.charAt(i) > word.charAt(i + 1))
        {
            System.out.println("Letters of " + word + " are NOT in in order");
            System.out.println();
            return false;
        }
    }
    
    System.out.println("Letters of " + word + " are in in order");
    System.out.println();
    return true;
}
  /**
   * TODO: Task 10: Implement sieve of Eratosthenes and print all prime numbers between 1 and 100
   */
  
  // Dr. Roman, I noticed that the the output file had a wrong prime number in it (4). 4 Is not a pirme number.
  public static void task10() {
    System.out.println("---Task 10---");
    System.out.println("Prime numbers between 1 and 100");
    
    String prime = "";
    
    for(int i = 1; i <= 100; i++)
    {
        int count = 0;
        for(int j = i; j >= 1; j--)
        {
            if(i % j == 0)
                count += 1;
        }
        if(count == 2)
            prime = prime + i + " ";
    }
    System.out.println(prime);
    System.out.println();
  }

}
