import java.util.Scanner;

public class MultiplicationOfANumber {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter a number:");

       int num = sc.nextInt();
       int result = multiplyByTwo(num);
       System.out.println("Result: " + result);
    }

    public static int multiplyByTwo(int n) {
        return n * 2;
    }
}