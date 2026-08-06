import java.util.Scanner;

public class RemoveSpacesAndConvertToLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        str = str.replace(" ", "").toLowerCase();

        System.out.println("Result: " + str);
    }
}