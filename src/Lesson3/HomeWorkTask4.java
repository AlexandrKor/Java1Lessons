package Lesson3;

import java.util.Arrays;

public class HomeWorkTask4 {
    public static void main(String[] args) {
        int[][] square = new int[5][5];
        for (int i = 0; i < square.length; i++) {
            int[] line = square[i];
            for (int gb = 0; gb < line.length; gb++) {
                if (i == gb) {
                    square[i][gb] = 1;
                }
            }
            System.out.println(Arrays.toString(line));
        }
    }
}
