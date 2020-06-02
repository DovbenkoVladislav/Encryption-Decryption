// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number100 = number/100;
        number -= 100*number100;
        int number10 = number/10;
        number -= 10*number10;

        int resultat = number*100 + number10 * 10 + number100;
        System.out.println(resultat);
    }
}