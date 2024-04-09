public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int target = 0;
        int month = 0;
        double targetInBank = 0;
        while (target < 2_459_000) {
            target += 15000;
            month++;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + target + " рублей");
        month = 0;
        while (targetInBank < 2_459_000) {
            targetInBank = (targetInBank + 15000) * 1.01;
            month++;
        } //здесь даже проще выводить помесячно, чем сразу итог, пришлось сделать два перебора
        System.out.println("На вкладе под 12% годовых: Месяц " + month + ", сумма накоплений равна " + (int) targetInBank + " рублей");
        month = 0;

        //Задача 2
        System.out.println("\nЗадача 2");
        int i = 0;
        while (i != 10) {
            i++;
            System.out.print(i + " ");
        }
        i = 0;
        System.out.println("");
        for (; i < 10; i++) {
            System.out.print(10 - i + " ");
        }

        //Задача 3
        System.out.println("\n\nЗадача 3");
        int population = 12_000_000;
        int year = 0;
        while (year != 10) {
            int deathRatePer1000 = population / 1000 * 8;
            int birthRatePer1000 = population / 1000 * 17;
            population = population - deathRatePer1000 + birthRatePer1000;
            year++;
        }
        System.out.println("Через 10 лет численность населения составит " + population + " человек");

        //Задача 4
        System.out.println("\nЗадача 4");
        double deposit = 15000;
        while (deposit < 12_000_000) {
            deposit = deposit + deposit * 0.07;
            month++;
        }
        deposit = 15000;
        System.out.println("Чтобы Василий смог накопить 12млн рублей с 15 тысяч под 7% ежемесячно потребуется " + month + " месяцев");
        System.out.println("Вклад открыт с суммы 15000 рублей");
        System.out.println("Вот подробный отчёт по месяцам:\n");
        for (i = 1; i < month + 1; i++) {
            deposit = deposit + deposit * 0.07;
            System.out.println("На " + i + "-й месяц наберётся " + (int) deposit + " рублей");
            if (i % 10 == 0) {
                System.out.println(""); //для удобства разбивает каждую 10 строку
            }
        }

        //Задача 5
        System.out.println("\nЗадача 5");
        deposit = 15000;
        month = 0;
        year = 0;
        System.out.println("Прогноз накопления 12млн рублей за каждые полгода:\n");
        while (deposit < 12_000_000) {
            deposit = deposit + deposit * 0.07;
            month++;
            if (month % 6 == 0) {
                System.out.println(month + " месяц: " + (int) deposit + " рублей");
            } else if (deposit >= 12_000_000) {
                System.out.println(month + " месяц: " + (int) deposit + " рублей - целевой результат");
            }
        }

        //Задача 6
        System.out.println("\nЗадача 6");
        deposit = 15000;
        month = 9 * 12; //108
        for (i = 1; i <= month; i++) {
            deposit = deposit + deposit * 0.07;
            if (i % 6 == 0) {
                System.out.println(i + " месяц. Накоплено: " + (int) deposit + " рублей.");
            }
        } //i = 109
        System.out.println("---------------------\nЗа 9 лет будет накоплено " + (int) deposit + " рублей.");

        //Задача 7
        System.out.println("\nЗадача 7");
        int friday = 2;
        int daysInThisMonth = 31;
        for (i = friday; i < daysInThisMonth; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }

        //Задача 8
        System.out.println("\nЗадача 8");
        int cometPeriod = 79;
        int today = 2024;
        int pastPeriod = today - 200;
        int futurePeriod = today + 100;
        for (i = 0; i <= futurePeriod; i += cometPeriod) {
            if (i >= pastPeriod) {
                System.out.println(i);
            }
        }
    }
}