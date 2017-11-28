package exercise10;

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
public class BookTest {
  private Book book1;
  private Book book2;
  
  public BookTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
    book1 = new Book("HARDCORE TWENTY-FOUR", "Janet Evanovich", 15.99, 2017);
    book2 = new Book("OATHBRINGER", "Brandon Sanderson", 12.99, 2017);
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
    assertEquals("HARDCORE TWENTY-FOUR", book1.getTitle());
    assertEquals("OATHBRINGER", book2.getTitle());
  }

  /**
   * Test of getAuthor method, of class Book.
   */
  @Test
  public void testGetAuthor() {
    System.out.println("Book.getAuthor");
    assertEquals("Janet Evanovich", book1.getAuthor());
    assertEquals("Brandon Sanderson", book2.getAuthor());
  }

  /**
   * Test of getPrice method, of class Book.
   */
  @Test
  public void testGetPrice() {
    System.out.println("Book.getPrice");
    assertEquals(15.99, book1.getPrice(), 0.01);
    assertEquals(12.99, book2.getPrice(), 0.01);
  }
  
  /**
   * Test of setPrice method, of class Book.
   */
  @Test
  public void testSetPrice() {
    System.out.println("Book.setPrice");
    book1.setPrice(2.52);
    book2.setPrice(20.17);
    assertEquals(2.52, book1.getPrice(), 0.01);
    assertEquals(20.17, book2.getPrice(), 0.01);
  }

  /**
   * Test of getYear method, of class Book.
   */
  @Test
  public void testGetYear() {
    System.out.println("Book.getYear");
    assertEquals(new Integer(2017), book1.getYear());
    assertEquals(new Integer(2017), book2.getYear());
  }
  
  /**
   * Test of toString method, of class Book.
   */
  @Test
  public void testToString() {
    System.out.println("Book.toString");
    assertEquals("HARDCORE TWENTY-FOUR (2017) by Janet Evanovich costs $15.99", book1.toString());
    assertEquals("OATHBRINGER (2017) by Brandon Sanderson costs $12.99", book2.toString());
  }

  /**
   * Test of equals method, of class Book.
   */
  @Test
  public void testEquals() {
    System.out.println("Book.equals");
    Book book11 = new Book("HARDCORE TWENTY-FOUR", "Janet Evanovich", 0.99, 2017);
    Book book21 = new Book("OATHBRINGER", "Brandon Sanderson", 0.99, 2017);

    assertEquals(book1, book11);
    assertEquals(book2, book21);
  }
  
}
