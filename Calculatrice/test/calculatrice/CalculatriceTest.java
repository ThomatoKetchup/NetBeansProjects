/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

import calculatrice.Exceptions.ExceptionOperationExistante;
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
public class CalculatriceTest {
            Calculatrice instance = new Calculatrice();

    
    public CalculatriceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("test calculatrice start");
    }
    
    @AfterClass
    public static void tearDownClass() {
                System.out.println("test calculatrice end");

    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of init method, of class Calculatrice.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        float v1 = 23F;
        float v2 = 2F;
        String op = "+";
        instance.init(v1, v2, op);
    }

    /**
     * Test of addOperation method, of class Calculatrice.
     */
    @Test
    public void testAddOperation() throws Exception {
        System.out.println("addOperation factoriel");
        String sym = "f";
        Operation op = null;
        Calculatrice instance = new Calculatrice();
        instance.addOperation(sym, op);

    }
    
     @Test(expected = ExceptionOperationExistante.class)
    public void testAddOperationExisting() throws Exception {
        System.out.println("addOperation existante");
        String sym = "*";
        Operation op = new Multiplication();
        instance.addOperation(sym, op);

    }

    /**
     * Test of calculer method, of class Calculatrice.
     */
    @Test
    public void testCalculer() throws Exception {
        System.out.println("calculer");
        Calculatrice instance = new Calculatrice();
        float expResult = 0.0F;
        float result = instance.calculer();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
