package notes;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
public class AnimalTest {
  Animal animal1;
  Animal animal2;
  
  public AnimalTest() {
    animal1 = new Animal(252, "Abstract Axe", 17, "Aardvark", 202);
    animal2 = new Animal(165, "Brave Beard", 3, "Beaver", 112);
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
   * Test of getId method, of class Animal.
   */
  @Test
  public void testGetId() {
    System.out.println("Animal.getId");
    assertEquals(252, animal1.getId());
    assertEquals(165, animal2.getId());
  }

  /**
   * Test of getName method, of class Animal.
   */
  @Test
  public void testGetName() {
    System.out.println("Animal.getName");
    assertEquals("Abstract Axe", animal1.getName());
    assertEquals("Brave Beard", animal2.getName());
  }

  /**
   * Test of getAge method, of class Animal.
   */
  @Test
  public void testGetAge() {
    System.out.println("Animal.getAge");
    assertEquals(17, animal1.getAge());
    assertEquals(3, animal2.getAge());
  }

  /**
   * Test of setAge method, of class Animal.
   */
  @Test
  public void testSetAge() {
    System.out.println("Animal.setAge");
    animal1.setAge(20);
    animal2.setAge(5);
    assertEquals(20, animal1.getAge());
    assertEquals(5, animal2.getAge());
  }

  /**
   * Test of changeAge method, of class Animal.
   */
  @Test
  public void testChangeAge() {
    System.out.println("Animal.changeAge");
    animal1.changeAge(2);
    animal2.changeAge(-1);
    assertEquals(19, animal1.getAge());
    assertEquals(2, animal2.getAge());
  }

  /**
   * Test of getSpecies method, of class Animal.
   */
  @Test
  public void testGetSpecies() {
    System.out.println("Animal.getSpecies");
    assertEquals("Aardvark", animal1.getSpecies());
    assertEquals("Beaver", animal2.getSpecies());
  }

  /**
   * Test of getLocation method, of class Animal.
   */
  @Test
  public void testGetLocation() {
    System.out.println("Animal.getLocation");
    assertEquals(202, animal1.getLocation());
    assertEquals(112, animal2.getLocation());
  }

  /**
   * Test of setLocation method, of class Animal.
   */
  @Test
  public void testSetLocation() {
    System.out.println("Animal.setLocation");
    animal1.setLocation(101);
    animal2.setLocation(202);
    assertEquals(101, animal1.getLocation());
    assertEquals(202, animal2.getLocation());
  }

  /**
   * Test of move method, of class Animal.
   */
  @Test
  public void testMove() {
    System.out.println("Animal.move");
    animal1.move(101);
    animal2.move(202);
    assertEquals(101, animal1.getLocation());
    assertEquals(202, animal2.getLocation());
  }

  /**
   * Test of toString method, of class Animal.
   */
  @Test
  public void testToString() {
    System.out.println("Animal.toString");
    assertEquals("Abstract Axe (17 yo Aardvark) resides in cage #202", animal1.toString());
    assertEquals("Brave Beard (3 yo Beaver) resides in cage #112", animal2.toString());
  }

  /**
   * Test of toString method, of class Animal.
   */
  @Test
  public void testToString2() {
    System.out.println("Animal.toString2");
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    System.out.print(animal1);
    assertEquals("Abstract Axe (17 yo Aardvark) resides in cage #202", outContent.toString());
    System.out.print(animal2);
    assertEquals("Brave Beard (3 yo Beaver) resides in cage #112", animal2.toString());
    System.setOut(System.out);
  }

  /**
   * Test of hashCode method, of class Animal.
   */
  @Test
  public void testHashCode() {
    System.out.println("Animal.hashCode");
    assertEquals(471, animal1.hashCode());
    assertEquals(384, animal2.hashCode());
  }

  /**
   * Test of equals method, of class Animal.
   */
  @Test
  public void testEquals() {
    System.out.println("Animal.equals");
    Animal newAnimal = new Animal(252, "Candid Chandelier", 10, "Cheetah", 202);
    assertTrue(animal1.equals(newAnimal));
    assertFalse(animal2.equals(newAnimal));
  }
  
}
