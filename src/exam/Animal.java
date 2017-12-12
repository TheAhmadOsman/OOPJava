package exam;

/**
 * Class Animal
 * @author yasiro01
 */
public class Animal extends Sailor {
  private final int lap = 4;

  public Animal(String imya, int zdorovya, int ataka, int zakhyst) {
    super(imya, zdorovya, ataka, zakhyst);
  }

  public int getLap() {
    return lap;
  }
  
}
