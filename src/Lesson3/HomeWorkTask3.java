package Lesson3;

import java.util.Arrays;

public class HomeWorkTask3 {
    public static void main(String[] args) {
        int[] multiplication = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int GB = 0; GB < multiplication.length; GB++) {
            if (multiplication[GB] < 6) {
                multiplication[GB] *= 2;
            }
        }
        System.out.println(Arrays.toString(multiplication));
    }
}
