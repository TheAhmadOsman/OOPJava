package exercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yasiro01
 */
public class CompanyTest {
  private Company company1;
  private Company company2;
  
  @Before
  public void setUp() {
    company1 = new Company("Apple", 170.00);
    company2 = new Company("Microsoft", 85.00);
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of getName method, of class Company.
   */
  @Test
  public void testGetName() {
    System.out.println("Company.getName");
    assertEquals("Apple", company1.getName());
    assertEquals("Microsoft", company2.getName());
  }

  /**
   * Test of getStockPrice method, of class Company.
   */
  @Test
  public void testGetStockPrice() {
    System.out.println("Company.getStockPrice");
    assertEquals(170.00, company1.getStockPrice(), 0.0);
    assertEquals(85.00, company2.getStockPrice(), 0.0);
  }

  /**
   * Test of setStockPrice method, of class Company.
   */
  @Test
  public void testSetStockPrice() {
    System.out.println("Company.setStockPrice");
    company1.setStockPrice(160);
    company2.setStockPrice(90);
    assertEquals(160.00, company1.getStockPrice(), 0.0);
    assertEquals(90.00, company2.getStockPrice(), 0.0);
  }
  
  /**
   * Test of toString method, of class Company.
   */
  @Test
  public void testToString() {
    System.out.println("Company.toString");
    assertEquals("Apple trading at $170.00", company1.toString());
    assertEquals("Microsoft trading at $85.00", company2.toString());
  }
  
}
