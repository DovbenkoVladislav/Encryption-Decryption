import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();


        for (int i = a; i <= b; i++) {
            String res = "" + i;
            if (i % 3 == 0 && i % 5 == 0) res = "FizzBuzz";
            else if (i % 3 == 0) res = "Fizz";
            else if (i % 5 == 0) res = "Buzz";
            System.out.println(res);
        }
    }
}