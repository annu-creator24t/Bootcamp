public class Solution {

    public static int majorityElement(int[] nums) {
        int cand = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                cand = nums[i];
            }
            if (nums[i] == cand) {
                count++;
            } else {
                count--;
            }
        }
        return cand;
    }

    // Main method to run your code
    public static void main(String[] args) {
        int[] param_1 = {2, 2, 1, 1, 1, 2, 2};
        int ret = majorityElement(param_1);
        System.out.println("Majority element is: " + ret);
    }
}
