class Solution {
    public int maxProduct(int[] nums) {
        int i,j;
        int max=0;
        int res=0;
        for(i=0;i<nums.length;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
               res = (nums[i]-1)*(nums[j]-1);
               if(res>max)
               {
                max=res;
               }

            }
        }
        return max;
    }
}