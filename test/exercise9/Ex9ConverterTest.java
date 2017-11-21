package exercise9;

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
public class Ex9ConverterTest {
  
  public Ex9ConverterTest() {
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
   * Test of c2f method, of class Ex9Converter.
   */
  @Test
  public void testC2f() {
    System.out.println("c2f");
    Double valueFrom = 37.0;
    Ex9Converter instance = new Ex9Converter();
    Double expResult = 98.6;
    Double result = instance.c2f(valueFrom);
    assertEquals(expResult, result, 0.01);
  }

  /**
   * Test of c2k method, of class Ex9Converter.
   */
  @Test
  public void testC2k() {
    System.out.println("c2k");
    Double valueFrom = 37.0;
    Ex9Converter instance = new Ex9Converter();
    Double expResult = 310.15;
    Double result = instance.c2k(valueFrom);
    assertEquals(expResult, result, 0.01);
  }

  /**
   * Test of f2c method, of class Ex9Converter.
   */
  @Test
  public void testF2c() {
    System.out.println("f2c");
    Double valueFrom = 451.0;
    Ex9Converter instance = new Ex9Converter();
    Double expResult = 232.78;
    Double result = instance.f2c(valueFrom);
    assertEquals(expResult, result, 0.01);
  }

  /**
   * Test of f2k method, of class Ex9Converter.
   */
  @Test
  public void testF2k() {
    System.out.println("f2k");
    Double valueFrom = 451.0;
    Ex9Converter instance = new Ex9Converter();
    Double expResult = 505.93;
    Double result = instance.f2k(valueFrom);
    assertEquals(expResult, result, 0.01);
  }

  /**
   * Test of k2c method, of class Ex9Converter.
   */
  @Test
  public void testK2c() {
    System.out.println("k2c");
    Double valueFrom = 200.0;
    Ex9Converter instance = new Ex9Converter();
    Double expResult = -73.15;
    Double result = instance.k2c(valueFrom);
    assertEquals(expResult, result, 0.01);
  }

  /**
   * Test of k2f method, of class Ex9Converter.
   */
  @Test
  public void testK2f() {
    System.out.println("k2f");
    Double valueFrom = 200.0;
    Ex9Converter instance = new Ex9Converter();
    Double expResult = -99.67;
    Double result = instance.k2f(valueFrom);
    assertEquals(expResult, result, 0.01);
  }
  
}
