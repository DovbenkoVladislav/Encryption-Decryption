import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        int first = a/n;
        int second = b/n;

        int result = 0;
        //if (second > 0) result = second - first + 1;

        for (int i = a; i <= b; i++) {
        if (i%n == 0) result++;
        }
        System.out.println(result);

    }
}