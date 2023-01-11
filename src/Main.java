public class Main {
    public static void main(String[] args) {
        task1();
        // task2();
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
}
