package exam;

/**
 * Class Humanoid
 * @author yasiro01
 */
public class Humanoid extends Sailor {
  private final String rol;

  public Humanoid(String imya, int zdorovya, int ataka, int zakhyst, String rol) {
    super(imya, zdorovya, ataka, zakhyst);
    this.rol = rol;
  }  

  public String getRol() {
    return rol;
  }

}
