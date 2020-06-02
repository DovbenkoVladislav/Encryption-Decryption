import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        sentence = sentence.toUpperCase();
        int res = -1;
        for (int i = 0; i < sentence.length()-2; i++) {
           String part = "" + sentence.charAt(i) + sentence.charAt(i + 1)  + sentence.charAt(i + 2);
           if (part.equals("THE")){
               res = i;
               break;
           }
        }
        System.out.println(res);
    }
}