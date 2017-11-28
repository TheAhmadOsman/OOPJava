package quizzes;

/**
 * Class Q9Dog
 * @author yasiro01
 */
public class Q9Dog extends Q9Animal{

  public Q9Dog() { }

  public Q9Dog(String name, int age) {
    super(name, age);
    this.species = "Dog";
  }
  
  @Override
  public void hide() {
    System.out.println("I'm dead");
  }

  @Override
  public void seek() {
    System.out.println("Woof!");
  }
  
  public int squirrel(int s) {
    return s--;
  }
}
