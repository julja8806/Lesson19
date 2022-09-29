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
        int[] array = {};
         ArrayWorker.max(array);

    }


}
