import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int lenght = 5;
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[lenght];
        int k = 0;
        while (k < lenght) {
            names[k] = scanner.next();
            k++;
        }

        for (String word: names
             ) {
            System.out.println(word);
        }

    }
}