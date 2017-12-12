package exam;

/**
 * Class Creature
 * @author yasiro01
 */
public abstract class Creature {
  protected final String imya;
  protected int zdorovya;

  public Creature(String imya, int zdorovya) {
    this.imya = imya;
    this.zdorovya = zdorovya;
  }
  
  public String getImya() {
    return imya;
  }
  
  public int getZdorovya() {
    return zdorovya;
  }
  
  public void setZdorovya(int shkoda) {
    zdorovya = zdorovya - shkoda;
    if (zdorovya < 1) {
      zdorovya = 1;
    }
  }
  
  @Override
  public String toString() {
    return imya + " " + zdorovya;
  }
}
