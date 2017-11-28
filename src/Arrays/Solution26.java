package Arrays;

public class Solution26 {

    //此题的题意是在给定的已排序的数组中，去掉重复的数字，并且返回重整后的数组。
    //1 1 1 2 3 5 6 8
    //返回 1 2 3 5 6 8 长度为6
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int size=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[size]){
                nums[++size]=nums[i];
            }
        }
        size++;
        return size;
    }
}
