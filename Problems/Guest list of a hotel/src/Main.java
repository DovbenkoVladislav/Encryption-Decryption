//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        int lenght = 8;
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[lenght];
        int k = 0;
        while (k < lenght) {
            names[k] = scanner.next();
            k++;
        }
        k--;
        while (k >= 0) {
            System.out.println(names[k]);
            k--;
        }

    }
}