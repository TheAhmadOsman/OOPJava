package exercise11;

import java.util.Collection;

/**
 * 
 * Exercise 11 logic
 * @author Ahmad M. Osman - Original template by Dr. Roman Yasinovskyy
 * @assignment Week 7: Exercise 11
 * 
**/

public class Ex11Logic {
  
  /**
   * Task 1
   * Implement a generic method that takes an object of any type as a parameter and returns the length of its string representation.
   * @param <T>
   * @param item
   * @return length of the parameter's string representation
   */
  // TODO: Implement method strLen
    
    public <T> int strLen(T item) {
        String itemString = item.toString();
        return itemString.length();
    }
  
  /**
   * Task 2
   * Implement a generic method greater that takes 3 objects as parameters and returns the greater of them.
   * @param <T>
   * @param item1
   * @param item2
   * @param item3
   * @return the greater of three parameters
   */
  // TODO: Implement method greater
    
    public <T extends Comparable> T greater(T item1, T item2, T item3) {
        if(item1.compareTo(item2) >= 0) {
            if(item1.compareTo(item3) >= 0) {
                return item1;
            }
        }
        else if(item2.compareTo(item1) >= 0) {
            if(item2.compareTo(item3) >= 0){
                return item2;
            }
        }
        return item3;
    }
  
  /**
   * Task 3
   * Implement a generic method greater that takes a list of objects as a parameter and prints all the items in the list.
   * @param <T>
   * @param list of objects
   * print a list of items
   */
  // TODO: Implement method printList
    
    public <T> void printList(T ... list) {
        for(T item: list)
            System.out.print(item + " ");
    }
  
  /**
   * Task 4
   * Implement a generic method greater that takes a Collection of objects as a parameter and returns the smallest item in the collection.
   * @param <T>
   * @param list of objects
   * @return the smallest item in the collection
   */
  // TODO: Implement method findMinItem
    public <T extends Comparable> T findMinItem(Collection<T> list){
        boolean firstIteration = true;
        T currentMin = null;
        
        for(T item: list) {
            if(firstIteration == true) {
                currentMin = item;
                firstIteration =  false;
                continue;
            }
            if(item.compareTo(currentMin) <= 0) {
                currentMin = item;
            }
        }
        
        return currentMin;
    }
}

  /**
   * Task 5
   * Create a generic class that has two data members, fuzz of type T and buzz of type U. Implement the class constructor, getters, setters, and toString method.
   * @param <T>
   * @param <U>
   * A class with two data members, T fuzz and U buzz
   * Implement the constructor, getters, setters, and toString
   */
  // TODO: Implement class Foo

class Foo<T, U> {
    private T fuzz;
    private U buzz;

    public Foo(T fuzz, U buzz) {
        this.fuzz = fuzz;
        this.buzz = buzz;
    }

    public T getFuzz() {
        return fuzz;
    }

    public U getBuzz() {
        return buzz;
    }

    public void setFuzz(T fuzz) {
        this.fuzz = fuzz;
    }

    public void setBuzz(U buzz) {
        this.buzz = buzz;
    }

    @Override
    public String toString() {
        return "Foo{" + "fuzz=" + fuzz + ", buzz=" + buzz + '}';
    }
}