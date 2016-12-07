/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import dotcom.TemperatureConverter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stud
 */
public class TemperatureConverterTest {
    
    public TemperatureConverterTest() {
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
     * Test of convertTemp method, of class TemperatureConverter.
     */
    @Test
    public void testConvertTemp() {
        System.out.println("convertTemp");
        int temperature = 0;
        char convertTo = ' ';
        TemperatureConverter instance = new TemperatureConverter();
        String expResult = "";
        String result = instance.convertTemp(temperature, convertTo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
