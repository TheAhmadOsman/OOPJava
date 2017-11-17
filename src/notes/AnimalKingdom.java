package notes;

import java.util.ArrayList;

/**
 *
 * @author yasiro01
 */
public class AnimalKingdom {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //AnimalAbstract a = new AnimalAbstract();
    Mammal m = new Mammal(100, "green");
    Reptile r = new Reptile(60, 1000);
    
    System.out.println("Mammal: " + m);
    System.out.println("Reptile: " + r);
    System.out.println("----");
    ArrayList<AnimalAbstract> zoo = new ArrayList();
    
    zoo.add(m);
    zoo.add(r);
    
    for (AnimalAbstract animal: zoo) {
      animal.move();
      animal.breath();
      if (animal instanceof Mammal) {
        Mammal newMammal = (Mammal)animal;
        newMammal.makeSound();
      }
    }
    System.out.println("---");
    AnimalAbstract a = m;
    System.out.println(a);
    a = r;
    System.out.println(a);
    
//    System.out.println(m instanceof Mammal);
//    System.out.println(m instanceof AnimalAbstract);
    //System.out.println(m instanceof Reptile);
    //AnimalAbstract b;
    //System.out.println(b instanceof Mammal);
  }
  
}
