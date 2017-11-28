package Arrays;

public class Solution66 {
    public int[] plusOne(int[] digits) {
        int carry=1;
        int i;
        for( i=digits.length-1;i>=0;i--)
        {
            digits[i]+=carry;
            carry=0;
            if(digits[i]>=10){
                digits[i]=digits[i]%10;
                carry=1;
            }
        }
        if(carry==1){
            int n=digits.length+1;
            int[] m=new int[n];
            m[0]=1;

            return m;
        }
        return digits;
    }

}
