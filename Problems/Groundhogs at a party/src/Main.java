// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        boolean result;
        if (!isWeekend) result = cups>=10 && cups<=20;
        else result = cups>=15 && cups<=25;

        System.out.println(result);
    }
}