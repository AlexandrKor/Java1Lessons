package Lesson3;

public class HomeWorkTask6 {
    public static void main(String[] args) {
        int[] number = {15, 11, 24, 7, 13, 19};
        int min = number[0];
        int max = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }
            if (number[i] > max) {
                max = number[i];
            }
        }
        System.out.println("Min элемент в массиве = " + min);
        System.out.println("Max элемент в массиве = " + max);
    }
}
