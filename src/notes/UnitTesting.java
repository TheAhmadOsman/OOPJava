package notes;

/**
 *
 * @author yasiro01
 */
public class UnitTesting {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int n = 6;
    boolean result = isEven(n);
    System.out.println(result);
  }
  
  public static boolean isEven(int n) {
    return n % 2 == 0;
  }
}
