import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);   

        int currentSum = 0;
        int count = 0;

        for(int num : nums) {

            currentSum += num;

            int need = currentSum - k;

            if(map.containsKey(need)) {
                count += map.get(need);
            }

            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
}
