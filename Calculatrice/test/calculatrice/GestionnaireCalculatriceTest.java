/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

import calculatrice.Exceptions.ExceptionFloatExpected;
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
public class GestionnaireCalculatriceTest {
            GestionnaireCalculatrice instance = new GestionnaireCalculatrice();

    
    public GestionnaireCalculatriceTest() {
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
     * Test of readFloat method, of class GestionnaireCalculatrice.
     */
    @Test (expected = ExceptionFloatExpected.class)
    public void testReadFloat() {
        System.out.println("readFloat expected");
        float result = instance.readFloat();
    }

    /**
     * Test of readString method, of class GestionnaireCalculatrice.
     */
    @Test
    public void testReadString() {
        System.out.println("readString");
        String expResult = "";
        String result = instance.readString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
