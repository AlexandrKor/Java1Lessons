package Lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWord();
        System.out.println("----------Задание 1 Выполнено----------");
        checkSumSign();
        System.out.println("----------Задание 2 Выполнено----------");
        printColor();
        System.out.println("----------Задание 3 Выполнено----------");
        compareNumbers();
        System.out.println("----------Задание 4 Выполнено----------");
    }

    public static void printThreeWord() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 20;
        int b = 50;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = -101;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 & value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 23;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

}
