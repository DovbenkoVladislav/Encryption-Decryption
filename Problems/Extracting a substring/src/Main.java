import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();

        String result = "";
        for (int i = firstNum; i <= secondNum; i++) {
        result += myString.charAt(i);
        }
        System.out.println(result);
    }
}