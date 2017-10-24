/*
Why learn Java
==============

Java is one of the most popular programming languages in the world, commonly used in big business projects, on the web (servlets and JSP), and in mobile development (Android). It has a C-like syntax and a solid object model that makes it fairly easy to move from Java to other modern languages like C++ and C#.

Packages
========

Java source files are usually grouped together into packages. The name of the package is declared in the beginning of a file.

*/
package notes;
/*
Import
======

You can extend Java core functionality by importing additional modules. These modules can be part of the `Java core API <https://docs.oracle.com/javase/8/docs/api/>` or come from third-party vendors.

*/
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;
/*
Classes and Files
=================

Every Java program must be in a class. A class must reside in a file with the same name. For example, class HelloWorld must be in a file HelloWorld.java

*/
/**
 * Java basics class
 * @author Roman Yasinovskyy
 * @version 1.0.0
 */
public class JavaBasics {
  /*
  An application must have a main function.
  */
  /**
   * This is the main function that can take parameters from command line
   * @param args optional command line arguments
   */
  public static void main(String[] args) {
    /*
    Java Basics
    ===========
    
    Console output
    --------------
    
    Java programmer must specify the destination of the print statement. It could be the default system output (System.out usually means display), an error stream (System.err), or a file. print() prints a specified string while println() also adds a new line symbol (\r or \n) after the output.
    */
    System.out.println("\n# Java Basics");
    System.out.println("\n## Console output");
    divider();
    System.out.println("Hello World");
    System.out.print("This ");
    System.out.print("is ");
    System.out.print("one ");
    System.out.print("line");
    /* 
    println without parameters prints an empty line.
    */
    System.out.println();
    /*
    printf() allows a programmer to format an output string and pass parameters (strings, numbers, characters) to replace the placeholders. You can also use special symbols like %n for a new line.
    */
    System.out.printf("Hello%nWorld%n");
    /*
    You can specify the width (eg. %10s) and alignment (right by default, left if %-s is specified) of the formatted output.
    */
    System.out.printf("%10s%n", "Hello");
    System.out.printf("%-10s%s%n", "Hello", "World");
    System.out.printf("%-10s%5d%n", "Hello", 2017);
    /*
    Console input
    -------------
    
    You can use a Scanner object to read input from the default system input device (System.in usually means keyboard) or a file. In the following example keyboard is an object of type Scanner. this object is created by invoking the constructor of class Scanner with System.in as a parameter.
    */
    System.out.println("\n## Console input");
    divider();
    Scanner keyboard = new Scanner(System.in);
    String fullName = "";
    System.out.printf("Enter your full name%n");
//    fullName = keyboard.nextLine();  // Uncomment this line to read input from the keyboard.
    System.out.printf("Your name is %s%n", fullName);
    /*
    Data types
    ==========
    
    Java is a statically typed language and you need to a data type when declaring a variable. Data type defines range of values and operations on variables. Most data types in Java are objects, but some are primitive (non-objects) for efficiency. Integers, floating-point numbers, individual characters, and boolean values are primitive data types in Java.
    
    Primitive numbers
    -----------------
    
    There are four different types for integers (different size in memory and range of possible values) and two types for floating-point numbers.
    */
    System.out.println("\n## Data types");
    divider();
    System.out.println("\n### Primitive");
    divider();
    System.out.printf("%-10s%15s%30s%30s%n", "Type", "Size (bits)", "Min value", "Max value");
    System.out.printf("%-10s%15s%30s%30s%n", Byte.TYPE, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
    System.out.printf("%-10s%15s%30s%30s%n", Short.TYPE, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
    System.out.printf("%-10s%15s%30s%30s%n", Integer.TYPE, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
    System.out.printf("%-10s%15s%30s%30s%n", Long.TYPE, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
    System.out.printf("%-10s%15s%30s%30s%n", Float.TYPE, Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
    System.out.printf("%-10s%15s%30s%30s%n", Double.TYPE, Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
    /* byte is used for small integer values. the following assignment is invalid */
    //byte x = 252;
    /*
    Each primitive data type has a wrapper class. Conversion between such objects and their primitives is done automatically (autoboxing/autounboxing), so the following statements are identical for most intents and purposes.
    */
    int number = 10;
    Integer numberObj = 10;
    System.out.println(number);
    System.out.println(numberObj);
    /*
    Other primitime data types
    --------------------------
    
    Use char for individual characters. Unlike Python, Jave discriminates between single and double quotes. Use single quotes (') around single characters and double quotes (") around strings.
    Use boolean values as simple flags or in logical expressions.
    */
    boolean isFound = false;
    System.out.println(isFound);
    char letter = 'L';
    System.out.println(letter);
    /*
    Java strings
    ============
    
    Java strings are objects, but their declaration and initialization is similar to primitive data types for the sake of time-saving. Strings are collections of characters (of type char) and you can retrieve individual letters from a word.
    */
    System.out.println("\n### Strings");
    divider();
    String word = "Luther";
    System.out.println(word);
    System.out.println(word.charAt(0));
    System.out.println(word.length());
    System.out.println(word.concat(" College"));
    System.out.println(word + " College");
    /*
    Basic operations
    ================
    
    Be carafull when mixing varibles of different data types in the same expression or the results may surprise you. For example, the result of an operation that involves two integers is also an integer (which is not much of a surprise, actually).
    */
    System.out.println("\n## Basic Operations");
    int five = 5;
    System.out.println(five);
    System.out.println(1/five);
    System.out.println(1.0/five);
    /*
    When dealing with strings, plus sign (+) means concatenation and Java uses implicit conversion to a String. Use parentheses to specify the order of operations and avoid ambiguity.
    */
    System.out.println("Implicit conversion to String");
    System.out.println("The value of five is " + five);
    System.out.println("The value of five + 1 is " + five + 1);
    System.out.println("The value of five + 1 is " + (five + 1));
    System.out.printf("The value of five is %d%n", five);
    System.out.printf("The value of five + 1 is %d%n", five + 1);
    /*
    Like many other C-like languages, Java uses simple increment (add 1) and decrement (subtract 1) operations. It's highly recommended to use those operators outside of more complex expressions to avoid surprising results and unexpected behaviour of your code. Specifically, note the difference between a pre-increment (++a) and post-increment (a++). The value of a variable will be changed in both cases, but the old or the new one may be used. In order to avoid confusion, put simple increment/decrement operation on a separate line.
    */
    System.out.println("Simple increment and decrement");
    System.out.printf("five = %d%n", five);
    five++;
    System.out.printf("five++ results in %d%n", five);
    ++five;
    System.out.printf("++five results in %d%n", five);
    five--;
    System.out.printf("five-- results in %d%n", five);
    --five;
    System.out.printf("--five results in %d%n", five);
    System.out.printf("Mind the position!%n");
    System.out.printf("five is %d%n", five);
    System.out.printf("five++ is %d%n", five++);
    System.out.printf("++five is %d%n", ++five);
    System.out.printf("five is %d%n", five);
    System.out.println("Simple increment/decrement works for other numeric data types as well");
    double float_to_increment = 2.52;
    System.out.println(float_to_increment);
    float_to_increment++;
    System.out.println(float_to_increment);
    System.out.println("Characters");
    char oneSymbol = 'A';
    System.out.println(oneSymbol);
    System.out.println(oneSymbol + "5");
    oneSymbol++;
    System.out.println(oneSymbol);
    for (int i = 32; i < 127; i++) {
      System.out.printf("%c ", i);
    }
    System.out.println();
    /*
    Conditions
    ==========
    
    Conditional statement in Java are similar to Python's but you have to remember the syntax. Conditions (logical expressions) are placed inside parentheses, blocks are marked with curly braces, rather than indentation, there is else if instead of elif.
    */
    System.out.println("\n## Conditions");
    divider();
    /* Same as java.util.Random rnd = new java.util.Random(); */
    Random rnd = new Random();
    rnd.setSeed(252);
    int x = rnd.nextInt(100);
    System.out.println("\n## if...else-if...else");
    if (x > 80) {
      System.out.printf("%d is a large number%n", x);
    } else if (x < 20) {
      System.out.printf("%d is a small number%n", x);
    } else {
      System.out.printf("%d is just fine%n", x);
    }
    /* Condition must be boolean */
    // The following line is invalid
    //if (1) System.out.println("one!");
    /*
    There is no switch statement in Python but it can be very useful when chacking for a variety of similar values. It's highly recommended to put break statement inside every case and have a default case.
    */
    System.out.println("\n### Switch");
    divider();
    int grade = rnd.nextInt(5);
    System.out.println("The score is " + grade);
    switch (grade) {
      case 1: 
        System.out.println("one");
        break;
      case 2:
        System.out.println("two");
        break;
      case 3:
        System.out.println("three");
        break;
      case 4:
        System.out.println("four");
        break;
      default:
        System.out.println("Huh?");
        break;
    }
    /*
    Loops
    =====
    
    There are three types of loops in Java: while, do..while, and for. while and for loops are similar to Python's, do..while is special because it ensures the loop body will be executed at least once.
    */
    System.out.println("\n## Loops");
    divider();
    /*
    while loop
    ----------
    
    Check the condition and execute the loop body if the condition is True. Repeat the process. Usually the sentinel us initialized outside of the loop and changes inside the loop body.
    */
    System.out.println("\n### while");
    divider();
    int countDown = 10;
    while (countDown > 0) {
      System.out.println(countDown);
      countDown = countDown - 1;
    }
    /*
    do..while loop
    ----------
    
    Execute the loop body, then check if the the condition is True. Repeat until condition becomes False.
    */
    System.out.println("\n### do..while");
    divider();
    do {
      System.out.println(countDown);
      countDown = countDown + 1;
    } while (countDown < 10);
    /*
    for loop
    --------
    
    Usually used as a conter-controlled loop and similar to Python's for i in range(n). Any part (or all three) of the expression (initialization; check condition; update) can be ommitted.
    */
    System.out.println("\n### for");
    divider();
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }
    /*
    Functions
    =========
    
    Like many other languages, Java allows a programmer to define custom functions. You need to specify a function's return data type (or void if a function is not supposed to return any value) and types of paramenters it takes (could be empty).
    */
    System.out.println("\n## Functions");
    divider();
    System.out.println("\n### void functions");
    divider();
    printHello();
    String name = "Student";
    printHelloByName(name);
    String greeting = generatePersonalGreeting(name);
    System.out.println(greeting);
    /*
    Arrays
    ======
    
    Java arrays are similar to Python lists, but they are homogeneous (all items must be of the same type) and do not grow (you have to specify array size during its initialization). Array values can be specified during the initialization (use curly braces and comma-separated values) or later, when iterating over an array.
    */
    System.out.println("\n## Arrays");
    divider();
    int array_size = 10;
    int[] numbers = new int[array_size];
    System.out.printf("Size of the array is %d%n", numbers.length);
    System.out.println("Parallel arrays");
    String[] names = {"Alice", "Bob", "Charlie"};
    char[] grades = {'A', 'C', 'B'};
    System.out.printf("%-10s%5s%n", "Name", "Grade");
    for (int i = 0; i < names.length; i++) {
      System.out.printf("%-10s%5c%n", names[i], grades[i]);
    }
    int[] randomNumbers = new int[5];
    for (int i = 0; i < randomNumbers.length; i++) {
      randomNumbers[i] = rnd.nextInt(10);
      System.out.printf("%d ", randomNumbers[i]);
    }
    System.out.println();
    /*
    Exceptions
    ==========
    
    It is important to be catch exceptions and process errors during the program execution. In a simple case, use try..catch to try some code that may cause a problem and catch the exception. The catch block only executes if the error actually occurs, finally block is executed every time.
    */
    System.out.println("\n## Exceptions");
    divider();
    int zero = 0;
    try {
      System.out.println(1/zero);
    } catch (ArithmeticException a_exc) {
      System.out.printf("ERROR: %s%n", a_exc.getMessage());
    } finally {
      System.out.println("The show must go on!");
    }
    System.out.println("---Over and out---");
  }
  /**
   * print a divider using dashes
   */
  public static void divider() {
    System.out.println("---------------");
  }
  /**
   * print Hello!
   */
  public static void printHello() {
    System.out.println("Hello!");
  }

  private static void printHelloByName(String name) {
    System.out.println("Hello " + name);
  }

  private static String generatePersonalGreeting(String name) {
    Calendar now = Calendar.getInstance();
    String partOfDay;
    int hour = now.get(Calendar.HOUR_OF_DAY);
    if (hour >= 6 && hour < 12) {
      partOfDay = "morning";
    } else if (hour >= 12 && hour < 18) {
      partOfDay = "afternoon";
    } else if (hour >= 18 && hour < 22) {
      partOfDay = "evening";
    } else {
      partOfDay = "night";
    }
    return String.format("Good %s, %s!%n", partOfDay, name);
  }
}
