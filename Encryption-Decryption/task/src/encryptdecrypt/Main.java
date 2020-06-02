package encryptdecrypt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static String CHARS_TO_ENCRYPT = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String inptMessage = in.nextLine();
        int key = in.nextInt();

        System.out.println(encrypt(inptMessage, key));
        in.close();

    }

    private static String encrypt(String message, int key) {
        String result = "";
        char[] baseEncrypt = CHARS_TO_ENCRYPT.toCharArray();
        char[] chars = message.toCharArray();
        //System.out.println(chars);
        ArrayList listOfChars = new ArrayList();
        for (char charOfMessage : baseEncrypt) {
            listOfChars.add(charOfMessage);
        }
        for (char c : chars
        ) {
            int index = listOfChars.indexOf(c);
            if (index >= 0) {
                int newIndex = index + key;
                int maxIndex = listOfChars.size()-1;
                if (newIndex > maxIndex){ newIndex = newIndex - maxIndex - 1;}
                result = result + listOfChars.get(newIndex);
            } else result = result + c;

        }
        return result;
    }
}
