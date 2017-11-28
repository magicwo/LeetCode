package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Solution442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n=nums.length;

        for (int i = 0; i < n; i++) {
            int temp = (nums[i] - 1) % n;
            nums[temp] += n;
        }
        for (int i=0;i<n;i++){
            if (((nums[i]-1)/n)==2){
                list.add(i+1);
            }
        }

        return list;
    }


}
