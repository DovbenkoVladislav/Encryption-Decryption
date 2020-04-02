import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int[] classrooms = new int[3];
        int desks = 0;
        for (int i = 0; i < 3; i++) {
            classrooms[i] = scanner.nextInt();
            desks += classrooms[i] / 2;
            desks += classrooms[i] % 2;
        }
        System.out.println(desks);
    }
}