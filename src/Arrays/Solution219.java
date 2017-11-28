package Arrays;

import java.util.HashSet;
import java.util.Set;

public class Solution219 {
    /**
     * 求一个数组中是否有重复的数字，且两者的下标之差不超过k
     * @param nums
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(i>k)
                set.remove(nums[i-k-1]);
            if(!set.add(nums[i]))
                return true;
        }
        return false;

    }
}
