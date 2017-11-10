package exercise5;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yasiro01
 */
public class RosterTest {
  private Roster allStudents = null;
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  
  @Before
  public void setUp() {
    try {
      allStudents = new Roster("data/roster.csv");
    } catch (IOException ex) {
      Logger.getLogger(RosterTest.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of printRoster method, of class Roster.
   */
  @Test
  public void testPrintRoster() {
    System.out.println("Roster.printRoster");
    System.setOut(new PrintStream(outContent));
    allStudents.printRoster();
    String expectedResult = "" +
            "Alice A Anderson is majoring in Anthropology with a GPA of 3.0\n" +
            "Bob Black is majoring in Biology with a GPA of 3.2\n" +
            "Charles Chuck Chamberlain is majoring in Computer Science with a GPA of 3.5\n" +
            "Dave Deer is majoring in Dance with a GPA of 2.5\n" +
            "Eve Edelstein is majoring in Environmental Studies with a GPA of 2.5\n" +
            "Fred F Flinstone is majoring in French with a GPA of 3.2\n" +
            "George Giannopulos is majoring in German with a GPA of 2.0\n" +
            "Hillary Humble is majoring in History with a GPA of 2.8\n" +
            "Ivan Iverson is majoring in Information Technology with a GPA of 3.3\n" +
            "Juan is majoring in Journalism with a GPA of 3.5\n";
    assertEquals(expectedResult, outContent.toString());
    System.setOut(System.out);
  }
  
}
