package exercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yasiro01
 */
public class ChartTest {
  private Chart top40pop;
  
  @Before
  public void setUp() {
    top40pop = new Chart("data/top40pop.csv");
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of topSong method, of class Chart.
   */
  @Test
  public void testGetSong() {
    System.out.println("Chart.getSong");
    Song topSong = new Song("Sorry Not Sorry", "Demi Lovato");
    Song anotherSong = new Song("1-800-273-8255", "Logic Featuring Alessia Cara & Khalid");
    assertEquals(topSong, top40pop.getSong(1));
    assertEquals(anotherSong, top40pop.getSong(4));
  }
  
}
