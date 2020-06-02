import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        String result = "NO";
        if ((A + B) > C && (A + C) > B && (B + C) > A) {
            result = "YES";
        }
        System.out.println(result);
    }
}