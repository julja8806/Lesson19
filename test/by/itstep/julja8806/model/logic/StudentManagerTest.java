package by.itstep.julja8806.model.logic;

import static org.junit.Assert. *;
import org.junit.Test;

public class StudentManagerTest {
    @Test
    public void testMarks() {

        int[] marks = {8, 9, 5, 6, 7, 9, 10, 7, 6, 9};

        double expected = 7.60;


        double actual = StudentManager.calcAvgStudentMark(marks);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testMarksWithEmptyObject() {

        int[] marks = {};

        double expected = -1;


        double actual = StudentManager.calcAvgStudentMark(marks);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testMarksWithNull() {

        int[] marks = null;

        double expected = -1;


        double actual = StudentManager.calcAvgStudentMark(null);
        assertEquals(expected, actual, 0);
    }

}