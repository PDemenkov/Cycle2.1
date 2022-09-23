public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int deposit = 15000;
        int total = 0;
        int m =0;
        while (total <= 2_459_000) {
            total = total + deposit;
            m++;
            System.out.println("Месяц " + m + " , сумма накоплений равна " + total + " рублей" );
        }
        System.out.println("Задача 2");
        int num = 1;
        while (num <= 10) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
        for (num = 10; num >= 1; num--) {
            System.out.print(num + " ");
        }

        System.out.println("Задача 3");
        int population = 12_000_000;
        int childBirth =17;
        int deathRate =8;
        int p = 1000;
        for (int y = 1; y <= 10; y++) {
         population =population + population/p*childBirth - population/p*deathRate;
            System.out.println("Год " + y + " численность населения составляет " + population);
        }
    }
}