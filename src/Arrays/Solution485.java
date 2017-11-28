package Arrays;

public class Solution485 {
    /**
     * 找到一串010101序列中连续的1的最大数量。
     * @param nums
     * @return
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int m=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                m++;
                if(m>max){
                    max=m;
                }
            }else{

                m=0;
            }
        }
        return max;

    }
}
