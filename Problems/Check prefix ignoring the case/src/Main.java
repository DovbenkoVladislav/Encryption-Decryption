import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();
        boolean result = myString.toUpperCase().startsWith("J");
        System.out.println(result);
    }
}