import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();

        String result = "Normal";
        if (H < A){
           result = "Deficiency";
        }else if (H > B){
            result = "Excess";
        }
        System.out.println(result);
    }
}