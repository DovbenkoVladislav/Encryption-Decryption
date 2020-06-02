// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();
        int number100 = number/100;
        number -= 100*number100;
        int number10 = number/10;
        number -= 10*number10;
        System.out.println(number + number10 + number100);
    }
}