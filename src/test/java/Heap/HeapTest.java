package Heap;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

public class HeapTest {
    
    public HeapTest() {
    }

    @Test
    public void testGetSorted() {
        System.out.println("getSorted");
        Heap instance = new Heap();
        Integer[] x = {1,3,2,4,6,5,8,7,9,0,-1,45,15,55,14};
        instance.addAll(x);
        Integer[] expResult = {55,45,15,14,9,8,7,6,5,4,3,2,1,0,-1};
        Comparable[] result = instance.getSorted();
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testAddAll() {
        System.out.println("addAll");
        Comparable[] x = {'a','b','c','d'};
        Heap instance = new Heap();
        instance.addAll(x);
        String result = Arrays.toString(instance.getSorted());
        String expResult = "[d, c, b, a]";
        assertEquals(expResult, result);
    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        String x = "some";
        Heap instance = new Heap();
        instance.insert(x);
        String result = instance.toString();
        String expResult = "some ";
        assertEquals(expResult, result);
    }

    @Test
    public void testSize() {
        System.out.println("size");
        Integer[] x = {1,2,3};
        Heap instance = new Heap(x);        
        int expResult = 3;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    @Test
    public void testIsNotEmpty() {
        System.out.println("isNotEmpty");
        Heap instance = new Heap("some");
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Heap instance = new Heap();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    @Test
    public void testPeek() {
        System.out.println("peek");
        Integer[] x = {1,2,3};
        Heap instance = new Heap(x);
        Object expResult = 3;
        instance.peek();
        Object result = instance.peek();
        assertEquals(expResult, result);
    }

    @Test
    public void testRemove() {
        System.out.println("remove");
        Integer[] x = {1,2,3};
        Heap instance = new Heap(x);
        Object expResult = 2;
        instance.remove();
        Object result = instance.remove();
        assertEquals(expResult, result);
    }

    @Test
    public void testClear() {
        System.out.println("clear");
        Integer[] x = {1,2,3};
        Heap instance = new Heap(x);
        instance.clear();
        Object expResult = null;
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Integer[] x = {1,2,3};
        Heap instance = new Heap(x);
        String expResult = "3 1 2 ";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
