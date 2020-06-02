import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int value = 0;
        do {
            value = scanner.nextInt();
            if (value == 0) break;
            i += value;
        } while (true);
        System.out.println(i);
    }
}