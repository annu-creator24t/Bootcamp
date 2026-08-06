 public class CountEvenAndOddNumbersInAnArray {
    public static void main(String[] args) {
        int[] arr = {10, 15, 22, 37, 40, 51, 68};

        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even Count: " + evenCount);
        System.out.println("Odd Count: " + oddCount);
    }
}