package Lesson3;

import java.util.Arrays;

public class HomeWorkTask1 {
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
    }
}
