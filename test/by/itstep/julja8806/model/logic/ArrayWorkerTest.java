package by.itstep.julja8806.model.logic;

import by.itstep.julja8806.model.ArrayWorker;
import org.junit.Test;


import static org.junit.Assert.*;

public class ArrayWorkerTest {
    @Test
    public void testMaxPositive(){
        int [] array = {2, 5, 8, 7, 6};
        int expected = 8;
        int actual = ArrayWorker.max(array);
        assertEquals(expected, actual);
    }
    @Test(expected = RuntimeException.class)
    public void testMaxWithEmptyObject() {
        int[] array = {};

        ArrayWorker.max(array);
    }
    @Test(expected = RuntimeException.class)
    public void testMaxWithNull(){

         ArrayWorker.max(null);

    }
    @Test
    public void testMinPositive(){
        int [] array = {2, 5, 8, 7, 6};
        int expected = 2;
        int actual = ArrayWorker.min(array);
        assertEquals(expected, actual);
    }
    @Test(expected = RuntimeException.class)
    public void testMinWithEmptyObject() {
        int[] array = {};

        ArrayWorker.max(array);
    }
    @Test(expected = RuntimeException.class)
    public void testMinWithNull(){

        ArrayWorker.max(null);

    }
    @Test
    public void testAveragePositive(){
        int [] array = {2, 5, 8, 7, 6};
        double expected = 5.60;
        double actual = ArrayWorker.avg(array);
        assertEquals(expected, actual, 0.001);
    }
    @Test(expected = RuntimeException.class)
    public void testAverageWithEmptyObject() {
        int[] array = {};

        ArrayWorker.avg(array);
    }
    @Test(expected = RuntimeException.class)
    public void testAverageWithNull(){

        ArrayWorker.avg(null);

    }
    @Test
    public void testGeometricAvgPositive(){
        int [] array = {2, 5, 8};
        double expected = 4.30;
        double actual = ArrayWorker.geometricAvg(array);
        assertEquals(expected, actual, 0.001);
    }
    @Test(expected = RuntimeException.class)
    public void testGeometricAvgWithEmptyObject() {
        int[] array = {};

        ArrayWorker.geometricAvg(array);
    }
    @Test(expected = RuntimeException.class)
    public void testGeometricAvgWithNull(){

        ArrayWorker.geometricAvg(null);

    }
}
