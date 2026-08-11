public class Main {

    static void factorial(int n) {
        if (n ==0 || n == 1) {
            System.out.println(1);
            return;
        }

        System.out.println(n);
        factorial(n - 1);
    }

    public static void main(String[] args) {
        factorial(5);
    }
}