package Arrays;

/**
 * 414. Third Maximum Number
 */
public class Solution414 {
    public int thirdMax(int[] nums) {
        int[] a= new int[3];
        a[0] = Integer.MIN_VALUE;
        a[1] = Integer.MIN_VALUE;
        a[2] = Integer.MIN_VALUE;
        int flag=0;
        int flag2=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==Integer.MIN_VALUE){
                flag2=1;
            }
           if (nums[i]>a[0]) {
               a[2] = a[1];
               a[1] = a[0];
               a[0] = nums[i];
               flag++;
           }else if (nums[i]>a[1]&&nums[i]<a[0]){
               a[2] = a[1];
               a[1] = nums[i];
               flag++;

           }else if (nums[i]>a[2]&&nums[i]<a[1]){
               a[2] = nums[i];
               flag++;
           }
        }
        if ((flag+flag2) > 2){
            return  a[2];
        }
        else {
            return a[0];
        }
    }

}
