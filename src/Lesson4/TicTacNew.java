package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacNew {
    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static boolean checkWin(char symb) {
        if (checkLins(symb)) {
            return true;
        } else {
            return checkDiagonals(symb);
        }
    }

    public static boolean checkLins(char symb) {
        for (int i = 0; i < SIZE; i++) {
            int line = 0;
            int column = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) {
                    line = line + 1;
                } else {
                    line = 0;
                }
                if (map[j][i] == symb) {
                    column = column + 1;
                } else {
                    column = 0;
                }
                if (line == DOTS_TO_WIN || column == DOTS_TO_WIN) return true;
            }
        }
        return false;
    }

    public static boolean checkDiagonals(char symb) {
        int diagonalLeftRight = 0;
        int diagonalRightLeft = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == symb) {
                diagonalLeftRight = diagonalLeftRight + 1;
            }
            if (map[i][map.length - 1 - i] == symb) {
                diagonalRightLeft = diagonalRightLeft + 1;
                if (diagonalLeftRight == DOTS_TO_WIN || diagonalRightLeft == DOTS_TO_WIN) return true;
            }
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
