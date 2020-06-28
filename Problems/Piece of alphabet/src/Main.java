import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char[] charsFromWord = word.toCharArray();
        boolean res = true;
        char charAlf = charsFromWord[0];
        for (int i = 1; i < charsFromWord.length; i++) {
           if (charsFromWord[i] != charAlf + i){
               res = false;
               break;
           }
        }
        System.out.println(res);
    }
}