import java.time.LocalDate;

public class Main {
    public static void showLeapYear(int leapYear) {
        if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
            System.out.println(leapYear + " год - високосный год");
        } else {
            System.out.println(leapYear + " год - не високосный год");
        }
    }

    public static void printVersionForOS (int clientOS, int year) {
        if (clientOS == 0 && year >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && year >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Некорректные данные");
        }
    }

    public static int printDeliveryDays (int distance) {
        int days = 0;
        if (distance <= 20) {
            days = 1;
        } else if (distance > 20 && distance <= 60) {
            days = 2;
        } else if (distance > 60 && distance <= 100) {
            days = 3;
        }
        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставка не осуществляется");
        }
        return days;
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        int year = 2021;
        showLeapYear(year);
    }

    public static void task2() {
        int currentYear = LocalDate.now().getYear();
        int nameOS = 0;
        printVersionForOS(nameOS, currentYear);
    }


    public static void task3() {
        int deliveryDistance = 35;
        printDeliveryDays(deliveryDistance);
    }
}