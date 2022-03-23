package Lesson3;

import java.util.Arrays;

public class HomeWorkTask1_2_3 {
    public static void main(String[] args) {
        int[] oneZero = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < oneZero.length; i++) {
            if (oneZero[i] == 1) {
                oneZero[i] = 0;
            } else if (oneZero[i] == 0) {
                oneZero[i] = 1;
            }
        }
        System.out.println(Arrays.toString(oneZero)); /*проверка работы кода*/

        int[] lengthOneHundred = new int[100];
        for (int i = 0; i < lengthOneHundred.length; i++) {
            lengthOneHundred[i] = i + 1;
        }
        System.out.println(Arrays.toString(lengthOneHundred)); /*проверка работы кода*/

        int[] multiplication = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int GB = 0; GB < multiplication.length; GB++) {
            if (multiplication[GB] < 6) {
                multiplication[GB] *= 2;
            }
        }
        System.out.println(Arrays.toString(multiplication));
    }
}


