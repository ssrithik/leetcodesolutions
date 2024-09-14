class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] f = new int[nums.length];
        int p =1;
        int q=1;
        int i,j;
        for(i=0;i<nums.length;i++)
        {
            f[i] = p;
            p*=nums[i];
        }
       for(i = nums.length-1;i>=0;i--)
       {
       f[i]*=q;
       q*=nums[i];
       }
      
      return f;

        
    }
}