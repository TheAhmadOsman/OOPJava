package notes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yasiro01
 */
public class GameTest {
  private Game game1;
  private Game game2;
  
  @Before
  public void setUp() {
    game1 = new Game("Chutes and Ladders", 1);
    game2 = new Game("Chess", 100);
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of getTitle method, of class Game.
   */
  @Test
  public void testGetTitle() {
    System.out.println("Game.getTitle");
    assertEquals("Chutes and Ladders", game1.getTitle());
    assertEquals("Chess", game2.getTitle());
  }

  /**
   * Test of getRating method, of class Game.
   */
  @Test
  public void testGetRating() {
    System.out.println("Game.getRating");
    assertEquals(1, game1.getRating());
    assertEquals(100, game2.getRating());
  }

  /**
   * Test of toString method, of class Game.
   */
  @Test
  public void testToString() {
    System.out.println("Game.toString");
    assertEquals("Chutes and Ladders (1)", game1.toString());
    assertEquals("Chess (100)", game2.toString());
  }
  
}
