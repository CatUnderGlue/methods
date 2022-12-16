import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        checkForLeapYear(2020);

        System.out.println("Задача 2");
        int currentYear = LocalDate.now().getYear();
        checkOSAndYear(0, currentYear);

        System.out.println("Задача 3");
        System.out.printf("Потребуется дней: %d", calculateDeliveryTime(120));

    }

    // Task 1
    public static void checkForLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }


    // Task 2
    public static void checkOSAndYear(int os, int year) {
        switch (os) {
            case 0:
                if (year < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (year < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("Не удалось распознать вашу операционную систему");
        }
    }

    // Task 3
    public static int calculateDeliveryTime(int distance) {
        int deliveryStep = 40;
        int deliveryTime = 0;
        if (distance <= 20) {
            deliveryTime = 1;
        } else {
            distance -= 20;
            if (distance / deliveryStep == 0) {
                deliveryTime += 2;
            } else {
                deliveryTime += distance / deliveryStep + 2;
            }
        }
        return deliveryTime;
    }
}