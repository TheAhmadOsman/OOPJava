package notes;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/**
 * This is a Javadoc, used to generate documentation HTML
 * Javadoc should be placed before a class, a method, or a field
 * Java basics class
 * @author yasiro01
 */
public class JavaBasics {
  /**
   * This is the main function that can take parameters from command line
   * @param args 
   */
  public static void main(String[] args) {
    /* Java Basics */
    System.out.println("\n# Java Basics");
    /* Console output */
    System.out.println("\n## Console output");
    divider();
    /* System.out is the default output (console/terminal) */
    System.out.println("Hello World");
    System.out.print("This ");
    System.out.print("is ");
    System.out.print("one ");
    System.out.print("line");
    /* Print an empty line */
    System.out.println();
    /* Formatted output */
    System.out.printf("Hello%nWorld%n");
    /* Specify column width */
    System.out.printf("%10s%n", "Hello");
    /* Align text */
    System.out.printf("%-10s%s%n", "Hello", "World");
    System.out.printf("%-10s%5d%n", "Hello", 2017);
    /* Console input */
    System.out.println("\n## Console input");
    divider();
    /* System.in is the default input (console/keyboard) */
    Scanner keyboard = new Scanner(System.in);
    System.out.printf("Enter your full name%n");
//    String fullName = keyboard.nextLine();
//    System.out.printf("Your name is %s%n", fullName);
    /* Java primitive data types */
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
    int number = 10;
    Integer numberObj = 10;
    System.out.println(number);
    System.out.println(numberObj);
    boolean isFound = false;
    System.out.println(isFound);
    char letter = 'L';
    System.out.println(letter);
    /* Java strings */
    System.out.println("\n### Strings");
    divider();
    String word = "Luther";
    System.out.println(word);
    System.out.println(word.charAt(0));
    System.out.println(word.length());
    System.out.println(word.concat(" College"));
    System.out.println(word + " College");
    /* Basic operations */
    System.out.println("\n## Basic Operations");
    int five = 5;
    System.out.println(five);
    System.out.println(1/five);
    System.out.println(1.0/five);
    System.out.println("Implicit conversion to String");
    System.out.println("The value of five is " + five);
    System.out.println("The value of five + 1 is " + five + 1);
    System.out.println("The value of five + 1 is " + (five + 1));
    System.out.printf("The value of five is %d%n", five);
    System.out.printf("The value of five + 1 is %d%n", five + 1);
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
    System.out.printf("Mind the position! five = %d%n", five++);
    System.out.printf("Mind the position! five = %d%n", ++five);
    System.out.println("Characters");
    char oneSymbol = 'A';
    System.out.println(oneSymbol);
    System.out.println(oneSymbol + "5");
    oneSymbol++;
    System.out.println(oneSymbol);
    for (int i = 32; i < 127; i++) {
      System.out.printf("%c%n", i);
    }
    /* Conditions */
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
    /* Switch */
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
    /* Loops */
    System.out.println("\n## Loops");
    divider();
    System.out.println("\n### while");
    divider();
    int countDown = 10;
    while (countDown > 0) {
      System.out.println(countDown);
      countDown = countDown - 1;
    }
    System.out.println("\n### do..while");
    divider();
    do {
      System.out.println(countDown);
      countDown = countDown + 1;
    } while (countDown < 10);
    System.out.println("\n### for");
    divider();
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }
    /* Functions */
    System.out.println("\n## Functions");
    divider();
    System.out.println("\n### void functions");
    divider();
    printHello();
    String name = "Student";
    printHelloByName(name);
    String greeting = generatePersonalGreeting(name);
    System.out.println(greeting);
    /* Arrays */
    System.out.println("\n## Arrays");
    divider();
    int array_size = 10;
    int[] numbers = new int[array_size];
    System.out.printf("Size of the array is %d%n", numbers.length);
    /* Exceptions */
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
