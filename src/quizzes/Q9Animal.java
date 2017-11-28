package quizzes;

/**
 * Class Q9Animal
 * @author yasiro01
 */
public abstract class Q9Animal {
  protected String name;
  protected int age;
  protected String species;

  public Q9Animal() { }
  
  public Q9Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return species + " " + name + " is " + age + "yo";
  }
  
  public abstract void hide();
  public abstract void seek();

}
