package notes;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/**
 * Use various Java collections
 * @author yasiro01
 */
public class Collections {
  public static void main(String[] args) {
    Faker person = new Faker();
    Random rnd = new Random();
    rnd.setSeed(252);
    
    int[][] matrix = new int[3][4];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        matrix[i][j] = rnd.nextInt(10);
        System.out.printf("%5s", matrix[i][j]);
      }
      System.out.println("");
    }
    
    System.out.println("\nArray");
    String[] nameArr = new String[5];
    int[] gradeArr = new int[5];
    for (int i = 0; i < nameArr.length; i++) {
      nameArr[i] = person.name().firstName();
      gradeArr[i] = 60 + rnd.nextInt(40);
    }
    System.out.printf("%-12s%5s%n", "Name", "Grade");
    for (int i = 0; i < nameArr.length; i++) {
      System.out.printf("%-12s%5d%n", nameArr[i], gradeArr[i]);
    }
    
    System.out.println("\nArrayList");
    ArrayList<String> nameLst = new ArrayList();
    ArrayList<Integer> gradeLst = new ArrayList();
    for (int i = 0; i < 5; i++) {
      nameLst.add(person.name().firstName());
      gradeLst.add(60 + rnd.nextInt(40));
    }
    System.out.printf("%-12s%5s%n", "Name", "Grade");
    for (int i = 0; i < nameLst.size(); i++) {
      System.out.printf("%-12s%5d%n", nameLst.get(i), gradeLst.get(i));
    }
    
    System.out.println("\nHashMap");
    HashMap<String, Integer> gbMap = new HashMap<>();
    for (int i = 0; i < 5; i++) {
      gbMap.put(person.name().firstName(), 60 + rnd.nextInt(40));
    }
    System.out.printf("%-12s%5s%n", "Name", "Grade");
    for(HashMap.Entry item: gbMap.entrySet()){
      System.out.printf("%-12s%5d%n", item.getKey(), item.getValue());
    }
    
    /*--------------------------------*/
    System.out.println("\nHashSet");
    HashSet<Student> gbSet = new HashSet();
    for (int i = 0; i < 5; i++) {
      Student s = new Student(person.name().firstName(), 60 + rnd.nextInt(40));
      gbSet.add(s);
    }
    for(Student item: gbSet){  
      System.out.printf("%-12s%5d%n", item.getName(), item.getGrade());
    }  
    
  }
}

class Student {
  private String name;
  private int grade;

  public Student(String nameInit, int gradeInit) {
    this.name = nameInit;
    this.grade = gradeInit;
  }
  public String getName() {
    return this.name;
  }
  public int getGrade() {
    return this.grade;
  }
}