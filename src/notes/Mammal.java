package notes;

/**
 *
 * @author yasiro01
 */
public class Mammal extends AnimalAbstract {
  private final String furColor;
  
  public Mammal(double bloodTemperature, String furColor) {
    super(bloodTemperature);
    this.furColor = furColor;
  }

  @Override
  public void move() {
    System.out.println("Mammal jumped!");
  }
  
  public void makeSound() {
    System.out.println("Meow!");
  }
  
  @Override
  public String toString() {
    return super.toString() + "I'm a " + furColor + " mammal";
  }
}
