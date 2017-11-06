package exercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yasiro01
 */
public class CollegeTest {
  private College college1;
  private College college2;
  
  @Before
  public void setUp() {
    college1 = new College("Luther College", 1);
    college2 = new College("Wartburg College", 100);
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of getName method, of class College.
   */
  @Test
  public void testGetName() {
    System.out.println("College.getName");
    assertEquals("Luther College", college1.getName());
    assertEquals("Wartburg College", college2.getName());
  }

  /**
   * Test of getRank method, of class College.
   */
  @Test
  public void testGetRank() {
    System.out.println("College.getRank");
    assertEquals(1, college1.getRank());
    assertEquals(100, college2.getRank());
  }

  /**
   * Test of setRank method, of class College.
   */
  @Test
  public void testSetRank() {
    System.out.println("College.setRank");
    college1.setRank(10);
    college2.setRank(200);
    assertEquals(10, college1.getRank());
    assertEquals(200, college2.getRank());
  }

  /**
   * Test of toString method, of class College.
   */
  @Test
  public void testToString() {
    System.out.println("College.toString");
    assertEquals("Luther College is ranked #1", college1.toString());
    assertEquals("Wartburg College is ranked #100", college2.toString());
  }
  
}
