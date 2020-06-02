import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        String result = "NO";
        if (((K % M == 0)||(K % N == 0)) && (M * N > K)) {
            result = "YES";
        }
        System.out.println(result);
    }
}