import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int part1 = num / 1000;
        num -= part1 * 1000;
        int part2 = num / 100;
        num -= part2 * 100;
        int part3 = num / 10;
        int part4 = num - part3 * 10;

        int result = 37;
        if ((part1 * 10 + part2) == (part4 * 10 + part3)) {
            result = 1;
        }
        System.out.println(result);
    }
}