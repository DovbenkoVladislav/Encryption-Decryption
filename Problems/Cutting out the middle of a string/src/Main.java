import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int length = word.length();
        String res = "";
        char [] charsFromString = word.toCharArray();
        for (int i = 0; i < charsFromString.length; i++) {
            if (length % 2 != 0 && i == length / 2
                    || length % 2 == 0 && (i == length / 2
                        || i == length / 2 - 1)) continue;
            res += "" + charsFromString[i];
        }

        System.out.println(res);
    }
}