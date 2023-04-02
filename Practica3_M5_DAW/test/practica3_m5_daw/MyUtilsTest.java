/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3_m5_daw;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Moha
 */
public class MyUtilsTest {

    public MyUtilsTest() {
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
     * Test of inverteix method, of class MyUtils.
     */
    @Test
    public void testInverteix() {
        System.out.println("inverteix");
        String cadena = "Moha";
        String expResult = "ahoM";
        String result = MyUtils.inverteix(cadena);
        assertEquals(expResult, result);
        //TEST2
        String cadena2 = null;
        String expResult2 = null;
        String result2 = MyUtils.inverteix(cadena2);
        assertEquals(expResult2, result2);
        //TEST3
        String cadena3 = "Hola mundo";
        String expResult3 = "odnum aloH";
        String result3 = MyUtils.inverteix(cadena3);
        assertEquals(expResult3, result3);
        //TEST4
        String cadena4 = "null";
        String expResult4 = "llun";
        String result4 = MyUtils.inverteix(cadena4);
        assertEquals(expResult4, result4);
    }

    /**
     * Test of edat method, of class MyUtils.
     */
    @Test
    public void testEdat() {
        System.out.println("edat");
        int day = 15;
        int month = 1;
        int year = 2020;
        int expResult = 3;
        int result = MyUtils.edat(day, month, year);
        assertEquals(expResult, result);
        //TEST2
        int day2 = 15;
        int month2 = 1;
        int year2 = 1700;
        int expResult2 = -1;
        int result2 = MyUtils.edat(day2, month2, year2);
        assertEquals(expResult2, result2);
        //TEST3
        int day3 = 15;
        int month3 = 1;
        int year3 = 2045;
        int expResult3 = -2;
        int result3 = MyUtils.edat(day3, month3, year3);
        assertEquals(expResult3, result3);
    }

    /**
     * Test of factorial method, of class MyUtils.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        double numero = -1.0;
        double expResult = -1;
        double result = MyUtils.factorial(numero);
        assertEquals(expResult, result, 0.0);
        // TEST2
        double numero2 = 6.0;
        double expResult2 = 720;
        double result2 = MyUtils.factorial(numero2);
        assertEquals(expResult2, result2, 0.0);
        // TEST3
        double numero3 = 10.0;
        double expResult3 = 3628800;
        double result3 = MyUtils.factorial(numero3);
        assertEquals(expResult3, result3, 0.0);

    }

}
