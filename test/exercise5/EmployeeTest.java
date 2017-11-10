package exercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yasiro01
 */
public class EmployeeTest {
  private Employee employeeSalaried;
  private Employee employeeHourly;
  
  @Before
  public void setUp() {
    employeeSalaried = new Employee("Andrew", "Anderson", 50000.00, true);
    employeeHourly = new Employee("Beatrice", "Black", 25.00, false);
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of getFirstName method, of class Employee.
   */
  @Test
  public void testGetFirstName() {
    System.out.println("Employee.getFirstName");
    assertEquals("Andrew", employeeSalaried.getFirstName());
    assertEquals("Beatrice", employeeHourly.getFirstName());
  }

  /**
   * Test of getLastName method, of class Employee.
   */
  @Test
  public void testGetLastName() {
    System.out.println("Employee.getLastName");
    assertEquals("Anderson", employeeSalaried.getLastName());
    assertEquals("Black", employeeHourly.getLastName());
  }

  /**
   * Test of getSalary method, of class Employee.
   */
  @Test
  public void testGetSalary() {
    System.out.println("Employee.getSalary");
    assertEquals(50000.00, employeeSalaried.getSalary(), 0.01);
    assertEquals(25.00, employeeHourly.getSalary(), 0.01);
  }

  /**
   * Test of isIsFullTime method, of class Employee.
   */
  @Test
  public void testIsIsFullTime() {
    System.out.println("Employee.isFullTime");
    assertTrue(employeeSalaried.isFullTime());
    assertFalse(employeeHourly.isFullTime());
  }

  /**
   * Test of toString method, of class Employee.
   */
  @Test
  public void testToString() {
    System.out.println("Employee.toString");
    assertEquals("Andrew Anderson earns $50000.00 annually", employeeSalaried.toString());
    assertEquals("Beatrice Black earns $25.00 hourly", employeeHourly.toString());
  }
  
}
