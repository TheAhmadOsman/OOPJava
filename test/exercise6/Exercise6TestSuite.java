package exercise6;

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
  exercise6.CrowMurderTest.class,
  exercise6.FrogArmyTest.class,
  exercise6.KangarooMobTest.class,
  exercise6.LemurConspiracyTest.class,
  exercise6.OwlParliamentTest.class
})
public class Exercise6TestSuite {

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
