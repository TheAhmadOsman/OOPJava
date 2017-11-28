package quizzes;

import java.util.ArrayList;

/**
 * Class Q9Zoo
 * @author yasiro01
 */
public class Q9Zoo {
  private ArrayList<Q9Animal> zooList;

  public Q9Zoo() {
    this.zooList = new ArrayList();
  }
  
  public void printAll() {
    for (Q9Animal a: zooList) {
      System.out.println(a);
    }
  }
  
  public void ageAll() {
    for (Q9Animal a: zooList) {
      a.setAge(a.getAge() + 1);
    }
  }
  
  public void play() {
    for (Q9Animal a: zooList) {
      a.hide();
      if (a instanceof Q9Dog) {
        a.seek();
      }
    }
  }
  
  public void adopt(Q9Animal a) {
    zooList.add(a);
  }
  
  
}
