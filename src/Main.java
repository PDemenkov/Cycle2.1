public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int deposit = 15000;
        int month = 0;
        while (deposit <= 12000000) {
            deposit = deposit + deposit / 100 * 7;
            month++;
            System.out.println("Месяц " + month + " , депозит равен " + deposit);
        }

        System.out.println("Задание 2");
        int deposit1 = 15000;
        int month1 = 0;
        while (deposit1 <= 12000000) {
            deposit1 = deposit1 + deposit1 / 100 * 7;
            month1++;
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + " , депозит равен " + deposit1);
            }
        }

                System.out.println("Задание 3");
                int deposit2 = 15000;
                for (int i = 1; i <= 108; i++) {
                    deposit2 = deposit2 + deposit2 / 100 * 7;
                    if (i % 6 == 0) {
                        System.out.println("Месяц " + i + " , накоплено " + deposit2);
                    }
                }

        System.out.println("Задание 4");
        int friday = 2;
        for (int i = 1; i <= 31; i++) {
            if (i == friday) {
                System.out.println("Сегодня пятница,  "+friday + "-е число. Необходимо подготовить отчет");
                friday+=7;
            }
        }
    }
    }
