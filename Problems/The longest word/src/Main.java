import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int maxLenght = -1;
        String result = "";
        String[] words = sentence.split(" ");
        for (String word: words
             ) {
         int wordLength = word.length();
         if (maxLenght < wordLength){
             maxLenght = wordLength;
             result = word;
         }
        }
        System.out.println(result);
    }
}