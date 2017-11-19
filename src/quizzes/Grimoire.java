package quizzes;

/**
 * Class Grimoire
 * @author yasiro01
 */
public class Grimoire {
  private int g1;
  private int g2;

  public Grimoire(int g1, int g2) {
    this.g1 = g1;
    this.g2 = g2;
  }

  public Grimoire(int g1, int g2, int g3) {
    this.g1 = g1;
    this.g2 = g2;
  }
  
  public int getG1() {
    return g1;
  }

  public int getG2() {
    return g2;
  }
  
  public void gimble() {
    g1 = 0;
    g2--;
  }
  
  public void gyre() {
    int tmp = g1;
    g1 = g2;
    g2 = tmp;
  }
  
  @Override
  public String toString() {
    return String.format("%d+%d", g1, g2);
  }

}
