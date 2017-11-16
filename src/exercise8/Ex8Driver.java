package exercise8;

import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Ex8Driver
 * @author yasiro01
 */
public class Ex8Driver {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Random rnd = new Random();
    rnd.setSeed(252);
    try {
      MediaLibrary myPersonalLibrary = new MediaLibrary("data/MediaLibrary.csv");
      myPersonalLibrary.printAllItems();
      System.out.println("---");
      for (int i = 0; i < myPersonalLibrary.size(); i++) {
        myPersonalLibrary.getItem(i).checkout();
      }
      myPersonalLibrary.printAllItems();
      System.out.println("---");
      for (int i = 0; i < myPersonalLibrary.size(); i++) {
        myPersonalLibrary.getItem(i).checkin();
      }
      myPersonalLibrary.printAllItems();
      System.out.println("---");
      System.out.println("Detailed description");
      myPersonalLibrary.printAllItemsDetailed();
    } catch (IOException ex) {
      Logger.getLogger(Ex8Driver.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
}
