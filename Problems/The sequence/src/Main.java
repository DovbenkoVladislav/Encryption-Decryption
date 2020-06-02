import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        int result = 0;
        while (i <= n) {
            int num = scanner.nextInt();
            if (num % 4 == 0 && num > result) result = num;
            i++;
        }
        System.out.println(result);
    }
}