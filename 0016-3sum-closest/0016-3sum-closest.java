class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int maxsum = Integer.MAX_VALUE;
        int csum = 0;
        int i,j,k;
        for(i=0;i<nums.length;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
                for(k=j+1;k<nums.length;k++)
                {
                   csum = nums[i]+nums[j]+nums[k];
                   if(Math.abs(csum-target) < Math.abs(maxsum-target))
                   {
                    maxsum = csum;
                   }
                }
            }
        }
        return maxsum;
    }
}