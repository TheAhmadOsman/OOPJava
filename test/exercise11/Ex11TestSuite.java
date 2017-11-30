package exercise11;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
  * @author yasiro01
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
  exercise11.Ex11LogicTest.class,
  exercise11.FooTest.class
})
public class Ex11TestSuite {

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
