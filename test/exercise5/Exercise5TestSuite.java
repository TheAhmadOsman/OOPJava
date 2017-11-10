package exercise5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author yasiro01
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
  exercise5.RoomTest.class,
  exercise5.BookTest.class,
  exercise5.EmployeeTest.class,
  exercise5.CompanyTest.class,
  exercise5.CollegeTest.class,
  exercise5.LaptopTest.class,
  exercise5.SongTest.class,
  exercise5.ChartTest.class,
  exercise5.StudentTest.class,
  exercise5.RosterTest.class
})
public class Exercise5TestSuite {

  @BeforeClass
  public static void setUpClass() throws Exception {
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }
  
}
