package Lesson3;

import java.util.Arrays;

public class HomeWorkTask5 {
    public static void main(String[] args) {
        app(initArray(4, 4));
    }

    private static int[] initArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void app(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}

