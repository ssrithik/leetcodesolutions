class Solution {
    public int countKDifference(int[] nums, int k) {
        int i,j;
        int c=0;
        for(i=0;i<nums.length;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
                if(Math.abs(nums[i]-nums[j])==k)
                {
                    c++;
                }

            }
        }
        return c;
    }
}