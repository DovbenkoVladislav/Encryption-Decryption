// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int[4];
        String result = "";
        for (int i = 0; i < 4; i++){
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < 4; i++){
            if (i == numbers.length - 1){
                result = result + --numbers[i];
            } else result = result + --numbers[i] + " ";
        }
        System.out.println(result);
    }
}