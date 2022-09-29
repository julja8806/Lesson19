package by.itstep.julja8806.model.logic;

public class StudentManager {
    public static final int STUDENT_COUNT = 5;


    public static double calcAvgStudentMark(int[] marks) {

        double s = 0;
        for (int i = 0; i < marks.length; i++) {
            s += marks[i];
        }

        return s / marks.length;

    }
}
