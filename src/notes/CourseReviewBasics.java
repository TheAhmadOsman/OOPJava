package notes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Review of quizzes 1, 2, and 3
 * @author yasiro01
 */
public class CourseReviewBasics {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.println("---Quiz 1---");
    System.out.println("Question 1");
    kb.nextLine();
    System.out.println("\\\"CS253\"//");
    System.out.println("Question 3");
    kb.nextLine();
    System.out.println("error");
    int x3 = 5;
//    if (x3 = 3) {
//      System.out.println("October");
//    } else {
//      System.out.println("NOT October");
//    }
    System.out.println("Question 5");
    kb.nextLine();
    int number = 2;
    boolean done = false;
    while (!done) {
      number = number * 2;
      if (number > 12)
        done = true;
      System.out.print(number + " ");
    }
    System.out.println("");
    System.out.println("Question 7");
    kb.nextLine();
    mystery1("hello");
    System.out.println("");
    kb.nextLine();
    System.out.println("---Quiz 2---");
    System.out.println("Question 4");
    kb.nextLine();
    boolean[] arr4 = new boolean[5];
    for (int i = 0; i < 5; i++) {
      arr4[i] = i % 2 == 0;
      System.out.print(arr4[i] + " ");
    }
    System.out.println("");
    System.out.println("Question 6");
    kb.nextLine();
    String[] arr6 = {"Yoda", "Yoda", "Yoda", "Yoda", "Yoda"};
    for (int i = 0; i < arr6.length; i++) {
      System.out.print(arr6[i] + " ");
      i++;
    }
    System.out.println("");
    kb.nextLine();
    System.out.println("Question 8");
    kb.nextLine();
    char letter8 = 'J';
    while (letter8 < 'A') {
      System.out.print(letter8);
      ++letter8;
    }
    System.out.println("");
    System.out.println("Question 10");
    kb.nextLine();
    int test10 = 2017;
    if (test10 % 2 == 0)
      System.out.print("A");
    else
      System.out.print("B");
      System.out.print("C");
    System.out.println("");
    kb.nextLine();
    System.out.println("---Quiz 3---");
    System.out.println("Question 4");
    kb.nextLine();
    ArrayList<String> arrLst4 = new ArrayList(10);
    System.out.println(arrLst4.size());
    System.out.println("Question 5");
    kb.nextLine();
//    ArrayList<int> arrLst5 = new ArrayList();
//    System.out.println(arrLst5.size());
    System.out.println("Question 6");
    kb.nextLine();
    ArrayList<String> arrLst6 = new ArrayList();
    arrLst6.add("Alice");
    arrLst6.add("Bob");
    arrLst6.add("Charlie");
    arrLst6.remove("Bob");
    System.out.println(arrLst6.indexOf("Bob"));
    System.out.println("Question 7");
    kb.nextLine();
    HashMap<String, Integer> map7 = new HashMap<>();
    map7.put("Alice", Integer.SIZE);
    System.out.println(map7.get("Alice"));
    System.out.println("Question 8");
    kb.nextLine();
    HashMap<Integer, Character> map8 = new HashMap<>();
    for (Character c = 'A'; c <= 'Z'; c++) {
      map8.put(new Integer(c), c);
    }
    System.out.println(map8.get(81));
    System.out.println("Question 9");
    kb.nextLine();
    HashSet<String> set9 = new HashSet<>();
    set9.add("Alice");
    set9.add("Bob");
    set9.add("Alice");
    for(String item: set9){
      System.out.print(item + " ");
    }
    System.out.println("");
    System.out.println("Question 10");
    kb.nextLine();
    HashSet<String> set10 = new HashSet(2);
    set10.add("Alice");
    set10.add("Bob");
    set10.add("Charlie");
    set10.add("Diana");
    set10.add("Bob");
    System.out.println(set10.size());
  }
  
  public static void mystery1(String s) {
    for (int i = 0; i < s.length()/2; i++) {
      System.out.printf("%c%c", s.charAt(i), s.charAt(s.length() - i - 1));
    } 
  }
}
