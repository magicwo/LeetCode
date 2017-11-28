package Arrays;

public class Solution35 {

    //思路：有序数组从头遍历，记录位置，当target的index在最后的时候，另类讨论
    public int searchInsert(int[] nums, int target) {
        if(nums.length==0){
            return 0;
        }
        int j=0;
        int i=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]>=target){
                j=i;
                break;
            }
        }
        if(i==nums.length){
            j=i;
        }

        return j;

    }
}
