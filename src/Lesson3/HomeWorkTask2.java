package Lesson3;

import java.util.Arrays;

public class HomeWorkTask2 {
    public static void main(String[] args) {
        int[] lengthOneHundred = new int[100];
        for (int i = 0; i < lengthOneHundred.length; i++) {
            lengthOneHundred[i] = i + 1;
        }
        System.out.println(Arrays.toString(lengthOneHundred)); /*проверка работы кода*/
    }
}
