import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double M = scanner.nextDouble();
        Double P = scanner.nextDouble();
        Double K = scanner.nextDouble();
        int Y = 0;
        while (K > M){
            M += M * P / 100;
            Y++;
        }
        System.out.println(Y);
    }
}