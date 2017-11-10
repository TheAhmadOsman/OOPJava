package notes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yasiro01
 */
public class CustomerTest {
  private Customer customer1;
  private Customer customer2;
  
  @Before
  public void setUp() {
    customer1 = new Customer(50000.00, 120);
    customer2 = new Customer(1000.00, 2);
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of getLoan method, of class Customer.
   */
  @Test
  public void testGetLoan() {
    System.out.println("Customer.getLoan");
    assertEquals(50000, customer1.getLoan(), 0.0);
    assertEquals(1000, customer2.getLoan(), 0.0);
  }

  /**
   * Test of getTerm method, of class Customer.
   */
  @Test
  public void testGetTerm() {
    System.out.println("Customer.getTerm");
    assertEquals(120, customer1.getTerm(), 0.0);
    assertEquals(2, customer2.getTerm(), 0.0);
  }

  /**
   * Test of toString method, of class Customer.
   */
  @Test
  public void testToString() {
    System.out.println("Customer.toString");
    assertEquals("$50000.00 over 120 months", customer1.toString());
    assertEquals("$1000.00 over 2 months", customer2.toString());
  }
  
}
