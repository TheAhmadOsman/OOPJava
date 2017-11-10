package exercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author yasiro01
 */
public class RoomTest {
  private Room room1;
  private Room room2;
  
  @Before
  public void setUp() {
    room1 = new Room("Olin", 202);
    room2 = new Room("Main", 101);
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of getBuilding method, of class Room.
   */
  @Test
  public void testGetBuilding() {
    System.out.println("Room.getBuilding");
    assertEquals("Olin", room1.getBuilding());
    assertEquals("Main", room2.getBuilding());
  }

  /**
   * Test of getNumber method, of class Room.
   */
  @Test
  public void testGetNumber() {
    System.out.println("Room.getNumber");
    assertEquals(202, room1.getNumber());
    assertEquals(101, room2.getNumber());
  }

  /**
   * Test of toString method, of class Room.
   */
  @Test
  public void testToString() {
    System.out.println("Room.toString");
    assertEquals("Olin 202", room1.toString());
    assertEquals("Main 101", room2.toString());
  }
  
}
