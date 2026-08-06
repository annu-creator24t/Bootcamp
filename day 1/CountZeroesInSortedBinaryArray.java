public class CountZeroesInSortedBinaryArray {

    public static int countZeroes(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int firstZero = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == 0) {
                firstZero = mid;      
                high = mid - 1;       
            } else {
                low = mid + 1;       
            }
        }

        return (firstZero == -1) ? 0 : n - firstZero;
    }

  