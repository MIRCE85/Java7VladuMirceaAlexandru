/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicleta;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vladu
 */
public class BicycleTest {
    
    public BicycleTest() {
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
     * Test of changeCadence method, of class Bicycle.
     */
    @Test
    public void testChangeCadence() {
        System.out.println("changeCadence");
        int newValue = 7;
        Bicycle instance = new Bicycle();
        instance.changeCadence(newValue);
       
        int expResult = 7;
        int result = instance.cadence;
                assertEquals(expResult, result, 0.0);

// TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of changeGear method, of class Bicycle.
     */
    @Test
    public void testChangeGear() {
        System.out.println("changeGear");
        int newValue = 2;
        Bicycle instance = new Bicycle();
        int expResult = 43434;
             
        instance.changeGear(newValue);
          int result = instance.gear;
       assertEquals(expResult, result, 0.0);
          
// TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of speedUp method, of class Bicycle.
     */
    @Test
    public void testSpeedUp() {
        System.out.println("speedUp");
        int increment = 2;
        Bicycle instance = new Bicycle(1,1,1);
        instance.speedUp(increment);
      
      //int expResult = 4;
     int expResult = 3;
      int result  = instance.speed;
      
        assertEquals(expResult, result, 0.0);
        
       

// TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of applyBrakes method, of class Bicycle.
     */
    @Test
    public void testApplyBrakes() {
        System.out.println("applyBrakes");
        int decrement = 1;
        Bicycle instance = new Bicycle(1,1,1);
        instance.applyBrakes(decrement);
        int expResult =0;
        int result = instance.speed;
        assertEquals(expResult,result,0.00);


// TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of printStates method, of class Bicycle.
     */
    @Test
    public void testPrintStates() {
        System.out.println("printStates");
        Bicycle instance = new Bicycle();
        instance.printStates();

        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    
    }
    
}
