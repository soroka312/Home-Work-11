public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println();
        System.out.println("Задача 1");
        System.out.println();

        int year = 2021;

        if (leapYear(year)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //Task 2
        System.out.println();
        System.out.println("Задача 2");
        System.out.println();

        versionRecommendation(0, 2015);
        versionRecommendation(1, 2010);

        //Task 3
        System.out.println();
        System.out.println("Задача 3");
        System.out.println();

        int distance = 10;
        int days = deliveryDistance(distance);

        if (days >= 0) {
            System.out.println("Потребуется дней " + days);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }

    }

    static boolean leapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    static void versionRecommendation(int clientOS, int clientDeviceYear) {

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Ошибка");
        }
    }

    static int deliveryDistance(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
}
