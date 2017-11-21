package notes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yasiro01
 */
public class GreeterTest {
  
  public GreeterTest() {
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
   * Test of greet method, of class Greeter.
   */
  @Test
  public void testGreet() {
    System.out.println("greet");
    String name = "CS252";
    Greeter instance = new Greeter();
    String expResult = "Hello CS252";
    String result = instance.greet(name);
    assertEquals(expResult, result);
  }
  
}
