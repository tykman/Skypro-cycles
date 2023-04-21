public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }

        System.out.println("Задача 2");

        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }

        System.out.println("Задача 3");

        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("Задача 4");

        for (int i = 10; i > -10; i = i - 1) {
            System.out.println(i);
        }

        System.out.println("Задача 5");

        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + "год является високосным");
        }

        System.out.println("Задача 6");

        for (int i = 7; i < 98; i = i + 7) {
            System.out.println(i);
        }

        System.out.println("Задача 7");

        for (int i = 1; i < 512; i = i * 2) {
            System.out.println(i);
        }

        System.out.println("Задача 8");

        int glassJarMoney = 29000;
        for (int i=0; i < 12; i++) {
            System.out.println("Месяц" + i + ", сумма накоплений равна" + glassJarMoney + "рублей");
        }

        System.out.println("Задача 9");

        int deposit = 29000;
        double total = 0;

        int depositPercent = deposit + 290;
        int totalWithPenny = 0;
        for (int i = 1; i < 12; i++) {
             totalWithPenny = totalWithPenny + totalWithPenny / 100;
             totalWithPenny = totalWithPenny + depositPercent;
             total = totalWithPenny / 100;
             System.out.println("Месяц" + i + ",сумма накоплений равна" + totalWithPenny + "рублей");
        }
        System.out.println(total);

        System.out.println("Задача 10");

        int two = 2;
        for (int i = 1; i <= 10; i = i+1) {
            System.out.println(i+"*"+two+"="+(i*2));
        }

    }
}