import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();
        System.out.println(myString.endsWith("burg"));
    }
}