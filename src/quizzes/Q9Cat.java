package quizzes;

/**
 * Class Q9Cat
 * @author yasiro01
 */
public class Q9Cat extends Q9Animal {

  public Q9Cat() {
    this.age = 1;
    this.name = "Fur Ball";
    this.species = "Cat";
  }

  public Q9Cat(String name, int age) {
    super(name, age);
    this.species = "Cat";
  }
  
  @Override
  public void hide() {
    System.out.println("Under a couch");
  }

  @Override
  public void seek() {
    System.out.println("Meow!");
  }
  
  public void laser() {
    System.out.println("!");
  }
  
}
