package notes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author yasiro01
 */
public class GenericsNotes {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Helper helper = new Helper();
    Integer i = new Integer(252);
    System.out.println(helper.getString(i));
    Double d = new Double(2.52);
    System.out.println(helper.getString(d));
    Student2 s1 = new Student2("Alice");
    System.out.println(helper.getString(s1));
    Student2 s2 = new Student2("Bob");
    System.out.println(helper.greater(s1, s2));
    System.out.println(helper.greater(254, 253));
    Student2[] roster = {s1, s2};
    
    helper.printAllItems("A", "B", "C");
    helper.printAllItems(roster);
    String[] roster2 = {"Aardvark", "Beaver", "Cheetah"};
    helper.printAllItems(roster2);
    HashSet<String> roster3 = new HashSet();
    roster3.add("Chuck");
    roster3.add("Dave");
    helper.printAllItems2(roster3);
  }
  
}

class Helper {
  public <T> String getString(T item) {
    return "String is " + item.toString();
  }
  
//  public String getString(Double item) {
//    return item.toString();
//  }
  
  public <T extends Comparable> String greater(T item1, T item2) {
    if (item1.compareTo(item2) >= 0) {
      return item1.toString();
    } else {
      return item2.toString();
    }
  }
  
  public <T> void printAllItems(T ... list) {
    for (T item: list) {
      System.out.println(item);
    }
  }
  
  public <T> void printAllItems2(Collection<T> coll) {
    for (T item: coll) {
      System.out.println(item);
    }
  }
}

class Student2 implements Comparable {
  private String name;
  
  public Student2(String name) {
    this.name = name;
  }
  
  public String toString() {
    return "Student: " + name;
  }

  @Override
  public int compareTo(Object o) {
    if (o instanceof Student2) {
      Student2 anotherStudent = (Student2)o;
      return this.name.compareTo(anotherStudent.name);
    } else {
      return -1;
    }
  }
}

class Box<T> {
  private T data; 
  
  public Box(T data) {
    this.data = data;
  }
  
  public T getData() {
    return data;
  }
  
}