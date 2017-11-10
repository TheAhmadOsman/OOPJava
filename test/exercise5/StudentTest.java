package exercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yasiro01
 */
public class StudentTest {
  private Student student1;
  private Student student2;
  
  @Before
  public void setUp() {
    student1 = new Student("Alice Anderson", "Computer Science", 4.0);
    student2 = new Student("Bob Black", "History", 3.5);
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of getGpa method, of class Student.
   */
  @Test
  public void testGetGpa() {
    System.out.println("Student.getGpa");
    assertEquals(4.0, student1.getGpa(), 0.0);
    assertEquals(3.5, student2.getGpa(), 0.0);
  }

  /**
   * Test of setGpa method, of class Student.
   */
  @Test
  public void testSetGpa() {
    System.out.println("Student.setGpa");
    student1.setGpa(2.0);
    student2.setGpa(2.5);
    assertEquals(2.0, student1.getGpa(), 0.0);
    assertEquals(2.5, student2.getGpa(), 0.0);
  }

  /**
   * Test of getMajor method, of class Student.
   */
  @Test
  public void testGetMajor() {
    System.out.println("Student.getMajor");
    assertEquals("Computer Science", student1.getMajor());
    assertEquals("History", student2.getMajor());
  }

  /**
   * Test of setMajor method, of class Student.
   */
  @Test
  public void testSetMajor() {
    System.out.println("Student.setMajor");
    student1.setMajor("Data Science");
    student2.setMajor("Dance");
    assertEquals("Data Science", student1.getMajor());
    assertEquals("Dance", student2.getMajor());
  }

  /**
   * Test of getName method, of class Student.
   */
  @Test
  public void testGetName() {
    System.out.println("Student.getName");
    assertEquals("Alice Anderson", student1.getName());
    assertEquals("Bob Black", student2.getName());
  }

  /**
   * Test of toString method, of class Student.
   */
  @Test
  public void testToString() {
    System.out.println("Student.toString");
    assertEquals("Alice Anderson is majoring in Computer Science with a GPA of 4.0", student1.toString());
    assertEquals("Bob Black is majoring in History with a GPA of 3.5", student2.toString());
  }
  
}
