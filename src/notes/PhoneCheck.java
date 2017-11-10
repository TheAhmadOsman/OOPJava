package notes;

/**
 *
 * @author yasiro01
 */
public class PhoneCheck {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Phone myPhone = new Phone();
    System.out.println(myPhone.getModel());
    myPhone.setModel("Apple iPhone X");
    System.out.println(myPhone.getModel());
  }
  
}
