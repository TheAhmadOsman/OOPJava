package quizzes;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Quiz 11
 * @author yasiro01
 */
public class Quiz11 {
  public static void main(String[] args) {
    /* Question code here */
  }
  
  public static <T> void mystery(T param1) {
    System.out.print(param1.toString());
  }
  
  public static <T extends Comparable> boolean mystery(T param1, T param2) {
    return param1.compareTo(param2) > 0;
  }
  
  public static <T extends Comparable> T mystery(T ... params) {
    T r = params[0];
    for (T t: params) {
      if (t.compareTo(r) < 0) {
       r = t; 
      }
    }
    return r;
  }
    
  public static <T extends Comparable> void mystery(Collection<T> params) {
    while (params.iterator().hasNext()) {
      System.out.print(params.iterator().next());
    }
  }
}

class Car<T> implements Comparable {
  private final String maker;
  private final T model;
  private final int year;

  public Car(String maker, T model, int year) {
    this.maker = maker;
    this.model = model;
    this.year = year;
  }

  public String getMaker() {
    return maker;
  }

  public T getModel() {
    return model;
  }

  public int getYear() {
    return year;
  }

  @Override
  public String toString() {
    return maker + " " + model + " (" + year + ')';
  }

  @Override
  public int compareTo(Object t) {
    return this.toString().compareTo(t.toString());
  }
}
