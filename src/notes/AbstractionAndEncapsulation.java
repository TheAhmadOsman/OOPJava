package notes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Abstraction and Encapsulation
 * @author yasiro01
 */
public class AbstractionAndEncapsulation {
  public static void main(String[] args) {
    Zoo myZoo = null;
    try {
      myZoo = new Zoo("data/animals.txt");
    } catch (FileNotFoundException ex) {
      Logger.getLogger(AbstractionAndEncapsulation.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
      Logger.getLogger(AbstractionAndEncapsulation.class.getName()).log(Level.SEVERE, null, ex);
    }
    if (null != myZoo) {
      System.out.printf("There are %d animals in our zoo%n", myZoo.size());
      myZoo.printZoo();
      System.out.printf("%n---%n");
      HashSet<Animal> herd = myZoo.getAllByAge(0, 5);
      System.out.printf("There are %d animals 5 yo or younger%n", herd.size());
      for (Animal babyAnimal: herd) {
        System.out.printf("%s%n", babyAnimal.toString());
      }
      System.out.printf("%n---%n");
      HashSet<Animal> pack = myZoo.getAllBySpecies("Cavalier King Charles Spaniel");
      System.out.printf("There are %d %ss%n", pack.size(), "Cavalier King Charles Spaniel");
      for (Animal dog: pack) {
        System.out.printf("%s%n", dog.toString());
      }
    }
  }
  
}
