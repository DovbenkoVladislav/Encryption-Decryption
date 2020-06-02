import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long M = scanner.nextLong();
        int i = 1;
        while (true){
            long f = factorial(i);
            if (f > M) break;
            else i++;
        }
        System.out.println(i);
    }

    public static long factorial(int i) {
        long result = 1;
        for (int j = 1; j <= i; j++) result *= j;
        return result;
    }
}