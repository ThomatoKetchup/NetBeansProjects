/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

import calculatrice.Exceptions.ExceptionDivisionParZero;
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
public class DivisionTest {
    Division instance = new Division();
    float normal = 5.2F;
    float grand = 20.0F;
    float fgrand = 320000.12F;
    float negative = -15.4F;

    public DivisionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Start Division test");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("End division test");
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

        @Test
    public void testExecute() throws ExceptionDivisionParZero  {
        System.out.println("Test division normal");
        float v1 = normal;
        float v2 = normal;
        float expResult = v1/v2;
        float result = instance.execute(v1,v2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testExecuteNegative() throws ExceptionDivisionParZero {
        System.out.println("Test division Negative");
        float v1 = normal;
        float v2 = negative;
        float expResult = v1/v2;
        float result = instance.execute(v1, v2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testExecuteGrand() throws ExceptionDivisionParZero {
        System.out.println("Test division grand");
        float v1 = normal;
        float v2 = fgrand;
        float expResult = v1+v2;
        float result = instance.execute(v1, v2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test (expected = ExceptionDivisionParZero.class)
    public void executeDivisionParZero() throws Exception {
        System.out.println("Division par zero");
        float v1 = 23.0F;
        float v2 = 0.0F;
        float result = instance.execute(v1, v2);
    }
    
}
