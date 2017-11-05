package notes;

import java.io.IOException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class ZooTest {
  Zoo aZoo;
  
  public ZooTest() {
    try {
      aZoo = new Zoo("data/animals.txt");
    } catch (IOException ex) {
      Logger.getLogger(ZooTest.class.getName()).log(Level.SEVERE, null, ex);
    }
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
   * Test of size method, of class Zoo.
   */
  @Test
  public void testSize() {
    System.out.println("size");
    int expResult = 476;
    int result = aZoo.size();
    assertEquals(expResult, result);

  }

  /**
   * Test of printZoo method, of class Zoo.
   */
  @Test
  @Ignore
  public void testPrintZoo() {
    System.out.println("printZoo");
    Zoo instance = null;
    instance.printZoo();
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of getAllByAge method, of class Zoo.
   */
  @Test
  public void testGetAllByAge() {
    System.out.println("getAllByAge");
    int minAge = 100;
    int maxAge = 1000;
    int expResult = 1;
    HashSet<Animal> result = aZoo.getAllByAge(minAge, maxAge);
    assertEquals(expResult, result.size());
  }

  /**
   * Test of getAllBySpecies method, of class Zoo.
   */
  @Test
  public void testGetAllBySpecies() {
    System.out.println("getAllBySpecies");
    String species = "Long-Eared Owl";
    int expResult = 22;
    HashSet<Animal> result = aZoo.getAllBySpecies(species);
    assertEquals(expResult, result.size());
  }
  
}
