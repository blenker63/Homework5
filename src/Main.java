public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte clientOS = 1;
        if (clientOS ==0) {
            System.out.println("Установите версию приложения для iOS");
        } else {
            System.out.println("Установите версию приложения для Android");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviseYear = 2013;
        if (clientDeviseYear >=2015) {
            if ( clientOS == 0) {
                System.out.println("Установите версию приложения для iOS");
            } else {
                System.out.println("Установите версию для Android");
            }
            } else if (clientDeviseYear < 2015) {
        if (clientOS ==0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
                System.out.println("установите облегченную версию приложения для Android  по ссылке");
            }
                }
            }
        }

