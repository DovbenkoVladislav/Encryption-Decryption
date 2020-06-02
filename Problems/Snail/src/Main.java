// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int days = 0;
        while (true){
            days++;
            H = H -A;
           if (H<=0)break;
           else H = H + B;

        }
        System.out.println(days);
    }
}