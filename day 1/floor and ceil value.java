public class CountZeroes {

    public static void findFloorAndCeil(int[] arr, int target) {
        int floor = -1;
        int ceil = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= target) {
                floor = arr[i];
            }

            if (arr[i] >= target && ceil == -1) {
                ceil = arr[i];
            }
        }

        System.out.println("Floor = " + floor);
        System.out.println("Ceil = " + ceil);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 10};
        int target = 5;

        findFloorAndCeil(arr, target);
    }
}