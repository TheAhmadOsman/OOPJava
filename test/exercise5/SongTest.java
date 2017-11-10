package exercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yasiro01
 */
public class SongTest {
  private Song song1;
  private Song song2;

  @Before
  public void setUp() {
    song1 = new Song("Yesterday", "Beatles");
    song2 = new Song("Sorry Not Sorry", "Demi Lovato");
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of getTitle method, of class Song.
   */
  @Test
  public void testGetTitle() {
    System.out.println("Song.getTitle");
    assertEquals("Yesterday", song1.getTitle());
    assertEquals("Sorry Not Sorry", song2.getTitle());
  }

  /**
   * Test of getArtist method, of class Song.
   */
  @Test
  public void testGetArtist() {
    System.out.println("Song.getArtist");
    assertEquals("Beatles", song1.getArtist());
    assertEquals("Demi Lovato", song2.getArtist());
  }

  /**
   * Test of toString method, of class Song.
   */
  @Test
  public void testToString() {
    System.out.println("Song.toString");
    assertEquals("Yesterday by Beatles", song1.toString());
    assertEquals("Sorry Not Sorry by Demi Lovato", song2.toString());
  }

  /**
   * Test of hashCode method, of class Song.
   */
  @Test
  public void testHashCode() {
    System.out.println("Song.hashCode");
    assertEquals(6170, song1.hashCode());
    assertEquals(15945, song2.hashCode());
  }

  /**
   * Test of equals method, of class Song.
   */
  @Test
  public void testEquals() {
    System.out.println("Song.equals");
    Song newSong = new Song("Yesterday", "Beatles");
    Song anotherNewSong = new Song("Sorry not Sorry", "Demi Lovato");
    assertTrue(song1.equals(newSong));
    assertFalse(song2.equals(anotherNewSong));
  }

}
