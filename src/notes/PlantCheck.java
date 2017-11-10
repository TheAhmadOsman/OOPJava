package notes;

/**
 *
 * @author yasiro01
 */
public class PlantCheck {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Plant rose1 = new Plant(true, false, "Rose", 10);
    System.out.println(rose1);
    Plant rose2 = new Plant(true, false, "Rose", 10);
    System.out.println(rose2);
    if (rose1 == rose2) {
      System.out.println("They are equal");
    } else {
      System.out.println("They are NOT equal");
    }
    
    Plant oak1 = new Plant(false, true, "Oak", 50);
    Plant oak2 = oak1;
    System.out.println(oak1);
    System.out.println(oak2);
    oak2.setHeight(5000);
    System.out.println(oak1);
    
    PlantGarden myGarden = new PlantGarden(2, 3);
    
    String testStr = "5";
    int testInt = Integer.parseInt(testStr);
    System.out.println(++testInt);
  }
  
}
