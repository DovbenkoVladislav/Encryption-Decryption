import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String result = "NO";
        if (num > 0){
            result = "YES";
        }
        System.out.println(result);
    }
}