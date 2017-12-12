package exam;

/**
 * Class Sailor
 * @author yasiro01
 */
public abstract class Sailor extends Creature implements Member {
  protected final int ataka;
  protected int zakhyst;

  public Sailor(String imya, int zdorovya, int ataka, int zakhyst) {
    super(imya, zdorovya);
    this.ataka = ataka;
    this.zakhyst = zakhyst;
  }
  
  @Override
  public void setZdorovya(int shkoda) {
    super.setZdorovya(shkoda - zakhyst);
    zakhyst--;
  }
  
  @Override
  public String getImya() {
    return "Sailor " + super.getImya();
  }
    
  @Override
  public void napaday(Monster monster) {
    monster.setZdorovya(ataka);
  }
  
}
