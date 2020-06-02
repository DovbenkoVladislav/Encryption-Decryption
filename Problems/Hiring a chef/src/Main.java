// Posted from EduTools plugin
//put imports you need here

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

        System.out.println("The form for " + names[0] + " is completed. We will contact you if we need a chef that cooks " + names[4] + " dishes.");

    }
}