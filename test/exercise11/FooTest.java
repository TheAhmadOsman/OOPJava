package exercise11;

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
public class FooTest {
  Foo<Integer, String> fooObj1;
  Foo<String, String> fooObj2;
  
  public FooTest() {
    fooObj1 = new Foo(1, "Alice");
    fooObj2 = new Foo("A", "Aardvark");
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
   * Test of the constructor of class Foo.
   */
  @Test
  public void testFooConstructor() {
    System.out.println("Task5.FooConstructor");
    Foo<Integer, Foo<Character, String>> fooObj = new Foo(1, new Foo('A', "Awesome"));
    assertNotNull(fooObj);
  }
  
  /**
   * Test of getFuzz method, of class Foo.
   */
  @Test
  public void testGetFuzz() {
    System.out.println("Task5.getFuzz");
    assertEquals(new Integer(1), fooObj1.getFuzz());
    assertEquals("A", fooObj2.getFuzz());
  }

  /**
   * Test of setFuzz method, of class Foo.
   */
  @Test
  public void testSetFuzz() {
    System.out.println("Task5.setFuzz");
    fooObj1.setFuzz(2);
    fooObj2.setFuzz("B");
    assertEquals(new Integer(2), fooObj1.getFuzz());
    assertEquals("B", fooObj2.getFuzz());
  }

  /**
   * Test of getBuzz method, of class Foo.
   */
  @Test
  public void testGetBuzz() {
    System.out.println("Task5.getBuzz");
    assertEquals("Alice", fooObj1.getBuzz());
    assertEquals("Aardvark", fooObj2.getBuzz());
  }

  /**
   * Test of setBuzz method, of class Foo.
   */
  @Test
  public void testSetBuzz() {
    System.out.println("Task5.setBuzz");
    fooObj1.setBuzz("Bob");
    fooObj2.setBuzz("Beaver");
    assertEquals("Bob", fooObj1.getBuzz());
    assertEquals("Beaver", fooObj2.getBuzz());
  }

  /**
   * Test of toString method, of class Foo.
   */
  @Test
  public void testToString() {
    System.out.println("Task5.toString");
    Foo instance = null;
    String expResult1 = "Foo{fuzz=1, buzz=Alice}";
    String expResult2 = "Foo{fuzz=A, buzz=Aardvark}";
    assertEquals(expResult1, fooObj1.toString());
    assertEquals(expResult2, fooObj2.toString());
  }
  
}
