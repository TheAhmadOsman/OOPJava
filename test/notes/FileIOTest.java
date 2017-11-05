package notes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author yasiro01
 */
public class FileIOTest {
  
  public FileIOTest() {
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
   * Test of main method, of class FileIO.
   */
  @Test
  @Ignore
  public void testMain() {
    System.out.println("main");
    String[] args = null;
    FileIO.main(args);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of generateFile method, of class FileIO.
   */
  @Test
  @Ignore
  public void testGenerateFile() throws Exception {
    System.out.println("generateFile");
    String filename = "";
    FileIO.generateFile(filename);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of usePrintWriter method, of class FileIO.
   */
  @Test
  @Ignore
  public void testUsePrintWriter() throws Exception {
    System.out.println("usePrintWriter");
    String filename = "";
    FileIO.usePrintWriter(filename);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of readFile method, of class FileIO.
   */
  @Test
  @Ignore
  public void testReadFile() throws Exception {
    System.out.println("readFile");
    String filename = "";
    FileIO.readFile(filename);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of filterFileByState method, of class FileIO.
   */
  @Test
  @Ignore
  public void testFilterFileByState() throws Exception {
    System.out.println("filterFileByState");
    String filename = "";
    String state = "";
    FileIO.filterFileByState(filename, state);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of countLines method, of class FileIO.
   */
  @Test
  public void testCountLines() throws Exception {
    System.out.println("countLines");
    String filename = "data/numbers.txt";
    int expResult = 2;
    int result = FileIO.countLines(filename);
    assertEquals(expResult, result);
  }

  /**
   * Test of sumNumbers method, of class FileIO.
   */
  @Test
  public void testSumNumbers() throws Exception {
    System.out.println("sumNumbers");
    String filename = "data/numbers.txt";
    int expResult = 143;
    int result = FileIO.sumNumbers(filename);
    assertEquals(expResult, result);
  }

  /**
   * Test of getDimensions method, of class FileIO.
   */
  @Test
  public void testGetDimensions() throws Exception {
    System.out.println("getDimensions");
    String filename = "data/numbers.txt";
    int[] expResult = {2, 5};
    int[] result = FileIO.getDimensions(filename);
    assertArrayEquals(expResult, result);
  }
  
}
