/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import arraysum.Arraysum;
/**
 *
 * @author Adison
 */
public class Arraysum1 {
    
    public Arraysum1() {
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

  @Test
    public void testMatch() {
        int[] inputArray = {2, 3, 4, 5,6};
        int targetSum = 5;

        int actualSum = Arraysum.sumMatch(inputArray, targetSum);
        assertEquals(5, actualSum);
    }

    @Test
    public void testMultiMatch() {
        int[] inputArray = {1, 5, 5, 2, 3};
        int targetSum = 5;

        int actualSum = Arraysum.sumMatch(inputArray, targetSum);
        assertEquals(10, actualSum);
    }

    @Test
    public void testNoMatch() {
        int[] inputArray = {1, 2, 3, 4, 6};
        int targetSum = 5;

        int actualSum = Arraysum.sumMatch(inputArray, targetSum);
        assertEquals(0, actualSum);
    }

    @Test
    public void testEmpArray() {
        int[] inputArray = {};
        int targetSum = 5;

        int actualSum = Arraysum.sumMatch(inputArray, targetSum);
        assertEquals(0, actualSum);
    }
}


