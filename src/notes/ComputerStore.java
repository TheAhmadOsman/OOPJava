package notes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author yasiro01
 */
public class ComputerStore {
  ArrayList<ComputerLaptop> inventory;
  
  public ComputerStore() {
    inventory = new ArrayList();
  }
  
  public ComputerStore(ComputerLaptop cl) {
    this();
    inventory.add(cl);
  }
  
  public ComputerStore(ComputerStore anotherStore) {
    this();
    inventory = (ArrayList<ComputerLaptop>)anotherStore.inventory.clone();
  }
  
  public void addNewLaptop(ComputerLaptop cl) {
    inventory.add(cl);
  }
  
  public void printAll() {
    for (ComputerLaptop cl: inventory) {
      System.out.println(cl);
    }
  }
  
  public void sortMyStore() {
    Collections.sort(inventory);
  }
  
  public void sortMyStore(Comparator comp) {
    Collections.sort(inventory, comp);
  }
}

class ByOS implements Comparator<ComputerLaptop> {
  @Override
  public int compare(ComputerLaptop o1, ComputerLaptop o2) {
    return o1.os.compareTo(o2.os);
  }
}

class ByMemory implements Comparator<ComputerLaptop> {
  @Override
  public int compare(ComputerLaptop o1, ComputerLaptop o2) {
    return o1.memory.compareTo(o2.memory);
  }
}


interface Computer {
  public abstract void turnOn();
  public abstract void turnOff();
}

class ComputerLaptop implements Computer, Comparable {
  String os;
  Double screen;
  Double weight;
  Integer memory;

  public ComputerLaptop(String os, Double screen, Double weight, Integer memory) {
    this.os = os;
    this.screen = screen;
    this.weight = weight;
    this.memory = memory;
  }
  
  @Override
  public void turnOn() {
    System.out.println("Laptop is ON");
  }

  @Override
  public void turnOff() {
    System.out.println("Laptot is OFF");
  }

  @Override
  public int compareTo(Object o) {
    if (o instanceof ComputerLaptop) {
      ComputerLaptop cl = (ComputerLaptop)o;
      return this.screen.compareTo(cl.screen);
    }
    return -1;
  }

  @Override
  public String toString() {
    return "ComputerLaptop{" + "os=" + os + ", screen=" + screen + ", weight=" + weight + ", memory=" + memory + '}';
  }
  
}

