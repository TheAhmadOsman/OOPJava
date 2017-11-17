package notes;

/**
 *
 * @author yasiro01
 */
public abstract class AnimalAbstract {
  protected double bloodTemperature;

  public AnimalAbstract(double bloodTemperature) {
    this.bloodTemperature = bloodTemperature;
  }
  
  public void breath() {
    System.out.println("Oxigen level increased");
  }
  
  public abstract void move();
  
  @Override
  public String toString() {
    return "I'm an animal, my blood temperature is " + bloodTemperature;
  }
}
