package notes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class Zoo
 * A Zoo is a collection of animals, stored internally as an ArrayList
 * @author yasiro01
 */
public class Zoo {
  private final ArrayList<Animal> animalList;

  public Zoo(String filename) throws FileNotFoundException, IOException {
    animalList = new ArrayList();
    BufferedReader inputFile = new BufferedReader(new FileReader(filename));
    String line;
    Pattern p = Pattern.compile("(\\d+)\\s+(\\w+(\\s\\w+)*)\\s+(\\d+)\\s+(\\w+([\\-\\s]\\w+)*)\\s+(\\d+)");
    while ((line = inputFile.readLine()) != null) {
      Matcher m = p.matcher(line.trim());
      if (m.matches()) {
        animalList.add(new Animal(
                Integer.parseInt(m.group(1)),
                m.group(2),
                Integer.parseInt(m.group(4)),
                m.group(5),
                Integer.parseInt(m.group(7)))
        );
      }
    }
  }
  
  public int size() {
    return animalList.size();
  }
  
  public void printZoo() {
    animalList.stream().forEach((animal) -> {
      System.out.printf("%s%n", animal.toString());
    });
  }
  
  public HashSet<Animal> getAllByAge(int minAge, int maxAge) {
    HashSet<Animal> result = new HashSet();
    for (Animal animal: animalList) {
      if (animal.getAge() >= minAge && animal.getAge() <= maxAge) {
        result.add(animal);
      }
    }
    return result;
  }
  
  public HashSet<Animal> getAllBySpecies(String species) {
    HashSet<Animal> result = new HashSet();
    for (Animal animal: animalList) {
      if (animal.getSpecies().equals(species)) {
        result.add(animal);
      }
    }
    return result;
  }
  
}
