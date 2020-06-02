// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int duration = scanner.nextInt();
        int foodCost = scanner.nextInt();
        int oneWayFlightCost = scanner.nextInt();
        int oneNightCost = scanner.nextInt();

        int result = foodCost * duration + oneWayFlightCost * 2 + oneNightCost * (duration - 1);
        System.out.println(result);
    }
}