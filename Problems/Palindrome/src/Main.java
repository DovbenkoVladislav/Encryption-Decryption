import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char[] sharsFromWord = word.toCharArray();
        String drow = "";
        for (int i = sharsFromWord.length - 1; i>=0; i--) {
            drow += sharsFromWord[i];
        }
        if (word.equals(drow)) System.out.println("yes");
        else System.out.println("no");

    }
}