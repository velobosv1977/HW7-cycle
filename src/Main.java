//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Цикл while");
        int i = 7;
        while (i < 9) {
            System.out.println(i);
            i++;
        }
        System.out.println("Цикл do-while");
        int k = 7;
        do {
            System.out.println(k);
            k++;
        } while (k < 9);
        //continue
        for (int dayNumber = 1; dayNumber <= 31; dayNumber++) {
            if (dayNumber % 3 == 0) {
                System.out.println("День отдыха");
                continue;
            }
            System.out.println("Рабочий день");
        }
    }
}

