package notes;

/**
 * Class Animal
 * @author yasiro01
 */
public class Animal {
  private final int id;
  private final String name;
  private int age;
  private final String species;
  private int location;
  
  public Animal(int id, String name, int age, String species, int location) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.species = species;
    this.location = location;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  public int getId() {
    return id;
  }

  /**
   * Get the value of name
   * @return the value of name
   */
  public String getName() {
    return name;
  }

  /**
   * Get the value of age
   * @return the value of age
   */
  public int getAge() {
    return age;
  }

  /**
   * Set the value of age
   * @param age new value of age
   */
  public void setAge(int age) {
    this.age = age;
  }
  
  /**
   * Change age of an animal
   * @param diff 
   */
  public void changeAge(int diff) {
    this.setAge(this.age + diff);
  }

  /**
   * Get the value of species
   * @return the value of species
   */
  public String getSpecies() {
    return species;
  }

  /**
   * Get the value of location
   * @return the value of location
   */
  public int getLocation() {
    return location;
  }

  /**
   * Set the value of location
   * @param location new value of location
   */
  public void setLocation(int location) {
    this.location = location;
  }
  
  /**
   * Move an animal to a new location
   * @param newLocation 
   */
  public void move(int newLocation) {
    this.setLocation(newLocation);
  }

  @Override
  public String toString() {
    return String.format("%s (%d yo %s) resides in cage #%d", name, age, species, location);
  }

  @Override
  public int hashCode() {
    int hash = 3;
    hash = 73 * hash + this.id;
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Animal other = (Animal) obj;
    if (this.id != other.id) {
      return false;
    }
    return true;
  }

}
