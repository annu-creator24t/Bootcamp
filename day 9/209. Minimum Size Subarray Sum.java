class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int currentSum = 0; 
        int minLenWindow = Integer.MAX_VALUE;

        for (int high = 0; high < nums.length; high++) {
            currentSum += nums[high];

            while (currentSum >= target) {
                int currentWindow = high - low + 1;
                minLenWindow = Math.min(minLenWindow, currentWindow);
                currentSum -= nums[low];
                low++;
            }
        }

        return minLenWindow == Integer.MAX_VALUE ? 0 : minLenWindow;
    }
}
