public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        int clientOS = 0;
        if (clientDeviceYear <= 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("високосный");
            }
        } else {
            System.out.println(" Не високосный");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int days = 1;
        if (deliveryDistance < 20) {
            System.out.println("Доставка в пределах 20 км занимает сутки");
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка в пределах от 20 км до 60 км занимает " + (days + 1) + " дня");
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка в пределах 60 км до 100 км добавляет " + (days + 2) + " дня");
        }
        if (deliveryDistance > 100) {
            System.out.println("Свыше 100 км доставки нет");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 6;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
        }
    }
}