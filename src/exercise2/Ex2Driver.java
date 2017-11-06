package exercise2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Ahmad M. Osman - Original template by Dr. Roman
 */
public class Ex2Driver {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numberArr = new int[10];
    for (int i = 0; i < 10; i++) {
      numberArr[i] = rnd.nextInt(100);
    }
    ArrayList<Integer> numberLst = new ArrayList();
    for (int i = 0; i < 10; i++) {
      numberLst.add(rnd.nextInt(100));
    }
    task1(3);
    System.out.println(task2(numberArr, 90));
    System.out.println(task3(numberArr, 75));
    task4(numberArr);
    task5(numberArr);
    task6();
    task7();
    System.out.println(task8(numberLst, 75));
    // Changed the next two calls as calling task10(task9()) caused printing task 9 output for an extra time
    int[][] matrix = task9();
    task10(matrix);
  }

  /**
   * TODO: Task 1: Define and call a function that takes a number (n) as a parameter and prints the result of coin flips 
   * ("Heads" or "Tails" with equal probability) until there are n "Heads" in a row.
   * @param n
   */
  public static void task1(int n) {
      System.out.println("---Task 1---");
      headsOrTails(n);
  }
  
  public static void headsOrTails(int n) {
      
      // Let us define Head = 0 and Tail = 1
      // I assume equal probability means getting a random variable between 0 and 1 -> nextInt(2).
      Random coin = new Random();
      coin.setSeed(252);
      
      int strike = 0;
      boolean tail = false;
      
      while(strike < n)
      {
          int headOrTail = coin.nextInt(2);
          if(headOrTail == 0)
          {
              if(tail == true)
              {
                  strike = 0;
                  tail = false;
              }
              strike += 1;
              System.out.println("Head");
              continue;
          }
          if (headOrTail == 1)
          {
              if (strike >= 0 && tail == false)
              {
                tail = true;
                strike = 0;
              }
              strike += 1;
              System.out.println("Tail");
          }
      }
      
  }
  
  /**
   * TODO: Task 2: Define a function that takes an array of integers and a number as parameters and 
   * returns boolean True if the number provided is larger than every element of the array, False otherwise.
   * @param arr
   * @param n
   * @return 
   */
  public static boolean task2(int[] arr, int n) {
      System.out.println();
      System.out.println("---Task 2---");
      
      return arrayNumberComp(arr, n);
  }
  
  public static boolean arrayNumberComp(int[] arr, int n){
      for(int number: arr){
          if(n < number)
              return false;
      }
      return true;
  }
  /**
   * TODO: Task 3: Write a function that takes an array of integers and a threshold and prints how many values are below the threshold.
   * @param arr
   * @param threshold
   * @return 
   */
  public static int task3(int[] arr, int threshold) {
      System.out.println();
      System.out.println("---Task 3---");
      
      return arrayThreshold(arr, threshold);
  }
  
  public static int arrayThreshold(int[] arr, int threshold){
      int thresholdCount = 0;
      for(int number: arr){
          if(number < threshold)
              thresholdCount += 1;
      }
      return thresholdCount;
  }
  
  /**
   * TODO: Task 4: Write a function that takes an array of integers as a parameter, 
   * finds the difference between 100 and the largest element of the array 
   * and adds this difference to every element in the array. 
   * (Note: after this function call the largest value in the array must be 100.)
   * @param arr
   */
  public static void task4(int[] arr) {
      System.out.println();
      System.out.println("---Task 4---");
      arrayLargestDiff(arr);
  }
  
  public static void arrayLargestDiff(int[] arr) {
      int largest = 0;
      int count = 0;
      int largestAt = 0;
      for(int number: arr){
          if(number > largest){
              largest = number;
              largestAt = count;
          }
          count += 1;
      }
      
      int diff = 100 - largest;
      
      for(int i = 0; i < arr.length; ++i){
          arr[i] = arr[i] + diff;
      }
      
      System.out.println("Calling the largest value in the array at index " + largestAt + " = " + arr[largestAt]);
  }
  
  /**
   * TODO: Task 5: Write a function that takes an array of integers as a parameter and
   * assuming the values are scores, prints number of students with 'A', 'B', 'C', 'D' and 'F'.
   * @param arr
   */
  public static void task5(int[] arr) {
      System.out.println();
      System.out.println("---Task 5---");
      gradesCount(arr);
  }
  
  public static void gradesCount(int[] arr) {
      // Assume 0 = A, 1 = B, 2 = C, 3 = D, and 4 = F.
      int[] count = new int[5];
      for(int grade: arr){
          if(grade >= 90)
              count[0] += 1;
          else if(grade >= 80)
              count[1] += 1;
          else if(grade >= 70)
              count[2] += 1;
          else if(grade >= 60)
              count[3] += 1;
          else
              count[4] += 1;
      }
      // The character before 'A' is '@' in the ASCII table
      char letterGrade = '@';
      for(int i = 0; i < count.length; ++i){
          letterGrade += 1;
          System.out.println("Number of students with " + letterGrade + "'s: " + count[i] + "!");
      }
  }
  
  /**
   * TODO: Task 6: Create an ArrayList of double values and ask a user to start entering numbers. 
   * Keep asking and adding numbers to the ArrayList until the user enters 0, then stop and print all the values in the ArrayList. 
   * Use function add() to add a number to an ArrayList.
   */
  public static void task6() {
      System.out.println();
      System.out.println("---Task 6---");
      ArrayList<Double> arr = new ArrayList();
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter a number(0 to stop): ");
      double n = keyboard.nextDouble();
      
      while(n != 0){
          arr.add(n);
          System.out.print("Enter a number(0 to stop): ");
          n = keyboard.nextDouble();
      }
      if(arr.size() > 0)
        System.out.println("Printing out the numbers in the Array List of size " + arr.size() + ":");
      for(int i = 0; i < arr.size(); ++i){
          System.out.println("\t" + arr.get(i));
      }
  }
  /**
   * TODO: Task 7: Create an ArrayList of integer values of size 10 and initialize each element of the ArrayList to a random number between 50 and 100.
   */
  public static void task7() {
      System.out.println();
      System.out.println("---Task 7---");
      int ALcapacity = 10;
      ArrayList<Integer> arr = new ArrayList(ALcapacity);
      
      Random rnd = new Random();
      rnd.setSeed(252);
      
      for(int i = 0; i < ALcapacity; ++i){
          // Assuming between 50 and 100 "inclusive".
          arr.add(i, (rnd.nextInt(51) + 50));
      }
      
      System.out.println("The Array List Values: " + arr);
  }
  /**
   * TODO: Task 8: Define a function that takes an ArrayList of integer values and a threshold as parameters 
   * and returns the number of values in the ArrayList below a threshold. 
   * You may use the ArrayList created at the previous step.
   * @param arrLst
   * @param threshold
   * @return 
   */
  public static int task8(ArrayList<Integer> arrLst, int threshold) {
      System.out.println();
      System.out.println("---Task 8---");
      
      return arrayListThreshold(arrLst, threshold);
  }
  
  public static int arrayListThreshold(ArrayList<Integer> arrLst, int threshold){
      int thresholdCount = 0;
      for(int number: arrLst){
          if(number < threshold)
              thresholdCount += 1;
      }
      return thresholdCount;
  }
  /**
   * TODO: Task 9: Generate a 2-dimensional array of size 10x10. 
   * Initialize values in the array to the values in the multiplication table of size 10. 
   * (e.g. values in the intersections must start with 1 (1x1) and go all the way up to 100). 
   * Print the array and return it.
   * @return 
   */
  public static int[][] task9() {
      System.out.println();
      System.out.println("---Task 9---");
      
      int[][] multiplicationTable = new int[10][10];
      for(int i = 1; i <= 10; ++i){
          for(int j = 1; j <= 10; ++j){
              multiplicationTable[i-1][j-1] = i * j;
              System.out.printf("%8d", multiplicationTable[i-1][j-1]);
          }
          System.out.printf("%n");
      }
      
      return multiplicationTable;
  }
  /**
   * TODO: Task 10: Calculate and print the sum of values in each row and each column of the matrix generated at the previous step.
   * @param matrix
   */
  public static void task10(int[][] matrix) {
      System.out.println();
      System.out.println("---Task 10---");
      int[] rowSum = new int[10];
      int[] columnSum = new int[10];
      for(int i = 0; i < matrix.length; ++i) {
          for(int j = 0; j < matrix[i].length; ++j) {
              rowSum[i] += matrix[i][0];
              columnSum[j] += matrix[i][j];
          }
      }
      for(int i = 0; i < rowSum.length; ++i){
          System.out.println("The sum of row number " + (i+1) + " is " + rowSum[i]);
      }
      for(int i = 0; i < columnSum.length; ++i){
          System.out.println("The sum of column number " + (i+1) + " is " + columnSum[i]);
      }
      System.out.println();
  }
}