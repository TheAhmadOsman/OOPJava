package notes;



/**
 *
 * @author yasiro01
 */
public class ComputerMain {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    ComputerStore store = new ComputerStore();
    ComputerLaptop cl1 = new ComputerLaptop("Windows", 15.6, 2.0, 8);
    ComputerLaptop cl2 = new ComputerLaptop("Ubuntu", 14.0, 1.0, 16);
    ComputerLaptop cl3 = new ComputerLaptop("macOS", 13.3, 1.0, 8);
    ComputerLaptop cl4 = new ComputerLaptop("ChromeOS", 13.3, 2.0, 4);
    store.addNewLaptop(cl1);
    store.addNewLaptop(cl2);
    store.addNewLaptop(cl3);
    store.addNewLaptop(cl4);
    store.printAll();
    store.sortMyStore();
    System.out.println("---");
    store.printAll();
    System.out.println("---");
    store.sortMyStore(new ByOS());
    store.printAll();
    System.out.println("---");
    store.sortMyStore(new ByMemory());
    store.printAll();
  }
  
}
