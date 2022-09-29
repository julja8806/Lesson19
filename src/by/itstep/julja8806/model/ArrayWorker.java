package by.itstep.julja8806.model;

public class ArrayWorker {
    public static int max(int[] array) {
        if (array == null || array.length == 0) {
            throw new RuntimeException();
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        if (array == null || array.length == 0) {
            throw new RuntimeException();
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    public static double avg(int[] array) {
        if (array == null || array.length == 0) {
            throw new RuntimeException();
        }
        double s = 0;
        for (int i = 0; i < array.length; i++) {
            s += array[i];
        }

        return s / array.length;

    }
    public static double geometricAvg(int[] array) {
        if (array == null || array.length == 0) {
            throw new RuntimeException();
        }
        double s = 1;
        for (int i = 0; i < array.length; i++) {
            s *= array[i];
        }

        return Math.cbrt(s);

    }
}