package exercise6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * FrogArmy
 * @author yasiro01
 */
public class FrogArmyTest {
  FrogArmy instance1 = new FrogArmy("data/zoo1.txt");
  FrogArmy instance2 = new FrogArmy("data/zoo2.txt");
  
  public FrogArmyTest() {
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
   * Test of size method, of class FrogArmy.
   */
  @Test
  public void testSize() {
    System.out.println("FrogArmy.size");
    int expResult = 4;
    int result = instance1.size();
    assertEquals(expResult, result);
    expResult = 5;
    result = instance2.size();
    assertEquals(expResult, result);
  }

  /**
   * Test of getChief method, of class FrogArmy.
   */
  @Test
  public void testGetChief() {
    System.out.println("FrogArmy.getChief");
    Frog expResult = new Frog("Wild Lover", 100);
    Frog result = instance1.getChief();
    assertEquals(expResult, result);
    expResult = new Frog("Underrated Killer", 79);
    result = instance2.getChief();
    assertEquals(expResult, result);
  }
  
}
