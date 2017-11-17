package notes;

/**
 *
 * @author yasiro01
 */
public class Reptile extends AnimalAbstract {
  private final int eggs;
  
  public Reptile(double bloodTemperature, int eggs) {
    super(bloodTemperature);
    this.eggs = eggs;
  }

  @Override
  public void breath() {
    System.out.println("Reptile just used its lungs");
  }
  
  @Override
  public void move() {
    System.out.println("Reptile moved 5 steps");
  }
  
  
}
