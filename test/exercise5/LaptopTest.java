package exercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yasiro01
 */
public class LaptopTest {
  private Laptop laptop1;
  private Laptop laptop2;
  
  @Before
  public void setUp() {
    laptop1 = new Laptop("Apple", 2000.00, "Silver");
    laptop2 = new Laptop("Dell", 500.00, "Black");
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of getManufacturer method, of class Laptop.
   */
  @Test
  public void testGetManufacturer() {
    System.out.println("Laptop.getManufacturer");
    assertEquals("Apple", laptop1.getManufacturer());
    assertEquals("Dell", laptop2.getManufacturer());
  }

  /**
   * Test of getPrice method, of class Laptop.
   */
  @Test
  public void testGetPrice() {
    System.out.println("Laptop.getPrice");
    assertEquals(2000, laptop1.getPrice(), 0.0);
    assertEquals(500, laptop2.getPrice(), 0.0);
  }

  /**
   * Test of setPrice method, of class Laptop.
   */
  @Test
  public void testSetPrice() {
    System.out.println("Laptop.setPrice");
    laptop1.setPrice(1800.00);
    laptop2.setPrice(450.00);
    assertEquals(1800, laptop1.getPrice(), 0.0);
    assertEquals(450, laptop2.getPrice(), 0.0);
  }

  /**
   * Test of getColor method, of class Laptop.
   */
  @Test
  public void testGetColor() {
    System.out.println("Laptop.getColor");
    assertEquals("Silver", laptop1.getColor());
    assertEquals("Black", laptop2.getColor());
  }

  /**
   * Test of setColor method, of class Laptop.
   */
  @Test
  public void testSetColor() {
    System.out.println("Laptop.setColor");
    laptop1.setColor("White");
    laptop2.setColor("Rainbow");
    assertEquals("White", laptop1.getColor());
    assertEquals("Rainbow", laptop2.getColor());
  }

  /**
   * Test of toString method, of class Laptop.
   */
  @Test
  public void testToString() {
    System.out.println("Laptop.toString");
    assertEquals("Silver laptop by Apple costs $2000.00", laptop1.toString());
    assertEquals("Black laptop by Dell costs $500.00", laptop2.toString());
  }
  
}
