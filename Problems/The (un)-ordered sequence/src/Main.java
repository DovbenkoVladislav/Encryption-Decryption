import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        boolean isOrdered = true;
        int orderDirection = 0;
        int etalon = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int value = scanner.nextInt();
            if (value == 0) break;
            if (etalon == 0) {
                etalon = value;
                continue;
            }
            if (etalon > value && orderDirection == 0) orderDirection = 1;
            else if (etalon < value && orderDirection == 0) orderDirection = 2;
            else if (etalon > value && orderDirection == 2 || etalon < value && orderDirection == 1) {
                isOrdered = false;
                break;
            }
            etalon = value;
        }
        System.out.println(isOrdered);
    }
}