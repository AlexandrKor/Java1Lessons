package Lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        printNumberStatus(17); /*написал, чтобы проверить себя, как понял к задаче это никакого отношения не имеет*/
        printText("Привет, Мир!", 5);
        System.out.println(yearType(1900));
    }

    private static boolean amountWithin(int x, int y) {
        int sum = x + y;
        return sum >= 10 && sum <= 20;
    }

    private static void printNumberStatus(int x) {
        if (x >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    private static boolean negativeNumber(int x) {
        return x < 0;
    }

    private static void printText(String str, int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(str);
        }
    }

    private static boolean yearType(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
