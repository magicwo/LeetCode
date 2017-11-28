package Arrays;

import java.util.HashSet;
import java.util.Set;

public class Solution217 {

    //第一种方法：HashSet是一种没有重复元素的无序集合

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i : nums) {
            if (!set.add(i)) {
                return true;
            }
        }
        return false;
    }

}
