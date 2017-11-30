package exercise11;

import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 *
 * @author yasiro01
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Ex11LogicTest {
  private final Ex11Logic logicTester = new Ex11Logic();
  private final Random rnd = new Random();
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  PrintStream original = System.out;
  
  public Ex11LogicTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
    rnd.setSeed(252);
  }
  
  @After
  public void tearDown() {
    System.setOut(original);
  }

  /**
   * Test of strLen method, of class Ex11Logic.
   */
  @Test
  public void testTask1StrLen() {
    System.out.println("Task1.strLen");
    assertEquals(5, logicTester.strLen("hello"));
    assertEquals(4, logicTester.strLen(2.52));
    assertEquals(2, logicTester.strLen(0xA));
    assertEquals(1, logicTester.strLen('\n'));
  }

  /**
   * Test of greater method, of class Ex11Logic.
   */
  @Test
  public void testTask2Greater() {
    System.out.println("Task2.greater");
    assertEquals(new Integer(254), logicTester.greater(254, 253, 252));
    assertEquals("world", logicTester.greater("hello", "world", "now"));
    assertEquals(new Character('f'), logicTester.greater('A', 'a', 'f'));
    assertEquals(new Double(4/3.0), logicTester.greater(1.33, 4/3.0, 1/(0.75)));
  }

  /**
   * Test of printList method, of class Ex11Logic.
   */
  @Test
  public void testTask3PrintList() {
    System.out.println("Task3.printList");
    ArrayList<Integer> intArrLst = new ArrayList();
    ArrayList<Double> dblArrLst = new ArrayList();
    HashMap<Integer, Boolean> boolHashMap = new HashMap();
    HashSet<Character> chrSet = new HashSet();
    for (int i = 0; i < 10; i++) {
      int randomInt = rnd.nextInt(26);
      intArrLst.add(randomInt);
      dblArrLst.add(1.0/randomInt);
      boolHashMap.put(randomInt, (randomInt % 2 == 0));
      chrSet.add((char)(65 + randomInt));
    }
    String expectedResult;
    System.setOut(new PrintStream(outContent));

    outContent.reset();
    expectedResult = "[8, 19, 19, 5, 24, 2, 2, 2, 18, 6] ";
    logicTester.printList(intArrLst);
    assertEquals(expectedResult, outContent.toString());
    
    outContent.reset();
    expectedResult = "[0.125, 0.05263157894736842, 0.05263157894736842, 0.2, 0.041666666666666664, 0.5, 0.5, 0.5, 0.05555555555555555, 0.16666666666666666] ";
    logicTester.printList(dblArrLst);
    assertEquals(expectedResult, outContent.toString());
    
    outContent.reset();
    expectedResult = "{2=true, 18=true, 19=false, 5=false, 6=true, 8=true, 24=true} ";
    logicTester.printList(boolHashMap);
    assertEquals(expectedResult, outContent.toString());
    
    outContent.reset();
    expectedResult = "[C, S, T, F, G, I, Y] ";
    logicTester.printList(chrSet);
    assertEquals(expectedResult, outContent.toString());
  }

  /**
   * Test of findMinItem method, of class Ex11Logic.
   */
  @Test
  public void testTask4FindMinItem() {
    System.out.println("Task4.findMinItem");
    ArrayList<Integer> intArrLst2 = new ArrayList();
    HashSet<Character> chrSet2 = new HashSet();
    for (int i = 0; i < 10; i++) {
      int randomInt = rnd.nextInt(26);
      intArrLst2.add(randomInt);
      chrSet2.add((char)(65 + randomInt));
    }
    assertEquals(new Integer(2), logicTester.findMinItem(intArrLst2));
    assertEquals(new Character('C'), logicTester.findMinItem(chrSet2));
  }
  
}
