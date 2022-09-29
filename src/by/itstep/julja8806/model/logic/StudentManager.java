package by.itstep.julja8806.model.logic;

public class StudentManager {
    public static final int STUDENT_COUNT = 5;


    public static double calcAvgStudentMark(int[] marks) {
if ( marks == null || marks.length == 0 ) {
    return -1;
}
        double s = 0;
        for (int i = 0; i < marks.length; i++) {
            s += marks[i];
        }

        return s / marks.length;

    }
}
