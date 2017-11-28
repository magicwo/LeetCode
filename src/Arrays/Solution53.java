package Arrays;

public class Solution53 {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        dp[0]=nums[0];
        int max=dp[0];
        for(int i=1;i<n;i++){
            dp[i]=nums[i]+(dp[i-1]>0?dp[i-1]:0);
            if(dp[i]>max){
                max=dp[i];
            }

        }
        return max;

    }
//上面的方法用到了动态规划。但是空间复杂度要更高。
    public int maxSubArray2(int[] nums) {
        if(nums.length==0)
            return 0;
        int max=nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum<0)
                sum=nums[i];
            else
                sum+=nums[i];
            if(sum>max)
                max=sum;
        }
        return max;


    }
}
