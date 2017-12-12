package exam;

/**
 * Class Monster
 * @author yasiro01
 */
public class Monster extends Creature {
  private int ukus;

  public Monster() {
    super("Snark", 100);
    this.ukus = 100;
  }

  public Monster(String imya, int zdorovya, int ukus) {
    super(imya, zdorovya);
    this.ukus = ukus;
  }

  public String getImya() {
    return imya;
  }

  public int getUkus() {
    return ukus;
  }

  public void setUkus(int ukus) {
    this.ukus = ukus;
  }
  
  public void outgrabe(Creature creature) {
    creature.setZdorovya(ukus);
  }

  @Override
  public String toString() {
    return imya + " " + ukus;
  }
}
