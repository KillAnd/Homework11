import java.time.LocalDate;

public class Main {

    public static void determineTheYear(int year) {
       if (year >= 1584 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
           System.out.println(year + " Год является високосным");
       } else {
           System.out.println(year + " Год не является високосным");
       }
    }

    public static void installTheOs(int clientOs, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOs == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
        if (clientOs == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void main(String[] args) {

        //task 1
        System.out.println("Task 1");
        determineTheYear(2000);
        determineTheYear(1385);
        determineTheYear(1997);

        //task 2
        System.out.println("Task 2");
        installTheOs(1, 2024);
        }
    }
