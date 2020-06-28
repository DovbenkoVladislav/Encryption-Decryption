import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String website = scanner.nextLine();
        String password = "";

        String[] parts1 = website.split(".html?");
        if (parts1.length > 1) {
            if (parts1[1].startsWith("?")){
                parts1[1] = parts1[1].substring(1);
            }
            String[] parts2 = parts1[1].split("&");
            for (int i = 0; i < parts2.length; i++) {

                String[] parts3 = parts2[i].split("=");
                if (parts3[0].equals("pass")&&parts3.length > 1) password = parts3[1];
                String res = parts3[0] + " : ";
                if (parts3.length > 1){
                    res += parts3[1];
                }else res += "not found";
                System.out.println(res);
            }
            if (!password.isEmpty()) System.out.println("password : " + password);
        }


    }
}