package notes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author yasiro01
 */
public class UnitTestingTest {
  
  public UnitTestingTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of main method, of class UnitTesting.
   */
  @Test
  @Ignore
  public void testMain() {
    System.out.println("main");
    String[] args = null;
    UnitTesting.main(args);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of isEven method, of class UnitTesting.
   */
  @Test
  public void testIsEven() {
    System.out.println("isEven");
    int n = 0;
    boolean expResult = true;
    boolean result = UnitTesting.isEven(n);
    assertEquals(expResult, result);
    n = 5;
    expResult = false;
    result = UnitTesting.isEven(n);
    assertEquals(expResult, result);
  }
  
}
