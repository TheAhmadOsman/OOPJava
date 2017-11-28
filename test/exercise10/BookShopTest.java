package exercise10;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author yasiro01
 */
public class BookShopTest {
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private BookShop shop1;
  private BookShop shop2;
  private BookShop shop3;
  @Rule
  public final ExpectedException exception = ExpectedException.none();
  
  public BookShopTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
    try {
      shop1 = new BookShop("data/library1.txt");
      shop2 = new BookShop("data/library2.txt");
      shop3 = new BookShop(shop2);
    } catch (IOException ex) {
      Logger.getLogger(BookShopTest.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of the constructor exception
   */
  @Test
  public void testBookShopConstructorException() {
    System.out.println("BookShop.BookShop(filename)");
    try {
      BookShop shop4 = new BookShop("data/library4.txt");
      fail();
    } catch (FileNotFoundException fnfe) { }
  }

  /**
   * Test of the copy constructor
   */
  @Test
  public void testBookShopCopyConstructor() {
    System.out.println("BookShop.BookShop(BookShop)");
    shop2.addNewTitle(new Book("", "", 0.00, 0));
    assertEquals(shop2.size(), 16);
    assertEquals(shop3.size(), 15);

  }

  /**
   * Test of discountAll method, of class BookShop.
   */
  @Test
  public void testDiscountAll() {
    System.out.println("BookShop.discountAll");
    shop1.discountAll(10.0);
    shop2.discountAll(20.0);
    shop3.discountAll(30.0);
    assertEquals(shop1.getCatalog().get(0).getPrice(), 91.00, 0.01);
    assertEquals(shop2.getCatalog().get(0).getPrice(), 72.06, 0.01);
    assertEquals(shop3.getCatalog().get(0).getPrice(), 63.05, 0.01);

  }

  /**
   * Test of printCatalog method, of class BookShop.
   */
  @Test
  public void testPrintCatalog() {
    System.out.println("BookShop.printCatalog");
    System.setOut(new PrintStream(outContent));
    shop3.printCatalog();
    String expectedResult = "" +
            "Understanding Hardware Programs (2005) by Robert Miller costs $90.07\n" +
            "Introduction to Java Programs (2011) by James Miller costs $82.07\n" +
            "Using Operating Programs (2006) by Robert Johnson costs $80.87\n" +
            "Using Secure Systems (2011) by Jennifer Harris costs $100.51\n" +
            "Introduction to Secure Systems (2010) by William Miller costs $99.23\n" +
            "Using Hardware Programs (2012) by Maria White costs $104.05\n" +
            "Developing Hardware Systems (2009) by Charles Jackson costs $116.96\n" +
            "Understanding Operating Networks (2011) by Jennifer Miller costs $101.30\n" +
            "Building Secure Systems (2011) by Robert Thomas costs $84.60\n" +
            "Introduction to Networking Programs (2007) by Elizabeth Jones costs $96.05\n" +
            "Building Hardware Solutions (2011) by Maria Thomas costs $85.93\n" +
            "Building Hardware Security (2011) by Maria Moore costs $84.38\n" +
            "Introduction to Hardware Programs (2011) by Jennifer Anderson costs $93.15\n" +
            "Building Hardware Systems (2011) by Patricia Wilson costs $86.25\n" +
            "Understanding Operating Systems (2011) by Richard Moore costs $85.38\n";
    assertEquals(expectedResult, outContent.toString());
    System.setOut(System.out);
  }

  /**
   * Test of order method, of class BookShop.
   */
  @Test
  public void testOrderByTitle() {
    System.out.println("BookShop.order.ByTitle");
    Comparator<Book> comp = new ByTitle();
    shop1.order(comp);
    shop2.order(comp);
    assertEquals("Building Hardware Systems", shop1.getCatalog().get(0).getTitle());
    assertEquals("Building Hardware Security", shop2.getCatalog().get(0).getTitle());
  }
  
  /**
   * Test of order method, of class BookShop.
   */
  @Test
  public void testOrderByAuthor() {
    System.out.println("BookShop.order.ByAuthor");
    Comparator<Book> comp = new ByAuthor();
    shop1.order(comp);
    shop2.order(comp);
    assertEquals("Developing Java Solutions", shop1.getCatalog().get(0).getTitle());
    assertEquals("Developing Hardware Systems", shop2.getCatalog().get(0).getTitle());
  }

  /**
   * Test of order method, of class BookShop.
   */
  @Test
  public void testOrderByPrice() {
    System.out.println("BookShop.order.ByPrice");
    Comparator<Book> comp = new ByPrice();
    shop1.order(comp);
    shop2.order(comp);
    assertEquals("Using Hardware Security", shop1.getCatalog().get(0).getTitle());
    assertEquals("Using Operating Programs", shop2.getCatalog().get(0).getTitle());
  }

  /**
   * Test of order method, of class BookShop.
   */
  @Test
  public void testOrderByYear() {
    System.out.println("BookShop.order");
    Comparator<Book> comp = new ByYear();
    shop1.order(comp);
    shop2.order(comp);
    assertEquals("Developing Secure Networks", shop1.getCatalog().get(0).getTitle());
    assertEquals("Understanding Hardware Programs", shop2.getCatalog().get(0).getTitle());
  }
  
}
