package exam;

/**
 * Class Leader
 * @author yasiro01
 */
public class Leader extends Creature implements Member {
  private int kharyzma;

  public Leader(int kharyzma) {
    super("Bellman", 100);
    this.kharyzma = kharyzma;
  }

  public Leader(String imya, int zdorovya, int kharyzma) {
    super(imya, zdorovya);
    this.kharyzma = kharyzma;
  }

  @Override
  public String getImya() {
    return "Captain " + imya;
  }

  @Override
  public void setZdorovya(int shkoda) {
    super.setZdorovya(shkoda / kharyzma);
    kharyzma++;
  }

  @Override
  public void napaday(Monster monster) {
    monster.setZdorovya(kharyzma);
  }
}
