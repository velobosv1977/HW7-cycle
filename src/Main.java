//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Задача 1. Рсчёт накоплений через цикл while");
        int dreamSum = 2_459_000;
        int vklad = 15_000;
        int sum = 0;
        int month = 0;
        while (sum < dreamSum) {
            sum += vklad;
            sum = sum + 12*sum / 100; // в чём ошибка? По условию 12% годовых или 1% в месяц. В разборе такие же значения сумм
            month++;
            System.out.println("Месяц " + month + " сумма накоплени равна " + sum + " рублей");
        }
        //Task 2
        System.out.println();
        System.out.println("Задача 2. Ряды 1-10, 10-1");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + "  ");
        }
        //Task 3
        System.out.println();
        System.out.println("Задача 3. Прирост населения");
        int Y = 12_000_000;
        int peopleBornPerTh = 17;
        int peopleDiedPerTh = 8;
        int initialYear = 2024;
        for (int year = initialYear; year < initialYear + 10; year++) {
            Y += Y * (peopleBornPerTh - peopleDiedPerTh) / 1000;
            System.out.println("Год " + year + " численность населения составляет " + Y);
        }
        //Task 4.
        System.out.println();
        System.out.println("Задача 4. Накопления Василия");
        dreamSum = 12_000_000;
        sum = vklad;
        month = 0;
        while (sum < dreamSum) {
            sum = sum + 7 * sum / 100;
            month++;
            System.out.println("Месяц " + month + " сумма накоплени равна " + sum + " рублей");
        }
        //Task 5.
        System.out.println();
        System.out.println("Задача 5. Накопления Василия каждый 6-й месяц");
        sum = vklad;
        month = 0;
        while (sum < dreamSum) {
            sum = sum + 7 * sum / 100;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплени равна " + sum + " рублей");
            }
        }
        //Task 6.
        System.out.println();
        System.out.println("Задача 6. Накопления Василия каждые полгода в течение 9 лет");
        sum = vklad;
        month = 0;
        int months = 12 * 9;
        while (month < months) {
            sum = sum + 7 * sum / 100;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплени равна " + sum + " рублей");
            }
        }
        //Task 7.
        System.out.println();
        System.out.println("Задача 7. Отчётный день");
        int firstFriday = 7;
        int monthDays = 31;
        for (int day = firstFriday; day <= monthDays; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчёт");
        }
        //Task 8.
        System.out.println();
        System.out.println("Задача 8. Проход кометы");
        int periodComet = 79;
        int startYearComet = 0;
        int currentYear = 2024;
        int start = currentYear - 200;
        int stop = currentYear + 100;
        for (int year=startYearComet; year<stop; year += periodComet) {
            if (year>start) {
                System.out.println(year);
            }
        }
    }
}
