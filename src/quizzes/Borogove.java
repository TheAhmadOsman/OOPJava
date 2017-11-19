package quizzes;

/**
 * Class Borogove
 * @author yasiro01
 */
public class Borogove {
  private final String b1;
  private Grimoire bg;

  public Borogove(String b1) {
    this.b1 = b1;
  }
  
  public Borogove(String b1, Grimoire bg) {
    this.b1 = b1;
    this.bg = bg;
  }
  
  public String getB1() {
    return b1;
  }

  public void setBg(Grimoire bg) {
    this.bg = bg;
  }
  
  public void burble() {
    bg.gimble();
    bg.gyre();
  }
  
  @Override
  public String toString() {
    return String.format("%s: %s", b1, bg);
  }
  
}
