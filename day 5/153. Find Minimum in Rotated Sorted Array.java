class Solution {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("input array must be non-empty");
        }
        int left = 0, right = nums.length - 1;
        if (nums[left] <= nums[right]) return nums[left];

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else { 
                right = mid;
            }
        }
        return nums[left];
    }
}
