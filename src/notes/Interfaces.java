package notes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Interfaces and Comparators
 * @author yasiro01
 */
public class Interfaces {
  public static void main(String[] args) {
    System.out.println("Making a new roster");
    Roster myRoster = new Roster();
    myRoster.enroll(new Human("Bob", "Yellow"));
    myRoster.enroll(new Human("Alice", "Zebra"));
    myRoster.enroll(new Human("Dave", "Wilson"));
    myRoster.enroll(new Human("Eve", "Vendetta"));
    myRoster.enroll(new Human("Charlie", "X"));
    System.out.println("New roster created");
    System.out.println("Printing the roster");
    myRoster.print();
    System.out.println("Sorting the roster");
    myRoster.order();
    System.out.println("Printing the roster");
    myRoster.print();
    System.out.println("Making a copy of the roster");
    Roster anotherRoster = new Roster(myRoster);
    System.out.println("Modifying the copy");
    anotherRoster.enroll(new Human("Frank", "Underwood"));
    System.out.println("Printing the roster copy");
    anotherRoster.print();
    System.out.println("Printing the roster");
    myRoster.print();
  }
}

class Human implements Comparable {
  private final String nameFirst;
  private final String nameLast;

  public Human(String nameFirst, String nameLast) {
    this.nameFirst = nameFirst;
    this.nameLast = nameLast;
  }

  public String getFName() {
    return nameFirst;
  }

  public String getLName() {
    return nameLast;
  }
  
  @Override
  public String toString() {
    return nameLast + ", " + nameFirst;
  }

  @Override
  public int compareTo(Object o) {
    if (o instanceof Human) {
      Human s = (Human) o;
      return this.nameFirst.compareTo(s.nameFirst);
    }
    return -1;
  }
}

class ByLName implements Comparator<Human> {
  @Override
  public int compare(Human s1, Human s2) {
    return s1.getLName().compareTo(s2.getLName());
  }
}

class Roster {
  private final ArrayList<Human> roster;

  public Roster() {
    roster = new ArrayList();
  }

  public Roster(Roster roster) {
    this();
    for (Human s: roster.roster) {
      this.roster.add(s);
    }
  }
  
  public void enroll(Human s) {
    roster.add(s);
  }
  
  public void drop(Human s) {
    roster.remove(s);
  }
  
  public int size() {
    return roster.size();
  }
  
  public void print() {
    for (Human s: roster) {
      System.out.println(s);
    }
    System.out.println();
  }
  
  public void order() {
    Collections.sort(roster);
  }
  
  public void order(Comparator comp) {
    Collections.sort(roster, comp);
  }

}
