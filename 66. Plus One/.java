class Solution {
    public int[] plusOne(int[] digits) {
int n=digits.length;
        int carry=1;
        for(int i=n-1;i>=0;i--){
            if(digits[i]+carry<=9){
                digits[i]=digits[i]+carry;
                carry=0;
                return digits; 
            }else{
                digits[i]=0;
                carry=1;
            }

        }
        int[] ans=new int[n+1];
        ans[0]=1;
        return ans;
      }
}
