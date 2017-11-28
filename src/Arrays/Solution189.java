package Arrays;

/**
 * Rotate an array of n elements to the right by k steps.
 * <p>
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * <p>
 * Note:
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 * <p>
 * [show hint]
 * <p>
 * Related problem: Reverse Words in a String II
 * <p>
 * Credits:
 * Special thanks to @Freezen for adding this problem and creating all Test cases.
 */

public class Solution189 {
//    第一种：新建一个数组用来存储一份拷贝，空间复杂度为O(n)
    public void rotate(int[] nums, int k) {
        if (nums.length <= 1)
            return;
        k = k % nums.length;
        int[] numsCopy = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsCopy[i] = nums[i];
        }
        for (int j = 0; j < nums.length; j++) {
            nums[j] = numsCopy[(j - k + nums.length) % nums.length];
        }

    }

    //第二种：前nums.length-k个数字反转，后k个数字反转，然后再整个数组反转就得到想要的
    public void rotate2(int[] nums, int k) {
        if(nums.length<2){
            return;
        }
        k=k%nums.length;
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);


    }
    private void reverse(int[] nums,int start,int end){
        int temp;
        while(start<end){
            temp=nums[end];
            nums[end]=nums[start];
            nums[start]=temp;
            start++;
            end--;
        }


    }


}
