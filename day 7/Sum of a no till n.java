public class Main {

    static void sum(int n, int i, int total) {

        if (i > n) {
            System.out.println(total);
            return;
        }

        sum(n, i + 1, total + i);
    }

    public static void main(String[] args) {
        sum(5, 1, 0);
    }
}