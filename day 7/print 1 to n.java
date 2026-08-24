public class Main {

    static void printNumbers(int n,int i) {
        if (i > n) {
            return;
        }

        System.out.println(i);
        printNumbers(n, i + 1);
    }

    public static void main(String[] args) {
        printNumbers(5, 1);
    }
}