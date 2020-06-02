import java.text.DecimalFormat;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat myFormater = new DecimalFormat();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double product = 1;

        for (int i = a; i < b; i++) {
            product *= i;
        }
        //System.out.println(product);
        System.out.format("%10.0f", product);

    }
}