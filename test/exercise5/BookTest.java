package exercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yasiro01
 */
public class BookTest {
  private Book book1;
  private Book book2;
  
  @Before
  public void setUp() {
    book1 = new Book("Animals of Australia", "Alice Anderson", 12.99);
    book2 = new Book("Battle of Britain", "Benjamin Black", 15.99);
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of getTitle method, of class Book.
   */
  @Test
  public void testGetTitle() {
    System.out.println("Book.getTitle");
    assertEquals("Animals of Australia", book1.getTitle());
    assertEquals("Battle of Britain", book2.getTitle());
  }

  /**
   * Test of getAuthor method, of class Book.
   */
  @Test
  public void testGetAuthor() {
    System.out.println("Book.getAuthor");
    assertEquals("Alice Anderson", book1.getAuthor());
    assertEquals("Benjamin Black", book2.getAuthor());
  }

  /**
   * Test of getPrice method, of class Book.
   */
  @Test
  public void testGetPrice() {
    System.out.println("Book.getPrice");
    assertEquals(12.99, book1.getPrice(), 0.01);
    assertEquals(15.99, book2.getPrice(), 0.01);
  }

  /**
   * Test of toString method, of class Book.
   */
  @Test
  public void testToString() {
    System.out.println("Book.toString");
    assertEquals("Animals of Australia by Alice Anderson costs 12.99", book1.toString());
    assertEquals("Battle of Britain by Benjamin Black costs 15.99", book2.toString());
  }
  
}
