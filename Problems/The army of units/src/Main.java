import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int units = scanner.nextInt();
        String result;
        if (units < 1) {
            result = "no army";
        } else if (units < 20) {
            result = "pack";
        } else if (units < 250) {
            result = "throng";
        } else if (units < 1000) {
            result = "zounds";
        } else {
            result = "legion";
        }
        System.out.println(result);
    }
}