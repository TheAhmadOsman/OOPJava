package notes;

/**
 *
 * @author yasiro01
 */
public class Person {
  protected String name;
  protected String race;
  protected int age;
  
  public Person() {}
  
  public Person(String name, String race, int age) {
    this.name = name;
    this.race = race;
    this.age = age;
  }
  
  @Override
  public String toString() {
    return "Person:" + name + 
            "(" + age + 
            ") is " + race;
  }

}
