/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author stud
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Testing.SimpleDotComTest.class, Testing.TesterTest.class, Testing.GameHelperTest.class, Testing.TemperatureDemoTest.class, Testing.OrangeTest.class, Testing.TemperatureConverterTest.class, Testing.SimpleDotComTestDriveTest.class, Testing.DotComTest.class, Testing.DotComBustTest.class})
public class TestingSuite {

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
