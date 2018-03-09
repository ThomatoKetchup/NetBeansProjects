/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nguye
 */
public class AdditionTest {
    Addition instance = new Addition();
    float normal = 5.2F;
    float grand = 20.0F;
    float fgrand = 320000.12F;
    float negative = -15.4F;

    
    public AdditionTest() {
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
     * Test of execute method, of class Addition.
     */
    @Test
    public void testExecute() {
        System.out.println("Test addition normal");
        float v1 = normal;
        float v2 = normal;
        float expResult = v1+v2;
        float result = instance.execute(v1, v2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testExecuteNegative() {
        System.out.println("Test additionn Negative");
        float v1 = normal;
        float v2 = negative;
        float expResult = v1+v2;
        float result = instance.execute(v1, v2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testExecuteGrand() {
        System.out.println("Test addition grand");
        float v1 = fgrand;
        float v2 = fgrand;
        float expResult = v1+v2;
        float result = instance.execute(v1, v2);
        assertEquals(expResult, result, 0.0);
    }
    
}
