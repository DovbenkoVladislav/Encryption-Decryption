// Posted from EduTools plugin
//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[8];
        int k = 0;
        while (k < 8) {
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