import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ticketNumber = scanner.next();
        char[] charsOfTicket = ticketNumber.toCharArray();
        int part1 = 0;
        int part2 = 0;

        for (int i = 0; i < 6; i++) {
           int num = Character.getNumericValue(charsOfTicket[i]);
            if (i<3) part1 += num;
            else part2 += num;
        }

        if (part1 == part2) System.out.println("Lucky");
        else System.out.println("Regular");
    }
}