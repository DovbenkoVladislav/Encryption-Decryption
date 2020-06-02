import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHight = scanner.nextInt();
        int bridgeCount = scanner.nextInt();
        boolean sucsess = true;
        int brigeNumber = 0;
        for (int i = 1; i <= bridgeCount; i++) {
            int bridgeHight = scanner.nextInt();
            brigeNumber = i;
            if (bridgeHight <= busHight) {
                sucsess = false;
                break;
            }

        }
        if (sucsess) System.out.println("Will not crash");
        else System.out.println("Will crash on bridge " + brigeNumber);


    }
}