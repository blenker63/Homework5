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
        byte clientOS = 1; //инициализация признака операционной системы телефона, 0 - iOS,  1 - Android
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS");
        } else {
            System.out.println("Установите версию приложения для Android");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0; //инициализация признака операционной системы телефона, 0 - iOS,  1 - Android
        int clientDeviseYear = 2013; //инициализация года выпуска телефона телефона
        if (clientDeviseYear >= 2015) { // выбор версии приложения, для телефонов ранее 2013 - облегченная, 2013 и позже - обычная
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS");
            } else {
                System.out.println("Установите версию для Android");
            }
        } else if (clientDeviseYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("установите облегченную версию приложения для Android  по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2024; //инициализация значения года для проверки
        int signOfLeapYear1 = 4; //инициализация признака високосный год - каждые 4 года
        int signOfLeapYear2 = 400; //инициализация признака високосный год - каждые 400 лет
        int signOfLeapYearNon = 100; //инициализация признака не високосный год - каждые 100 лет
        float multiplicityYear4 = (float) year / signOfLeapYear1; // определение кратности года 4
        float multiplicityYear400 = (float) year / signOfLeapYear2; //определение кратности года 400
        float multiplicityYear100 = (float) year / signOfLeapYearNon; // определение кратности года 100
        if (multiplicityYear400 % 1 == 0) { // Если кратно 400 то год високосный
            System.out.println(year + " год является високосным");
        } else if (multiplicityYear100 % 1 == 0) { // Если кратно 100 год не високосный, исключения года кратные 400
            System.out.println(year + "  год не является високосным");
        } else if (multiplicityYear4 % 1 == 0) { // Если кратно 4 год високосный за исключение годам кратным 100
            System.out.println(year + "  год  является високосным");
        } else {
            System.out.println(year + "  год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95; // инициализация расстояния от офиса до адреса доставки
        int deliveryOneDay = 20; //инициализация расстояния для доставки за 1 день до 20 км
        int deliveryTwoDay = 60; //инициализация расстояния для доставки за 2 дня от 20 до 60 км
        int deliveryThreeDay = 100; //инициализация расстояния для доставки за 3 дня от 60 до 100 км
        if (deliveryDistance <= deliveryOneDay) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance <= deliveryTwoDay) {
            System.out.println("Потребуется дней: " + 2);
        } else if (deliveryDistance <= deliveryThreeDay) {
            System.out.println("Потребуется дней: " + 3);
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte monthNumber = 13; //инициализация номера месяца от 1 до 12
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону осень");
                break;
            default:
                if (monthNumber<1 || monthNumber >12)
                System.out.println(monthNumber + "-й такого месяца не существует");
        }
    }
}

