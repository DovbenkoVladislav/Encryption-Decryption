import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myString1 = scanner.nextLine();
        String myString2 = scanner.nextLine();

        System.out.println(myString1.trim().replace(" ","").length() == myString2.trim().replace(" ","").length());
    }
}