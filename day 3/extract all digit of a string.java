import java.util.Scanner;

public class ExtractAllDigitsOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String digits = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                digits += ch;
            }
        }

        System.out.println("Extracted Digits: " + digits);
    }
}