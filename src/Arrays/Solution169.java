package Arrays;

import java.util.HashMap;

public class Solution169 {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            if (map.get(nums[i]) > n / 2)
                return nums[i];

        }
        return 0;
        //最优解如下
//        Arrays.sort(nums);
//        return nums[nums.length/2];

    }
}
