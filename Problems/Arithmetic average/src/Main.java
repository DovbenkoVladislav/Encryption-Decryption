import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double sum = 0;
        int n = 0;
        double res = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum += i;
                n++;
            }
        }

        if (n > 0) res = sum / n;
        System.out.println(res);
    }
}