package Arrays;

import java.util.HashMap;
import java.util.Map;

public class Solution532 {
    //n+n=2n，时间复杂度为O(n)
    //首先将数组中出现的值及其出现次数用一个HashMap进行统计，然后再拿来用
    public int findPairs(int[] nums, int k) {
        if (nums==null||nums.length==0||k<0)
        return 0;
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (k==0){
                if (entry.getValue()>=2){
                    count++;
                }
            }else {
                if (map.containsKey(entry.getKey()+k)){
                    count++;
                }

            }

        }
        return count;
    }
}
