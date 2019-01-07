/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 * @author Ahmad M. Osman - Original template by Dr. Roman
 * @assignment Week 3: Exercise 4
 * 
 */
public class Ex4DriverTest {
  
  public Ex4DriverTest() {
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
     * Test of task1 method, of class Ex4Driver.
     */
    @Test
    public void testTask1() {
        // This function returns the Integer passed to it
        System.out.println("task1");
        Integer n = 1;
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 1;
        Integer result = instance.task1(n);
        assertEquals(expResult, result);
        n = 4;
        expResult = 4;
        result = instance.task1(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of task2 method, of class Ex4Driver.
     */
    @Test
    public void testTask2() {
        // This function returns the length of the string
        System.out.println("task2");
        String s = "Ahmad";
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 5;
        Integer result = instance.task2(s);
        assertEquals(expResult, result);
        s = "Michael";
        expResult = 7;
        result = instance.task2(s);
        assertEquals(expResult, result);
    }

    /**
     * Test of task3 method, of class Ex4Driver.
     */
    @Test
    public void testTask3() {
        // This function returns the ASCII code of the character
        System.out.println("task3");
        Character c = 'A';
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 65;
        Integer result = instance.task3(c);
        assertEquals(expResult, result);
        c = 'a';
        expResult = 97;
        result = instance.task3(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of task4 method, of class Ex4Driver.
     */
    @Test
    public void testTask4() {
        // This function return the first character of a string
        System.out.println("task4");
        String s = "Roman";
        Ex4Driver instance = new Ex4Driver();
        Character expResult = 'R';
        Character result = instance.task4(s);
        assertEquals(expResult, result);
        s = "almighty";
        expResult = 'a';
        result = instance.task4(s);
        assertEquals(expResult, result);
    }

    /**
     * Test of task5 method, of class Ex4Driver.
     */
    @Test
    public void testTask5() {
        // This function returns the sum of the two integers passed as a parameter
        System.out.println("task5");
        Integer i = 5;
        Integer j = 7;
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 12;
        Integer result = instance.task5(i, j);
        assertEquals(expResult, result);
        i = 90;
        j = 5;
        expResult = 95;
        result = instance.task5(i, j);
        assertEquals(expResult, result);
    }

    /**
     * Test of task6 method, of class Ex4Driver.
     */
    @Test
    public void testTask6() {
        // This function returns the character at index 'n' in string 's'
        System.out.println("task6");
        String s = "Ahmad M. Osman";
        Integer n = 7-1;
        Ex4Driver instance = new Ex4Driver();
        Character expResult = 'M';
        Character result = instance.task6(s, n);
        assertEquals(expResult, result);
        s = "Ethereum Blockchain";
        n = 16-1;
        expResult = 'h';
        result = instance.task6(s, n);
        assertEquals(expResult, result);
    }

    /**
     * Test of task7 method, of class Ex4Driver.
     */
    @Test
    public void testTask7() {
        // This function returns the length of the array 'arr'
        System.out.println("task7");
        Integer[] arr = new Integer[10];
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 10;
        Integer result = instance.task7(arr);
        assertEquals(expResult, result);
        arr = new Integer[15];
        expResult = 15;
        result = instance.task7(arr);
        assertEquals(expResult, result);
    }

    /**
     * Test of task8 method, of class Ex4Driver.
     */
    @Test
    public void testTask8() {
        // This function returns true if the length of the array 'arr' is equal to 'n' and returns false otherwise
        System.out.println("task8");
        Integer[] arr = new Integer[15];
        Integer n = 15;
        Ex4Driver instance = new Ex4Driver();
        Boolean expResult = true;
        Boolean result = instance.task8(arr, n);
        assertEquals(expResult, result);
        arr = new Integer[12];
        n = 13;
        expResult = false;
        result = instance.task8(arr, n);
        assertEquals(expResult, result);
    }

    /**
     * Test of task9 method, of class Ex4Driver.
     */
    @Test
    public void testTask9() {
        // This function returns the length of the ArrayList
        System.out.println("task9");
        ArrayList<String> arrlst = new ArrayList<String>();
        arrlst.add("One");
        arrlst.add("Two");
        arrlst.add("Three");
        arrlst.add("Four");
        arrlst.add("Five");
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 5;
        Integer result = instance.task9(arrlst);
        assertEquals(expResult, result);
        arrlst = new ArrayList<String>();
        arrlst.add("1");
        arrlst.add("2");
        arrlst.add("3");
        expResult = 3;
        result = instance.task9(arrlst);
        assertEquals(expResult, result);
    }

    /**
     * Test of task10 method, of class Ex4Driver.
     */
    @Test
    public void testTask10() {
        // This function returns the size of the HashMap
        System.out.println("task10");
        HashMap<Integer, String> map = new HashMap<>();
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 0;
        Integer result = instance.task10(map);
        assertEquals(expResult, result);
        map.put(1, "Failed");
        map.put(2, "Really?");
        map.put(3, "Well, at least you worked for it..");
        map.put(4, "GREAT JOB!");
        expResult = 4;
        result = instance.task10(map);
        assertEquals(expResult, result);
    }

}
