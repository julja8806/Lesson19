package by.itstep.julja8806.model;

public class ArrayWorker {
    public static int max(int[] array) {
        if ( array == null || array.length == 0) {
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

}
