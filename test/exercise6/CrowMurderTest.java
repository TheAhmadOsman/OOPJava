package exercise6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testing CrowMurder
 * @author yasiro01
 */
public class CrowMurderTest {
  CrowMurder instance1 = new CrowMurder("data/zoo1.txt");
  CrowMurder instance2 = new CrowMurder("data/zoo2.txt");
  
  public CrowMurderTest() {
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
   * Test of size method, of class CrowMurder.
   */
  @Test
  public void testSize() {
    System.out.println("CrowMurder.size");
    int expResult = 4;
    int result = instance1.size();
    assertEquals(expResult, result);
    expResult = 5;
    result = instance2.size();
    assertEquals(expResult, result);
  }

  /**
   * Test of getChief method, of class CrowMurder.
   */
  @Test
  public void testGetChief() {
    System.out.println("CrowMurder.getChief");
    Crow expResult = new Crow("Juggernaut", 76);
    Crow result = instance1.getChief();
    assertEquals(expResult, result);
    expResult = new Crow("Gentle Isotope", 86);
    result = instance2.getChief();
    assertEquals(expResult, result);
  }
  
}
