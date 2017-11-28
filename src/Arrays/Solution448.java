package Arrays;

import java.util.ArrayList;
import java.util.List;


//本题的解题思路：找出1-n中，没有在数组中出现过的数字，n为数组的总长度。要想办法将出现过的数字做个标记。一种办法就是将数字与下标关联。因为下标是从0-（n-1）。数字是从1-n.
// 所以只要数字x在数组中出现过，那么就将下标x-1对应的数字变成负数，来标记这个数字出现过。
class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
             int temp=Math.abs(nums[i])-1;
             if (nums[temp]>0)
                 nums[temp]=-nums[temp];
        }
        for (int i=0;i<nums.length;i++){
            if (nums[i]>0)
                list.add(i+1);
        }
        return list;

    }
}